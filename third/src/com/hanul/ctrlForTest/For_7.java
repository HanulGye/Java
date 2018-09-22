package com.hanul.ctrlForTest;

public class For_7 {
	
	public static void main(String[] args) {
		//보조문 
		//반복문(for,while) 내에서 사용 가능한 구문
		//break : 그 즉시 반복문 벗어남(종료)
		//		: 다중 반복문 내에서 break를 걸면 가장 가까운 반복문만 종료한다.
		//continue :	for -> 증감식으로 이동
		//				while -> 조건식으로 이동
		
		int num = 10;
		
		for(int i=0;i<10;i++) {
			
			switch(num) {
			case 10 :
				System.out.println("number");
				break;	//이런 경우 가장 가까운 switch만 벗어남.
						// case 10에서 바로 for문 벗어나려면 i<10을 false로 만드는 수 밖엔.
			default :
				System.out.println("others");
			}//switch 끝
			
		}//for 끝
		System.out.println("종료");
	}
}
