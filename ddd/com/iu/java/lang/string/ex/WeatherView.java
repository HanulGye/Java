package com.iu.java.lang.string.ex;

public class WeatherView {
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(Weather w) {
		System.out.println("=====================");
		System.out.println("도시명 : "+w.getCity());
		System.out.println("기  온 : "+w.getTemp());
		System.out.println("습  도 : "+w.getHumidity());
		System.out.println("날  씨 : "+w.getCondition());
	}
	
	public void view(Weather [] ws) {
		
		for(int i=0;i<ws.length;i++) {
			/*Weather w =ws[i];
			this.view(w);*/
			this.view(ws[i]);
		}
		
	}

}
