package com.sist.main;
/*
 * 	상속
 * 	1) 단일 상속만 가능
 * 	2) extends : 확장한 클래스 => 사용
 * 	3) 이미 제작된 클래스를 이용 => 신뢰성이 좋다
 * 	4) 소스를 줄일 수 있다 => 가독성은 떨어진다
 * 		=> 가상으로 상속되었다고 가정 ...
 * 
 * 	class A
 * 	{
 * 		int a;
 * 		int b;
 * 		int c;
 * 		public void display(){}
 * 	}
 * 	---------------------------
 * 	class B extends A
 * 	{
 * 		// a,b,c, display()
 * 	}
 * 
 * 	B bb=new B();
 * 
 * 	-- bb --
 * 	0x100
 * 	--------	0x100	------------------
 * 						----- super ------
 * 							--- a ---
 * 
 * 							--- b ---
 * 
 * 							--- c ---
 * 
 * 							--- display() ---
 * 
 * 							---------
 * 						------------------
 * 
 * 						------------------
 * 						------ this ------
 * 							--- bbb() ---
 * 
 * 							----------
 * 
 * 							----------
 * 						------------------
 * 	=> bb라는 객체를 통하여 접근이 가능
 * 		=> 상속이 안된다
 * 		1. 생성자
 * 		2. 초기화 블록
 * 		3. private : 상속은 된다 => 접근이 불가능
 * 			=> protected
 * 		4. static : 상속은 안된다 => 공통으로 사용이 가능하게 만든다
 * 
 * 	class Super
 * 	class Sub extends Super
 * 
 * 	Super
 * 	↑ : 상속 기호
 * 	Sub
 * 	=> 클래스의 크기 비교는 반드시 상속/포함
 * 
 * 	class A
 * 	{
 * 		int a,b,c,d,e;
 * 	}
 * 	class B
 * 	{
 * 		int k;
 * 	}
 * 	------------------ A>B (X) => 크기(상속/포함)를 잴 수 없다
 * 
 * 	class A
 * 	{
 * 		int a;
 * 		int b;
 * 	}
 * 	class B extends A
 * 	{
 * 		// int a, int b
 * 		int c;
 * 	}
 * 	------------------ A>B => 상속은 내리는 클래스가 더 크다 => is-a (이다)
 * 
 * 	동물 => 포유류/양서류/조류
 * 	포유류 => 인간/말/돼지/소
 * 	인간 => 남자/여자 (크기를 잴 수 없다)
 * 	======================> 남자 : 동물.포유류.인간.남자 => 범위를 기준 => 상속을 내리는 클래스가 더 크다 (데이터형이 커진다)
 * 	인간 = 남자
 * 	인간 = 여자
 * 	=========> 남자 = (남자)인간 
 * 	=========> 여자 = (여자)인간
 * 	~~~~~~~~~~~~~~~~~~~~~~~~ 클래스에도 크기가 있다 => 형변환
 * 
 * 	*** 자바는 모든 클래스 (사용자 정의, 라이브러리)의 상속을 내리는 클래스가 있다 : 최상위 클래스 : Object
 * 		=> Object가 가지고 있는 모든 기능을 사용할 수 있다
 * 		=> Object는 모든 데이터형의 상위 클래스 => 기본형, 배열부터 모든 클래스를 받을 수 있다
 * 	Object ob=10;
 * 	ob=10.5l;
 * 	ob="aaa";
 * 	ob='A';
 * 	ob=new A();
 * 	---------- 배열 => 데이터형 여러개 첨부
 * 	Object[] ob={"",10.7,,10,'A',new(A)}; => 다른 데이터형을 모아서 관리
 */
import javax.swing.*;
public class MainClass_3 extends JFrame { // extends Object의 경우 생략이 가능
	/*
	 * 	생략이 가능한 코드
	 * 	1. import java.lang.*; => String, Math, StringBuffer ... => 자주 사용하기 때문에 생략 가능
	 * 	2. extends Object => 생략 가능
	 * 	3. 생성자 => 필요없는 경우에 생략 가능 => 컴파일러가 추가
	 * 	4. void 메소드에서 return을 생략할 수 있다 => 컴파일러가 추가
	 * 	5. 모든 클래스는 예외 처리
	 * 		=> 컴파일 시 : 반드시 예외 처리
	 * 		=> 실행 시 : 예외 처리 생략이 가능 => 사용자 입력값을 받아 본다 (ex) 정수를 입력하시오 => 사용자가 실수로 실수 입력 (조건문으로 처리))
	 * 
	 * 	=> 상속
	 */
	public MainClass_3()
	{
		// this.~~~ // MainClass_3가 JFrame을 상속 받음으로써 this 뒤에 엄청 많은 조건을 받을 수 있게 됨
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		return; // return도 평상 시에는 생략이 된 거임
	}

}
