package com.hanul.array2;

public class Array_7 {

	public static void main(String[] args) {
		
		int [] n1 = new int[3];
		n1[0]=10;
		n1[1]=20;
		n1[2]=30;
		
		int [] n2 = {1,2,3,4};
		
		System.out.println(n1.length);
		System.out.println(n2.length);
		n1=n2;
		
		for(int i=0;i<4;i++) {
			System.out.println(n1[i]);
			System.out.println(n2[i]);}
		//이렇게 하면 1,2,3,4가 출력되는 이유는 번지수를 바꿨기 때문. 
		//n1=n2; 했기에 이제 n1역시 n2와 같은 주소를 가리키고 그 주소가 가리키는 배열을 따라가면 
		//n2배열이 나오는거임.
		
		n2 = new int[2];
		System.out.println(n1[0]);
		//n2는 이제 새로운 주소를 가리키는 레퍼런스 변수로 바뀜.
		//n1은 그 이전에 n2가 가진 원래의 주소를 갖고있기에 1이 출력된거.
		
		int [] n3 = {1,2,3,4};
		int [] n4 = new int[n3.length];
		for(int i =0;i<n3.length;i++)
		{
			n4[i]=n3[i];
		}
		//데이터 내용은 같지만 서로 다른 배열을 만들고 싶을 때.
		//n4=n3 해버리면 동일한 주소를 가진 두개의 레퍼런스만 존재할 뿐 두개의 배열이 생기는 건 아님.
		
		
	}
	
}
