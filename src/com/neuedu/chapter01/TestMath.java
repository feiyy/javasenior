package com.neuedu.chapter01;

import java.util.Arrays;
import java.util.Random;

public class TestMath {

	public static void main(String[] args) {
	
		//1. 双色球
		//1.1 抽6个红球 1-33
		int[] redballs = new int[6];
		int index = 0;
		Random r = new Random();
		while(index<6)
		{			
			//1. 生成1-33的随机数
			//int num = (int)Math.floor(Math.random()*33 + 1);
			int num = r.nextInt(33)+1;//0-32
			//2. 判断是否存在
			if(!isExists(redballs,num))
			{
				redballs[index++] = num;
			}			
		}
		//1.2 抽1个篮球 1-16
		int bluenum = (int)Math.floor(Math.random()*16+1);
		
		//1.3 sort the array
		Arrays.sort(redballs);
		
		//1.4 打印结果
		System.out.println("红球");
		for(int item :redballs)
		{
			System.out.print(item+"\t");
		}
		System.out.println();
		System.out.println("蓝球");
		System.out.println(bluenum);
	}
	
	public static boolean isExists(int[] arr, int target)
	{
		for(int item:arr)
		{
			if(item == target)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void lottory()
	{
		//2. 抽奖
		//1. 创建一个数组，放人名 arr[10]
		String[] names = {"王一","王二","王三","王四","王五","王六","王七","田八","王九","王十"};
		//2. 随机生成的下标 0-9   Math.floor(Math.random()*10)
		int index = (int)Math.floor(Math.random()*10);
		//3. 把下标对应的人拿出来，就中奖了。
		System.out.println(names[index]);
	}

}
