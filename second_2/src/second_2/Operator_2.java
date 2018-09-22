package second_2;

public class Operator_2 {
	public static void main(String[] args) {
	
		//비교연산자 (>, <, >=, <=, ==(이게 수학에서의 =), a!=b(a와b가 같냐?, 부정형질문임))
		//비교연산자는 참,거짓의 값을 도출하는 일종의 물음이라고 생각하면 됨.
		
		boolean check = 3<7;
		check = 3==3; //true
		check = 3!=2; //true (3과 2가 같지 않냐? 라고 질문했는데 같지 않으므로 true)
		
		//관계연산자(논리연산자)
		//boolean타입끼리 연산
		// and 연산 : && (전부 T일때 T)
		// or 연산자 : || (하나라도 T면 T)
		// not 연산자 : ! (t->f, f->t)
		
		boolean c1 = true;
		boolean c2 = false;
		boolean result = c1&&c2;
		boolean result2 = c1||c2;
		result2 = !result2;
		
		
		int num1 =2;
		int num2 =3;
		int num3 = num1|num2;
		num3 = ~num3;
		System.out.println(num3);
		//&, |, ^, ~는 비트끼리 계산을 하는 비트논리연산자들
		//2진수로 구성된 비트들을 각자의 자리끼리 논리연산한거임. 
		
		
	}
}
