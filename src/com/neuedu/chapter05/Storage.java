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
				//����
				try {
					list.wait();//�ͷ��� ��list��waiting pool�еȴ�
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			list.add(new Object());
			System.out.println("��������" + Thread.currentThread().getName()
	                    + "������һ����Ʒ���ֿ��" + list.size());
			
			//����list waiting pool�е�һ���߳�
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
			System.out.println("��������" + Thread.currentThread().getName()
	                    + "������һ����Ʒ���ֿ��" + list.size());
			
			//����list����ȴ����е�һ���߳�
			list.notifyAll();			
		}
	}

}
