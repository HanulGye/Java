package first;

public class Test8 {
	public static void main(String[]args) {
		int num1 = 10;
			System.out.println(num1);
			
			num1 = 20;
			System.out.println(num1);
			
			//선언된 변수에 값 교환하기
			int num2 = 10;
			int num3 = 14;
			System.out.println(num2);
			System.out.println(num3);
			
				num2 = num3;
				num3 = num2;
				
				System.out.println(num2);
				System.out.println(num3);
				
				//이렇게 하면 값이 제대로 옮겨지지 않음.
				//그릇에 비유해서 제 3의 그릇을 만들어서 거기다가 옮겨야 됨.
				
			int num4 = 11;
			int num5 = 12;
			System.out.println(num4);
			System.out.println(num5);
			
			int tmp = num4;
			num4 = num5;
			num5 = tmp;
			System.out.println(num4);
			System.out.println(num5);
			
			
	}
}
