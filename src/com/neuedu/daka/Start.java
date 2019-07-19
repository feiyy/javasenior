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
		System.out.println("������Ա�����");
		int empid = sc.nextInt();
		Employee e = c.getEmployeeById(empid);
		if(e==null)
		{
			System.out.println("Ա��������");
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
					 System.out.println("�����Ѿ�ǩ����");
					 break;
				 }
			 }
			 
			 //how to decide employee is already checkin
			 if(!isFound) //��ͬ��isFound==false
			 {
				 //checkin
				 Daka daka = new Daka();
			     daka.setE(e);
			     daka.setCheckin(now);
			     
			     list.add(daka);	
			     System.out.println("ǩ���ɹ�");
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
		     System.out.println("ǩ���ɹ�");
		}
		
		//�����ļ���
		//map -> json
		String str = JSON.toJSONString(map);
		//�õ��ļ�,���������
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
		//1. û��ǩ��������ǩ�ˣ������ظ�ǩ�ˡ�
		//1. get user input of empid
		System.out.println("������Ա�����");
		int empid = sc.nextInt();
		Employee e = c.getEmployeeById(empid);
		if(e==null)
		{
			System.out.println("Ա��������");
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
					 //�ҵ��ˣ�ǩ��
					 if(item.getCheckout() == null)
					 {
						 item.setCheckout(now);
						 System.out.println("ǩ�˳ɹ�");
					 }
					 else
					 {
						 System.out.println("�Ѿ�ǩ�˹������ܶ���ǩ��");
					 }
					 break;
				 }
			 }
			
			//
			if(!isFound)
			{
				 System.out.println("���컹û��ǩ��������ǩ��");
			}
		}
		else
		{
			System.out.println("���컹û��ǩ����Ϣ���޷�ǩ��");
		}
		
		//�����ļ���
		//map -> json
		String str = JSON.toJSONString(map);
		//�õ��ļ�,���������
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
			System.out.println("���컹û�д���Ϣ");
		}
		
	}

	public static void main(String[] args) {
		
		c = new Company(); //�˿̣�company���Ѿ�������Ա��
			
		boolean flag = true;
		while(flag)
		{
			System.out.println("----Ա����ϵͳ----");
			System.out.println("���� 0--------�˳�");
			System.out.println("���� 1--------ǩ��");
			System.out.println("���� 2--------ǩ��");
			System.out.println("���� 3--------�鿴ǩ����Ϣ");
			
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
				System.out.println("������0-3�ı��");
			}			
		}
	}
}
