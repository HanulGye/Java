package com.iu.java.util.st;

import java.util.StringTokenizer;

public class MemberInit {
	
	private StringBuffer data;
	
	public MemberInit() {
		this.init();
	}
	
	private void init() {
		data = new StringBuffer();
		data.append("id1, pw1, iu,");
		data.append("id2-pw2,suji-");
		data.append("id3,pw3,choa");
		
		
	}
	
	public Member [] getMembers() {
		String str = data.toString();
		str = str.replace('-', ',');
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str,",");
		Member [] ar = new Member[st.countTokens()/3];
		int i=0;
		while(st.hasMoreTokens()) {
			Member member = new Member();
			member.setId(st.nextToken().trim());
			member.setPw(st.nextToken().trim());
			member.setName(st.nextToken().trim());
			ar[i]=member;
			i++;
		}
		
		return ar;
	}
	
	

}
