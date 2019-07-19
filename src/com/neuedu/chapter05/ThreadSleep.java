package com.neuedu.chapter05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep {

	public static void main(String[] args) {
		
		while(true)
		{
			//get current date
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
			
			String str = sdf.format(now);
			
			System.out.println(str);
			
			//等1秒
			try {
				Thread.sleep(1000); //哪个线程调用这句话，就让哪个线程睡1秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
