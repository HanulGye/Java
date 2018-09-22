package com.iu.java.lang;

public class String_4_ex {
	public static void main(String[] args) {
		String s = "monster hunter world";
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(ch == 'r') {
				count++;
			}
		}
	
		System.out.println("r의 갯수 : "+count);
		//r 문자가 몇개 있습니까??
		
		s = "monster hunter world";
		
		count=0;
		int result=0;
		while(true) {
		
			count=s.indexOf('r', count);//6, 13, 17
			if(count != -1) {
				count++;
				result++;
			}else {
				break;
			}
		}
		System.out.println("r의 갯수 - "+result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
