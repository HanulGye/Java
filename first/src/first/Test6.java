package first;

public class Test6 {
	public static void main(String[]args) {
		//정수형
		byte b=127; // byte는 -128~127 1byte
		short s=32767; // short는 -32768~32767 2byte
		int i=3333333; // int는 존나크다 4byte
		long l=33333333L; // long은 int보다 더 크다 long은 뒤에 L을 붙여줌. 8byte
		//실수형
		double d=328.1; // double은 8byte
		float f=32.12f; // float도 long처럼 끝에 f를 붙여줘야됨 그래서 잘 안씀. (대소문자상관x) 4byte
		//문자형
		char ch='a'; //2byte
		//논리형
		boolean check=true; //1byte
		
		//Java에서 사용되는 여러 문자 숫자는 "리터럴"이라고 부른다.
		
		//int num;
		//System.out.println(num);
		//위와 같이 변수에 아무 값도 할당하지 않으면 에러가 남.
		
		//num=100;
		//그런데 이렇게 최초로 값을 넣으면 오류가 나지 않음(출력하기 이전 문단에 써야 에러 안남)
		//최초로 값을 할당하는 것이 바로 "초기화"
		
		//int a, c; 요렇게 같은 타입의 데이터는 한 문단에 연속적으로 선언하는 것도 가능
		
		
	}
}
