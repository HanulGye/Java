package com.hanul.o_1;

public class OverloadingConstructor {

	/*
	 * ** 생성자 (Constructor)
    - 메섣, 특수한 메섣
    - 객체 생성시 딱 한번 호출되는 메서드
    - 객체 생성시 멤버변수의 초기화 또는 객체생성시 해야될 일 기술 (이게 역할)
    -  생성자는 최소 클래스 내에 1개 이상이 있어야 함
    -  생성자 선언 : 일반 메서드랑 거의 동일
    접근지정자 클래스명과동일한메서드명([매개변수선언]){}
    매개변수가 없는 생성자 - 기본생성자, 디폴트생성자, 빈생성자
        클래스 내에 생성자가 존재하지 않으면 컴파일러가 컴파일 할 때 
        기본생성자를 하나 만들어 줌

	 **메서드 오버로딩(OverLoading)
클래스내에 같은 이름의 메서드를 여러개 만드는 것
	 *조건
 1)메서드의 이름이 같아야 함
 2)매개변수의 갯수가 다르거나 또는 
 3)매개변수의 타입이 달라야 함

	 **this 
자기자신의 객체
참조변수
자기자신의 객체 주소

	 ** this()
자기자신의 다른 생성자 호출
생성자 라인에서 맨 첫줄에 위치


접근지정자의 종류
public, protected, default, private 

접근지정자의 분류 기준 
-> package, class를 기준.

접근(사용,호출)에 따른 분류
1.public - 어디서든 접근이 가능(package간에  움직이는 것도 가능)
2.protected - 같은 패키지내에서만 접근가능, 단 상속관계는 public처럼 package간 접근 가능
3.default - 같은 패키지 내에서만 접근가능
4.private - 같은 클래스 내에서만 접근가능. 

-접근지정자의 작성 가능한 곳
1) class의 선언부 
2) method(생성자 포함, 생성자도 method)의 선언부
3) 멤버 변수 선언부에도 작성 가능.


앞으로 멤버변수 선언시
-> private로 쓴다.
-> 그래서 쓸거면 setter, getter method를 생성
-> setter - 멤버변수에 값 입력할때
-> getter - 멤버변수의 값 출력할때 (뽑아서 쓸 때)



	*/
}
