package com.iu.java.lang;

public class Object_ex {
	
	int a=10;
	
	@Override
	public boolean equals(Object obj) {
		Object_ex ob2 = (Object_ex)obj;
		boolean check=false;
		if(this.a==ob2.a) {
			check=true;
		}
		return check;
	}

}
