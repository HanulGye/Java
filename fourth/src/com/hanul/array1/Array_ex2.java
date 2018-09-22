package com.hanul.array1;

public class Array_ex2 {
	public static void main(String[] args) {

		//무작위의 배열을 작은 수 부터 큰 수순으로 정렬하시오.
		int temp = 0;
		int[] mazeru = {32,4,5,47,2,22,14};
		
		for(int i=0;i<mazeru.length;i++) {
			
			for(int j=i+1;j<mazeru.length;j++) {
				
				if(mazeru[i]>mazeru[j]) {
					temp = mazeru[i];
					mazeru[i] = mazeru[j];
					mazeru[j] = temp;
					
				}
				
				
			}
			System.out.print(mazeru[i]);
			if(i<mazeru.length-1) {
				System.out.print(",");
			}
		}
		
		
		
		
	}
}
