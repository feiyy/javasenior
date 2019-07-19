package com.neuedu.daka;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSON;
import com.neuedu.chapter03.TestJson;

import java.util.Scanner;
import java.util.Set;

public class Start {
	
	private static Scanner sc = new Scanner(System.in);
	private static Company c;
	
	public static void checkin()
	{
		//1. get user input of empid
		System.out.println("请输入员工编号");
		int empid = sc.nextInt();
		Employee e = c.getEmployeeById(empid);
		if(e==null)
		{
			System.out.println("员工不存在");
			return;
		}
		
		//2. get current date, extract yyyy-MM-dd 
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String key = sdf.format(now);
		
		Map<String, List<Daka>> map = c.getDakaInfo();
		//3. check if today has daka info
		if(map.containsKey(key))
		{
			 //3.2 loop for List<Daka>, check if empid already exists
			 List<Daka> list = map.get(key);
			 boolean isFound = false;
			 for(Daka item :list)
			 {
				 if(item.getE().getId()== e.getId())
				 {
					 isFound = true;
					 System.out.println("今天已经签到过");
					 break;
				 }
			 }
			 
			 //how to decide employee is already checkin
			 if(!isFound) //等同于isFound==false
			 {
				 //checkin
				 Daka daka = new Daka();
			     daka.setE(e);
			     daka.setCheckin(now);
			     
			     list.add(daka);	
			     System.out.println("签到成功");
			 }
			
		}
		else
		{
			 //3.1 no daka info, create daka instance, create ArrayList, put daka instance inside, put in map
		     Daka daka = new Daka();
		     daka.setE(e);
		     daka.setCheckin(now);	
		     
		     List<Daka> list = new ArrayList<>();
		     list.add(daka);
		     
		     map.put(key, list);
		     System.out.println("签到成功");
		}
		
		//更新文件，
		//map -> json
		String str = JSON.toJSONString(map);
		//得到文件,构建输出流
		File f = new File(TestJson.class.getClassLoader().getResource("daka.data").getPath());
		try {
			FileWriter w = new FileWriter(f);
			w.write(str);
			w.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 
	}
	
	public static void checkout()
	{
		//1. 没有签到，不能签退，不能重复签退。
		//1. get user input of empid
		System.out.println("请输入员工编号");
		int empid = sc.nextInt();
		Employee e = c.getEmployeeById(empid);
		if(e==null)
		{
			System.out.println("员工不存在");
			return;
		}
		
		//2. get current date, extract yyyy-MM-dd 
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String key = sdf.format(now);
		
		Map<String, List<Daka>> map = c.getDakaInfo();
		if(map.containsKey(key))
		{
			List<Daka> list = map.get(key);
			boolean isFound = false;
			for(Daka item :list)
			{
				 if(item.getE().getId()== e.getId())
				 {
					 isFound = true;
					 //找到了，签退
					 if(item.getCheckout() == null)
					 {
						 item.setCheckout(now);
						 System.out.println("签退成功");
					 }
					 else
					 {
						 System.out.println("已经签退过，不能二次签退");
					 }
					 break;
				 }
			 }
			
			//
			if(!isFound)
			{
				 System.out.println("今天还没有签到，不能签退");
			}
		}
		else
		{
			System.out.println("今天还没有签到信息，无法签退");
		}
		
		//更新文件，
		//map -> json
		String str = JSON.toJSONString(map);
		//得到文件,构建输出流
		File f = new File(TestJson.class.getClassLoader().getResource("daka.data").getPath());
		try {
			FileWriter w = new FileWriter(f);
			w.write(str);
			w.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public static void showinfo()
	{
		//see today's employee checkin info 
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String key = sdf.format(now);
		
		Map<String, List<Daka>> map = c.getDakaInfo();
		if(map.containsKey(key))
		{
			//loop for map
			List<Daka> list = map.get(key);
			for(Daka item :list)
			{
				System.out.println(item.getE().getId()+"\t"+item.getE().getName()+"\t"+item.getCheckin() +"\t"+item.getCheckout());
			}			
		}
		else
		{
			System.out.println("今天还没有打卡信息");
		}
		
	}

	public static void main(String[] args) {
		
		c = new Company(); //此刻，company里已经有三个员工
			
		boolean flag = true;
		while(flag)
		{
			System.out.println("----员工打卡系统----");
			System.out.println("输入 0--------退出");
			System.out.println("输入 1--------签到");
			System.out.println("输入 2--------签退");
			System.out.println("输入 3--------查看签到信息");
			
			try
			{			
				int num = sc.nextInt();

				//switch num
				switch(num)
				{
				case 0:
					flag = false;
					break;
				case 1:
					checkin();
					break;
				case 2:
					checkout();
					break;
				case 3:
					showinfo();
					break;
				default:
					throw new InputMismatchException();					
				}
				
			}
			catch(InputMismatchException e)
			{
				sc = new Scanner(System.in);
				System.out.println("请输入0-3的编号");
			}			
		}
	}
}
