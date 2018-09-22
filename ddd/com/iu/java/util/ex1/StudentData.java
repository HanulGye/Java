package com.iu.java.util.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentData {
	
	private StringBuffer sb;
	
	public StudentData() {
		sb = new StringBuffer();
		sb.append("1,iu,20,30,50,");
		sb.append("2-suji-15-35-25-");
		sb.append("3*hani*56*72*80");
	}
	
	//studentInit()
	//sb의 학생데이터를 파싱해서
	//
	public ArrayList<Student> studentInit() {
		String s= sb.toString();
		s= s.replace('-', ',');
		s= s.replace('*', ',');
		
		StringTokenizer st = new StringTokenizer(s, ",");
		ArrayList<Student> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			Student student = new Student();
			student.setNum(Integer.parseInt(st.nextToken()));
			student.setName(st.nextToken());
			student.setKor(Integer.parseInt(st.nextToken()));
			student.setEng(Integer.parseInt(st.nextToken()));
			student.setMath(Integer.parseInt(st.nextToken()));
			student.setTotal(student.getKor()+student.getEng()+student.getMath());
			student.setAvg(student.getTotal()/3.0);
			ar.add(student);
		}
		
		return ar;
		
	}
	
	

}
