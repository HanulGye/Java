package second_2;

public class Operator_3 {

	public static void main(String[] args) {
		
		//증감연산자(++, --)
		//++ : 1씩 증가
		//-- : 1씩 감소
		int num = 0;
		++num; //num=num+1 이라는 것.
		num++; //단항 연산자일 때 증감연산자의 위치는 중요치않음
				//[++숫자]는 우선순위가 자기 자신, [숫자++]은 우선순위가 제일 마지막.
		
		int n1 = ++num;
		
		n1=num++;
		//위의 식은 순서가 num값을 먼저 n1에 넣음. 이후 num값에 +1한 것. 그래서 결과로 num=4, n1=3이 나오는 것.
		
		
		System.out.println(num);
		System.out.println(n1);
		
		n1=0;
		num=0;
		System.out.println(num++);
		System.out.println(++num);
		//첫번째 num은 0값이 먼저 출력되고 이후 +1 됨
		//그 상태(0+1)에서 +1해서 두번째 num이 출력됨->따라서 2가출력됨.
		
		
		//확장 대입연산자
		//eg.n1=n1+2;
		//eg.n1+=2;
		//위처럼 자기 자신에 무언가를 연산하는 경우 아래처럼 더 짧게 쓸 수 있음.
		//2번째 식과 같이 확장대입연산자를 사용하는경우는 꽤 있으므로 익숙해질 필요 있음
		
		
	}
}
