package com.iu.java.util;

import java.util.ArrayList;

public class Collection_ArrayList_3 {
	
	public void test(ArrayList ar) {
		//참조변수명 instanceOf 클래스명
		//String s ="1";
		//System.out.println(s instanceof String);
		
		
		if(ar.get(0) instanceof String) {
			String s = (String)ar.get(0);
		}else if(ar.get(0) instanceof Integer) {
			int n = (int)ar.get(0);
		}
	}

}
