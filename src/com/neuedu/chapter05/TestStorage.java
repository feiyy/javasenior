package com.neuedu.chapter05;

public class TestStorage {

	public static void main(String[] args) {
		
		Storage storage = new Storage();
		
		Producer p = new Producer(storage);
		Consumer c = new Consumer(storage);
		
		//三个线程运行生产
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		//三个线程运行消费
		Thread t4 = new Thread(c);
		Thread t5 = new Thread(c);
		Thread t6 = new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}

}
