package com.iu.java.lang.string.ex;

import java.util.Scanner;

public class WeatherControl {
	private Scanner sc;
	private WeatherInfo wi;
	private WeatherView v;
	private WeatherInput wip;
	
	public WeatherControl() {
		wi = new WeatherInfo();
		sc = new Scanner(System.in);
		v = new WeatherView();
		wip = new WeatherInput();
	}
	
	public void start() {
		boolean check=true;
		Weather [] ws = null;
		while(check) {
			System.out.println("=================");
			System.out.println("1. 날씨정보초기화");
			System.out.println("2. 전국 날씨 출력");
			System.out.println("3. 지역 날씨 검색");
			System.out.println("7. 종          료");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				ws = wi.setWeather();
				break;
			case 2:
				v.view(ws);
				break;
			case 3:
				Weather weather = wip.search(ws);
				if(weather != null) {
					v.view(weather);
				}else {
					v.view("도시가 없거나 잘 못 입력 했습니다.");
				}
				break;

			default:
				System.out.println("프로그램을 종료 합니다");
				check = !check;
				break;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		WeatherControl w = new WeatherControl();
		w.start();
	}
	
	

}






