package com.neuedu.chapter02;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//����6��1-33�� ����1�� 1-16
		Set<Integer> redballs = new TreeSet<>();
		
		Random r = new Random();
		
		while(redballs.size()<6)
		{
			//1. ����1-33�������
			int num = r.nextInt(33)+1;
			//2. ��set
			redballs.add(num); //�Զ�����һ�߷�һ������
		}
		
	    //��������
		int blueball = r.nextInt(16)+1;
		
		//��ӡ����
		//set��ô���� Iterator, for-each, �ر�ע�⣬setû���±꣬������i
		Iterator<Integer> it = redballs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//print blue balls
		System.out.println(blueball);

	}

}
