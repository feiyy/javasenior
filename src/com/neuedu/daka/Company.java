package com.neuedu.daka;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.neuedu.chapter03.TestJson;

public class Company {
	
	private List<Employee> emps = new ArrayList<>();
	//Map<empid,List<Daka>> 
	private Map<String,List<Daka>> dakaInfo = null;

	public List<Employee> getEmps() {
		return emps;
	}

	public Map<String, List<Daka>> getDakaInfo() {
		return dakaInfo;
	}

	public Company()
	{
		/*emps.add(new Employee(1,"tom"));
		emps.add(new Employee(2,"jack"));
		emps.add(new Employee(3,"jerry"));	*/	
		
		//从文件中取
		File f = new File(TestJson.class.getClassLoader().getResource("emps.data").getPath());
		
		try {
			FileReader r = new FileReader(f);
			BufferedReader br = new BufferedReader(r);
			String str = br.readLine();
			//json str -> List<Employee>
			
			emps = JSON.parseArray(str, Employee.class);
			
			System.out.println(emps.size());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
       File f2 = new File(TestJson.class.getClassLoader().getResource("daka.data").getPath());//相对于src路径
		
		try {
			FileReader r = new FileReader(f2);
			BufferedReader br = new BufferedReader(r);
			String str = br.readLine();
			//json str -> List<Employee>
			
			dakaInfo = JSON.parseObject(str, new TypeReference<Map<String,List<Daka>>>(){});
			
			if(dakaInfo == null)
			{
				dakaInfo = new HashMap<>();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//add employee
	
	//remove employee
		
	//get employee by id
	public Employee getEmployeeById(int id)
	{
		for(Employee e :emps)
		{
			if(e.getId() == id)
			{
				return e;
			}
		}
		return null;
	}
	
}
