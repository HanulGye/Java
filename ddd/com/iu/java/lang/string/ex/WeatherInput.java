package com.iu.java.lang.string.ex;

import java.util.Scanner;

public class WeatherInput {
	private Scanner sc;
	
	public WeatherInput() {
		sc = new Scanner(System.in);
	}
	
	public Weather search(Weather [] ws) {
		Weather w = null;
		System.out.println("도시명을 입력");
		String name = sc.next();
		
		for(int i=0;i<ws.length;i++) {
			if(name.equals(ws[i].getCity())) {
				w = ws[i];
				break;
			}
		}
		
		
		return w;
	}

}
