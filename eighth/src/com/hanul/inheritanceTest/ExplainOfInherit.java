package com.hanul.inheritanceTest;

public class ExplainOfInherit {

	/*상속(inherit)
	 * a클래스의 멤버메서드 및 멤버변수를 b클래스에서도 사용하기 위한 목적
	 * 즉, 코드 중복방지 및 재사용을 위해 만들어짐.
	 * 
	 * **상속이 안되는것
	 * 생성자, private 접근지정자가 설정된 것들
	 * 
	 * 상속은 하나만 가능
	 * 
	 * 
	 * 상속시 부모클래스의 이름이 중요!
	 * is a 관계 : 자식클래스명 is a 부모클래스명이라고 했을 때 상식적으로 말이 맞아야함 
	 * 한 마디로 뒤에 오는 부모클래스가 더 큰 범주의 이름이어야한다는거임.
	 * 
	 * has a 관계(이건 상속이 아닌 포함) : 클래스명 has a 클래스명 
	 * 이건 뒤에 오는 클래스의 이름에 해당하는 객체가 좀 더 낮은 범주의 것이어야된다는거임
	 * Car has a Engine 같은 식.
	 * 
	 * 상속이든, 포함이든 목적은 같음 
	 * 어떤 클래스의 변수와 메서드들을 자기 클래스로 가져와서 쓰고 싶은데, 그 관계가 어떠하냐에 따라 나뉘는것.
	 * 
	 * super()
	 * 생성자내에서 작성,
	 * 생성자 내 첫 줄에 와야 인식함. 
	 * this()와 비슷함.
	 * 부모클래스의 생성자를 호출하는 역할을 담당.
	 * 
	 * super
	 * 부모 클래스의 참조변수 
	 * 
	 * 오버라이딩
	 * 상속받은 메서드의 내용을 자신에게 맞게 재정의하는 것
	 * 상속관계가 성립된 상태에서 가능
	 * 메서드 선언부(매개변수 전까지)는 부모 클래스메서드와 동일하게해야함.
	 * 하지만 접근지정자는 부모클래스와 같거나 더 넓게!!넓게!! 변경이 가능! 
	 * 
	 * 오버로딩은 새로 메서드를 만든다는 개념.
	 * 반면에 오버라이딩은 새로만드는게 아니고 고치는거임!
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
}
