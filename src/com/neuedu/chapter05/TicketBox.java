package com.neuedu.chapter05;

public class TicketBox implements Runnable{
	
	private int tickets = 500;
	
	@Override
	public void run() {
		
		//锁的是谁？ 当前对象（也可以锁别的对象）
		//锁什么时候加上去的，什么时候释放的？
		  //synchronzed开始的时候加上去的,synchonized结束的时候释放的	
			while(tickets>0)
			{
				//setTicket();	
				synchronized(this)
				{
					if(tickets>0)
					{
						System.out.println(Thread.currentThread().getName()+"卖出了第"+(tickets)+"张票");
						tickets--;	
					}	
				}
			}						
	}
	
	//在方法上写synchronized,锁的是this, 锁的范围是整个代码块 
	public synchronized void setTicket()
	{		
			if(tickets>0)
			{
				System.out.println(Thread.currentThread().getName()+"卖出了第"+(tickets)+"张票");
				tickets--;	
			}										
	}
	
	//在static方法上写synchronized,锁的是当前类(TicketBox.class), 锁的范围是整个代码块
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
