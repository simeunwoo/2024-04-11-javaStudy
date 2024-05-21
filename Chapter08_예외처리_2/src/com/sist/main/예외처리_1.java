package com.sist.main;
/*
 * 	9장 => 메소드
 * 		java.lang
 * 		java.util
 * 	10장
 * 		=> 자료 구조 => 웹 => 크롤링 => 배열을 대체 => 컬렉션 / 제네릭스
 * 	--------------------------------------- 예외 처리
 * 	11장
 * 		=> 입출력
 * 	12장
 * 		=> 핵심 (java.sql) => 오라클 연동
 * 	--------------------------------- 사용자 정의 메소드는 없다 => 조립
 * 
 * 	1) 데이터형 / 변수 / 연산자 / 제어문
 * 	2) 클래스 구성 요소 : 멤버 변수 (static), 메소드, 생성자
 * 	3) 재사용 => 상속 / 포함
 * 	4) 클래스의 종류 : 추상 클래스, 인터페이스
 * 	5) 예외 처리 : try~catch, throws
 * 	--------------------------------------------- 자바 기본 문법
 * 	6) 라이브러리
 * 	7) 조립 (라이브러리를 이용하여 프로그램 제작)
 * 	----------------------------------
 * 	=> 사용 (웹) => 자바는 변경 사항이 없다 => 출력 (윈도우 출력, 도스 출력, 브라우저)
 * 			브라우저 : HTML/CSS (Java+HTML) => Java와 HTML을 분리 : MVC (Spring)
 * 										=> 기술 => 자바스크립트
 * 										=> 배포 => AWS (리눅스)
 * 	=> 데이터베이스 라이브러리 : MyBatis / JPA
 * 	=> Full Stack : Ajax, VueJS, React (React-Query), Redux (MVC 구조)
 * 	=> 서버가 분리 (역할별 => 서버를 따로 제작) => MSA 구조
 * 	-----------------------------------------------------------------------
 * 	파이썬 => 데이터 분석 => 브라우저 (장고) => React
 * 			-------- 넘파이 / 판다스 / MatPlotLib
 * 	-----------------------------------------------------------------------
 * 	=> 70% => 자바, 20% => 데이터베이스
 * 	------------------------------ 자바 / 오라클
 * 	=> 자격 조건 : Spring (Spring-Boot), Vue/React (React-Query), MyBatis, JPA
 * 				=> 리눅스 사용자
 * 				=> MSA
 * 
 * 	예외 처리 : 사전에 에러 발생에 대한 방지 프로그램
 * 			=> 비정상 종료를 하지 않고 정상 수행이 가능하게 만들어준다
 * 			=> 에러가 나면 => 에러를 자동 수정해주는 것이 아니라 점프를 해서 에러 부분을 통과 ...
 * 
 * 			문장 1
 * 			문장 2 => 에러 발생 => 프로그램 종료
 * 			문장 3
 * 
 * 			에러 부분의 문장을 => 컴파일 시 무시 (통과) => 예외 처리
 * 
 * 	에러 발생
 * 	1. 처리 (조건문 고려) => 조건문으로 처리가 어려운 경우 => 예외 처리 이용
 * 	2. 프로그래머의 실수 : 배열 인덱스 초과, 파일명 오류 ...
 * 	3. 사용자 입력값 => 웹 (유효성 검사 => 자바스크립트)
 * 
 * 	에러 종류
 * 	Error : 수정이 불가능한 에러 => 메모리 부족, 이클립스의 오류 ...
 * 	Exception : 수정이 가능한 에러 (프로그램 소스 안에서 수정) => 가벼운 에러
 * 				=> IP 연결 시 IP 오류, 크롤링 시 사이트 URL 오류, 파일명 오류, 라이브러리 사용 시 로드를 안한 경우 ...
 * 
 * 	정상 처리 방법 (예외 처리 방법)
 * 		= 직접 처리 (프로그래머가 에러를 직접 잡아서 : catch => 복구) => 예외 복구
 * 			try ~ catch ~ finally
 * 		= 간접 처리 (떠맡기기) => 메소드 호출 시에 처리
 * 			예측되는 에러만 선언 => 라이브러리, 복잡한 소스가 있는 경우
 * 			메소드() throws 예외 종류 => 메소드를 호출해서 사용하려면 => 뒤에 선언된 예외 처리를 하고 호출한다
 * 								=> 복구 불가 => 예외를 피해간다 => 예외 회피
 * 		= 임의 발생 : 테스트 (에러 발생 시 => 권고) => 많이 사용하지는 않는다
 * 			throws
 * 		= 사용자 정의 : 자바에서 전체적인 예외 처리를 지원하지 않는다 => 필요 시에는 직접 만들어서 사용 => 사용 빈도는 거의 없다
 * 
 * 	=> catch에는 순서가 존재 vs throws에는 순서가 없다
 * 	=> 예외 처리의 상속도
 * 		반드시 예외 처리 : CheckedException : 컴파일 시 예외 처리 확인
 * 		필요 시 예외 처리 : UnCheckedException : 실행 시 처리 (사용자 입력값을 받아서 ...)
 */
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
