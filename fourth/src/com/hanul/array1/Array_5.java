package com.hanul.array1;

public class Array_5 {
	public static void main(String[] args) {
		String [] names = {"창식","영희","미애","정효","미자"};
		int[] points = {14,89,72,11,12};

		//point가 제일 높은 사람&&제일 낮은사람의 이름이 누구냐를 출력
		//창식이는 14 영희는 89 ....순
		//배열내 int들의 비교는 어케 하나..

		int max=0;

		for(int i=1;i<points.length;i++) {
			if(points[max]<points[i]) {
				max=i;

			}

		}		
		System.out.println("가장 큰 수"+points[max]);
		System.out.println("이름 : "+names[max]);



		int[] str = { 3, 24, 1, 55, 17, 43, 5 };
		int temp = 0; // 정렬을 위해 임시로 값을 저장할 변수

		for (int i = 0; i < str.length; i++) {
			//첫번째 for -> 정렬할 배열의 총 칸수만큼 반복하겠다.
			//			   배열의 앞쪽에 있는 녀석
			for (int j = i + 1; j < str.length; j++) {
				//두번째 for ->정렬할 배열의 총 칸수-1만큼 반복하겠다.
				//그게 무슨말이냐면
				//좌측에서부터 배열에 있는 정수 데이터들을 비교할건데,
				//비교되어지는 수를 가리키는(두번째 수를 가리키는) 역할
				
				if (str[i] > str[j]) {
					//배열의 첫번째 위치한 애가 두번째 위치한 애보다 크다면
					temp = str[i];
					//잠깐 배열에서 빼놓을게.(우리는 작은수~큰수의 순서로 정리할거니까)
					str[i] = str[j];
					str[j] = temp;
					//비교해봤더니 작은 녀석은 좌측 큰 녀석을 우측으로 옮길게.
					//작은수~큰수 순으로 정렬할거니까.
				}
			}
			System.out.print(str[i]);
			if (i < str.length - 1) {
				System.out.print(",");
			}
		}







	}
}
