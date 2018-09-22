package com.iu.java.util;

import java.util.StringTokenizer;

import com.iu.java.lang.string.ex.Weather;

public class Token_2 {

	public static void main(String[] args) {
		String info="";
		info="seoul,17,80,맑음,";
		info=info+"incheon,-32,10,태풍,";
		info=info+"busan,100,100,지옥,";
		info=info+"daegue,0,25,눈";
		
		Weather [] ar = new Weather[4];
		
		int i=0;
		
		StringTokenizer st = new StringTokenizer(info, ",");
		
		while(st.hasMoreTokens()) {
			Weather w = new Weather();
			w.setCity(st.nextToken());
			w.setTemp(st.nextToken());
			w.setHumidity(st.nextToken());
			w.setCondition(st.nextToken());
			ar[i]=w;
			i++;
		}
		
		

	}

}
