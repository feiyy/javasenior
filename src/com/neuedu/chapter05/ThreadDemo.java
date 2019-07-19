package com.neuedu.chapter05;

public class ThreadDemo extends Thread{
	
	private boolean flag = true;

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		
		for(int i = 0; i<1000;i++)
		{	
			if(flag)
			{
				System.out.println("子线程打印:"+i);
				Thread.yield();//让出cpu
			}
			else
			{
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		
		//create a thread instance
		ThreadDemo td = new ThreadDemo();
		//start告诉cpu,线程就绪，等待cpu调度
		td.start();
		
		for(int i = 0; i<1000;i++)
		{
			System.out.println("主线程打印:"+i);
		}
		
		td.setFlag(false);

	}

}
