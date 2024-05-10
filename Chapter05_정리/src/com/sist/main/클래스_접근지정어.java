package com.sist.main;
/*
 * 	변수 / 메소드 / 생성자
 * 	-----------------
 * 	접근 범위
 * 	=> private : 멤버변수 (데이터를 보호하는 목적) => 접근 거부
 * 	=> public : 다른 클래스와 연결 (메소드 / 클래스 / 생성자) => 접근 승낙
 * 
 * 	라이브러리에서 제공
 * 	접근지정어는 멤버에서만 사용이 가능
 * 	여기서 멤버
 * 	=> 클래스 영역에 선언
 * 	~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * 	=> 인스턴스변수, 정적변수
 * 	=> 메소드 
 * 	=> 생성자
 * 	=> 클래스
 * 	~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 다른 클래스에 사용하기 때문에 접근 범위 설정
 * 	=> 지역변수는 접근지정어를 사용할 수 없다 (메소드 안에서 사용)
 * 	   ----- final (접근지정어, static은 사용 불가)
 * 	-----------------------------------------------------
 * 	*** private : 자신의 클래스에서만 사용 가능 (접근 금지) => 개인 정보, 회사 정보 ...
 * 				모든 멤버변수는 데이터 보호
 * 	-----------------------------------------------------
 * 	dafault : 같은 패키지에서 접근 가능 => 키워드가 없는 상태
 * 				class A
 * 				{
 * 					int a; => default
 * 				}
 * 	-----------------------------------------------------
 * 	protected : 같은 패키지에서 접근 가능 + 상속을 받은 경우 다른 패키지까지 접근 가능
 * 	-----------------------------------------------------
 * 	*** public : 모든 클래스에서 접근 가능 => 클래스, 메소드, 인터페이스, 생성자, 상수
 * 	-----------------------------------------------------
 * 
 * 	=> 크기 : private < default < protected < public
 * 
 * 	=> 지역변수 : final 외의 다른 키워드는 사용 불가
 * 				멤버변수는 기본 초기화 (생성자 (X):생략의 경우 자동 추가, 초기화 블록 (X))=> 바로 사용 가능 => 프로그램에 필요한 경우 초기화 후 사용
 * 				지역변수는 반드시 초기화 후 사용
 * 				모든 멤버변수에 private을 사용해야 하는 건 아니다 => 권장 사항일 뿐
 * 
 * 	=> 메소드
 */
public class 클래스_접근지정어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
