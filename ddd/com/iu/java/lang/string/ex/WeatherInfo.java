package com.iu.java.lang.string.ex;

public class WeatherInfo {
	
	private String info;
	
	public WeatherInfo() {
		info="seoul,17,80,맑음,";
		info=info+"incheon,-32,10,태풍,";
		info=info+"busan,100,100,지옥,";
		info=info+"daegue,0,25,눈";
	}
	
	//setWeather
	//
	
	
	
	public Weather [] setWeather() {
		String [] in=info.split(",");
		//System.out.println(in.length);
		//System.out.println(in.length/4);
		Weather [] w = new Weather[in.length/4];
		int count=0;
		for(int i=0;i<in.length;i++) {
			Weather weather = new Weather();
			weather.setCity(in[i]);
			weather.setTemp(in[++i]);
			weather.setHumidity(in[++i]);
			weather.setCondition(in[++i]);
			w[count]=weather;
			count++;
		}
		/*int count=0;
		for(int i=0;i<w.length;i++) {
			Weather weather = new Weather();
			weather.setCity(in[count]);
			weather.setTemp(in[++count]);
			weather.setHumidity(in[++count]);
			weather.setCondition(in[++count]);
			w[i]=weather;
			
		}*/
		
		return w;
		
	}

}
