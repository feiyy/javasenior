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
				System.out.println("���̴߳�ӡ:"+i);
				Thread.yield();//�ó�cpu
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
		//start����cpu,�߳̾������ȴ�cpu����
		td.start();
		
		for(int i = 0; i<1000;i++)
		{
			System.out.println("���̴߳�ӡ:"+i);
		}
		
		td.setFlag(false);

	}

}
