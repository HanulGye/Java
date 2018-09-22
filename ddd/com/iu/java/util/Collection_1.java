package com.iu.java.util;

public class Collection_1 {

	public static void main(String[] args) {
		int [] ar = {1,2,3};
		
		int [] ar2 = new int[ar.length+1];
		
		for(int i=0;i<ar.length;i++) {
			ar2[i]=ar[i];
		}
		
		int [] ar3 = new int[ar.length-1];
		for(int i=0;i<ar3.length;i++) {
			ar3[i]=ar[i];
		}

	}

}
