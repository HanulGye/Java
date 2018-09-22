package com.hanul.array1;

public class Array_ex1 {

	public static void main(String[] args) {
		// 임의로 정렬된 배열을 큰수 ~ 작은 수로 정렬해보기.
		int temp = 0;
		int [] nums = {1,2,3,4,5};

		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) 
			//아까 생각했던 for문 조건부
			//for(int j=0;j<i+1;j++)
			//바로 위의 식처럼 해버리면 생기는 문제는 무엇인가.
			//두번째 for문이 만족해서 아래의 if문으로 들어가도
			//j의 초기값이 0이라서, 결국 비교하게되는 방 번호는 i와 같음
			//즉, 0번방이랑 0번방을 비교하는 거임. + if문의 조건또한 만족못하기에 작동 안됨.	
			
			{
				if(nums[i]<nums[j]) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;

				}

			}
			System.out.print(nums[i]);
			if (i < nums.length - 1) {
				System.out.print(",");
		}

	}
}
}

