package com.neuedu.chapter05;

public class Producer implements Runnable{
	
	private Storage storage = null;
	
	public Producer(Storage storage)
	{
		this.storage = storage;
	}

	@Override
	public void run() {
	
		while(true)
		{
			storage.produce();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
