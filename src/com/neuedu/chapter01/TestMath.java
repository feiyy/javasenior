package com.neuedu.chapter01;

import java.util.Arrays;
import java.util.Random;

public class TestMath {

	public static void main(String[] args) {
	
		//1. ˫ɫ��
		//1.1 ��6������ 1-33
		int[] redballs = new int[6];
		int index = 0;
		Random r = new Random();
		while(index<6)
		{			
			//1. ����1-33�������
			//int num = (int)Math.floor(Math.random()*33 + 1);
			int num = r.nextInt(33)+1;//0-32
			//2. �ж��Ƿ����
			if(!isExists(redballs,num))
			{
				redballs[index++] = num;
			}			
		}
		//1.2 ��1������ 1-16
		int bluenum = (int)Math.floor(Math.random()*16+1);
		
		//1.3 sort the array
		Arrays.sort(redballs);
		
		//1.4 ��ӡ���
		System.out.println("����");
		for(int item :redballs)
		{
			System.out.print(item+"\t");
		}
		System.out.println();
		System.out.println("����");
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
		//2. �齱
		//1. ����һ�����飬������ arr[10]
		String[] names = {"��һ","����","����","����","����","����","����","���","����","��ʮ"};
		//2. ������ɵ��±� 0-9   Math.floor(Math.random()*10)
		int index = (int)Math.floor(Math.random()*10);
		//3. ���±��Ӧ�����ó��������н��ˡ�
		System.out.println(names[index]);
	}

}
