package com.neuedu.chapter05;

import java.util.ArrayList;
import java.util.List;

public class Storage {
	
	private final int MAX_SIZE = 10;
	private List<Object> list = new ArrayList<>();
	
	public void produce()
	{
		synchronized(list)
		{
			while(list.size()>=MAX_SIZE)
			{
				//满了
				try {
					list.wait();//释放锁 在list的waiting pool中等待
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			list.add(new Object());
			System.out.println("【生产者" + Thread.currentThread().getName()
	                    + "】生产一个产品，现库存" + list.size());
			
			//唤醒list waiting pool中的一个线程
			list.notifyAll();
		}
	}
	
	
	public void consume()
	{
		synchronized(list)
		{
			while(list.size()==0)
			{
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			list.remove(0);
			System.out.println("【消费者" + Thread.currentThread().getName()
	                    + "】消费一个产品，现库存" + list.size());
			
			//唤醒list对象等待池中的一个线程
			list.notifyAll();			
		}
	}

}
