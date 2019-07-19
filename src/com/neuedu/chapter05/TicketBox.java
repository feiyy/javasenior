package com.neuedu.chapter05;

public class TicketBox implements Runnable{
	
	private int tickets = 500;
	
	@Override
	public void run() {
		
		//������˭�� ��ǰ����Ҳ��������Ķ���
		//��ʲôʱ�����ȥ�ģ�ʲôʱ���ͷŵģ�
		  //synchronzed��ʼ��ʱ�����ȥ��,synchonized������ʱ���ͷŵ�	
			while(tickets>0)
			{
				//setTicket();	
				synchronized(this)
				{
					if(tickets>0)
					{
						System.out.println(Thread.currentThread().getName()+"�����˵�"+(tickets)+"��Ʊ");
						tickets--;	
					}	
				}
			}						
	}
	
	//�ڷ�����дsynchronized,������this, ���ķ�Χ����������� 
	public synchronized void setTicket()
	{		
			if(tickets>0)
			{
				System.out.println(Thread.currentThread().getName()+"�����˵�"+(tickets)+"��Ʊ");
				tickets--;	
			}										
	}
	
	//��static������дsynchronized,�����ǵ�ǰ��(TicketBox.class), ���ķ�Χ�����������
	public synchronized static void setTicket2()
	{		
												
	}
	
	
	
	
	public static void main(String[] args) {
		
		TicketBox tb = new TicketBox();
		Thread t1 = new Thread(tb);
		Thread t2 = new Thread(tb);
		
		t1.start();
		t2.start();	
		
	}
	
	

}
