package second;

import java.util.Scanner;

public class Variable_1 {
	public static void main(String[]args) {
		
		//국영수 총점과 평균을 구하시오
		//국어는 kor 영어는 eng 수학은 math 총점은 total 평균은 avg
		int kor; 
		int eng;
		int math; 
		String name=""; //string 초기값은 null 또는 ""
		
		Scanner sc = new Scanner(System.in);
		//요 스캐너는 키보드 입력값을 바로 받을 수 있게 해주는 기능
		//근데 이것도 출력을 안하면 구동시켰을 때 암것도 안뜨겠지?(하지만 기능은 구현되어있는상태)
		//따라서 어떤 값을 입력할 지 표시를 해줘야됨(보통 언어로 표현할테니 string이겠지?)
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("국어점수를 입력하세요");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = sc.nextInt();
		//sc.nextInt();는 sc로 키보드값을 입력하는 걸 연결, 그리고 그 값의 형식은 int여야한다는 뜻
		//sc.next();는 값의 형식이 string이어야함을 의미
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		
		//avg가 소수점까지 정확히 나오게 하려면
		//total값도 실수형이어야 함. 
		//만일 그렇지 않으면, total(정수)값을 3(정수)로 나누기에 avg도 정수로밖에 안나옴.(자동형변환된거)
		
		//total이 더블타입이 아니어도 avg의 값이 소수점까지 표시되게 하려면
		//연산하는 식에 실수형이 들어가면 된다. 
		//왜냐면 실수형이 표현할 수 있는 범위가 더 넓고 표현범위가 적은 녀석이 넓은 녀석을 따라감.
		
		//데이터타입별 초기값
		//정수:0 실수:0.0 문자:스페이스바 논리형:true 
		//근데 꼭 저렇게 넣을 필욘 없음.
		
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		
				
		
	}
}
