package second;

public class Variable_4 {
	public static void main(String[]args) {
		int n1 =20;
		double d1 =n1;
		
		System.out.println(d1);
		
		d1 = 12.88;
		n1 = (int)d1;
		
		
		System.out.println(n1);
		//double을 int로 강제형변환 할 경우 기존에 소수점이하의 수들은 그냥 버림.(반올림 아님)
		
		char ch='z';
		n1 = ch;
		System.out.println(n1);
		//char를 int로 변환가능 
		//왜냐면 char 역시 바이트로 이루어진 데이터이고,
		//사람에게 보여지는 것만 문자형식으로 나타나기 때문
		//따라서 char를 int와 같은 정수형 내지는 실수형으로 변환하면 숫자로 표시됨.
		
		ch = (char)n1;
		System.out.println(ch);
		
		ch = (char)256;
		System.out.println(ch);
		
	}
}
