package com.neuedu.chapter05;

public class TestLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter l = new Letter();
		
		UpperCaseLetter ucl = new UpperCaseLetter(l);
		LowerCaseLetter lcl = new LowerCaseLetter(l);
		
		ucl.start();	
		lcl.start();

	}

}

class Letter{
	
	public void printUppercase()
	{
		for(int i=0; i<26;i++)
		{
			System.out.println((char)('A'+i));
			
			synchronized(this)
			{
				this.notify();
				try {
					this.wait(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void printLowercase()
	{
		for(int i=0; i<26;i++)
		{
			System.out.println((char)('a'+i));
			
			synchronized(this)
			{
				this.notify();
				try {
					this.wait(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class UpperCaseLetter extends Thread{
	
	Letter l = null;
	
	public UpperCaseLetter(Letter l)
	{
		this.l = l;
	}
	
	@Override
	public void run() {
		
		l.printUppercase();
	}
}

class LowerCaseLetter extends Thread{
	
	Letter l = null;
	
	public LowerCaseLetter(Letter l)
	{
		this.l = l;
	}
	
	@Override
	public void run() {
		
		l.printLowercase();
	}
}

