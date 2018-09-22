package com.iu.java.lang.string.ex;

import java.util.Scanner;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherInfo wi = new WeatherInfo();
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		while(check) {
			System.out.println("1. 날씨정보초기화");
			System.out.println("2. 전국 날씨 출력");
			System.out.println("3. 지역 날씨 검색");
			//시간이 남았을때
			System.out.println("4. 지역 날씨 추가");
			System.out.println("5. 지역 날씨 수정");
			System.out.println("6. 지역 날씨 삭제                                                                                                                ");
			
			//
			System.out.println("4. 종          료");
			
			
		}
		
		
		wi.setWeather();
		
		

	}

}
