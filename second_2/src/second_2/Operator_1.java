package second_2;

public class Operator_1 {
	public static void main(String[] args) {
	
		//산술연산자
		//+, -, *, /, %
		
		int n1 = 11;
		int n2 = 4;
		int result1 = n1/n2;//몫
		int result2 = n1%n2;//나머지
		// 짝수 홀수 판단할 때 주로 사용한다
		// 짝수는 2로 나눴을 때 나머지가 0, 이외의 나머지가 나오는 건 홀수
		
		System.out.println(result1);
		System.out.println(result2);
	
		//+ : 산술연산자, 연결연산자
		//연결연산자란 String타입과 연결할 때 사용하는 연산자를 의미한다.
		String s1="a";
		System.out.println(s1+n1);
		
		System.out.println("1"+1);
		//연결연산자로 연산된 변수의 타입은 문자열로 인식한다.
		
		System.out.println('1'+1);
		//char타입 1과 int 1을 연산하면 바이트가 큰 int타입으로 char타입이 바뀜.
		//char타입의 1을 int타입으로 형변환하면 49가 됨. 따라서 49+1 = 50이란 값을 얻음
	
		System.out.println("1"+1+1);
		System.out.println(1+1+"1");
		System.out.println("2"+3*4);
		System.out.println("1"+(1+1));
		//일반수학처럼 소괄호 먼저 계산
		System.out.println('1'+"1");
		//각 값이 왜 그렇게 떨어지는지 확인해볼 것.
		
		//double d1 = (double)(1562/100);
		//이러면 아까와 같이 괄호 안 int/int부터 연산해버리니까 소수점 이하 자리 버린 값이 나와버림. 주의할 것
		
		
	}
	
}
