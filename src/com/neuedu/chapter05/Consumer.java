package com.neuedu.chapter05;

public class Consumer implements Runnable{
	
	private Storage storage = null;
	
	public Consumer(Storage storage)
	{
		this.storage = storage;
	}

	@Override
	public void run() {
	
		while(true)
		{
			storage.consume();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
