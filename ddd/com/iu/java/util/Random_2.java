package com.iu.java.util;

import java.util.Random;

public class Random_2 {

	public static void main(String[] args) {
		String menu="보쌈,컵라면,김치볶음밥,치킨마요,부대찌개,돈까스";
		String [] m = menu.split(",");
		Random random = new Random();
		int index = random.nextInt(6);
		System.out.println(m[index]);
		
		//로또번호 1~45 6개
		int [] n = new int [6];
		for(int i=0;i<n.length;i++) {
			n[i]=random.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(n[i]==n[j]) {
					i--;
					break;
				}
			}
			//n[0]: X
			//n[1]: n[0]
			//n[2]2: n[0],1,n[1],2
			//n[3]6: n[0]1,n[1]2,n[2]2
		}
		
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		

	}

}
