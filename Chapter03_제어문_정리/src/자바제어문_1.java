/*
 * 	1. 변수 : 데이터 한개만 저장하는 메모리 공간
 * 		=> 여러개 (배열, 클래스)
 * 		=> 데이터형 (정수, 실수, 문자, 논리)
 * 		=> 식별자 : 변수명 설정 *** 대소문자 구분 Name!=name
 * 		=> 약속 (문법)
 * 		   -------- => 리팩토링
 * 			1. 클래스, 인터페이스명은 대문자로 시작한다
 * 				class Main
 * 				=> Main main=new Main()
 * 				   -------------------- 웹에서는 한글이 깨진다 => 이름을 알파벳
 * 				=> 두개의 단어를 이용할 경우 (대문자, _)
 * 					MainClass
 * 					-	-
 * 					File_name
 * 			2. 변수, 메소드 => 소문자 시작
 * 			3. 상수 => 모든 알파벳이 대문자
 * 			4. 들여쓰기
 * 	-------
 * 	2. 연산자 : 요청 처리 => 변수를 가공한다
 * 		1) 단항연산자
 * 		=> 증감연산자 (++, --)
 * 		=> 부정연산자 (!)
 * 		=> 형변환연산자 (type)
 * 		2) 이항연산자
 * 		=> 산술연산자 (+, -, *, /, %)
 * 		=> 비교연산자 (==, !=, >, <, >=, <=)
 * 		=> 논리연산자 (&&, ||)
 * 		=> 대입연산자 (=, +=, -=)
 * 		3) 삼항연산자
 * 		=> (조건)?값1:값2 => if~else => 웹, 게임 (소스를 줄일 경우)
 * 	3. 제어문 : 프로그램 자체 제어
 * 		=> 필요한 내용만 출력 (아니면 건너뛴다) => 조건문
 * 		=> 소스가 반복적일 경우 => 반복문
 * 		=> 반복문에 제어 => 반복문 종료, 반복문에서 제외
 * 		1) 조건문
 * 		=> 단일조건문 : 조건에 맞는 경우에만 출력
 *			if(조건문) => true/false => 부정/비교/논리연산자
 *			{
 *				true => 문장을 수행
 * 			} => false면 건너 뛴다
 * 			*** 여러개 사용 시에는 독립으로 사용이 된다 => 모든 조건을 검색
 * 		=> 선택조건문
 * 			=> true/false일 경우 나눠서 처리 => 웹, 윈도우에서 가장 많이 사용
 * 			예) 로그인(O) => main
 *				로그인(X) => 로그인 요청 => 회원가입
 *				if~else
 * 		=> 다중조건문
 * 	------- 한개의 기능 설정 => 메소드
 * 	---------------------------- + 통합 (클래스)
 * 	클래스 : 데이터형 / 통합
 * 					=> 웹 출력 (브라우저 : HTML)
 * 
 * 	String : 문자열을 저장하는 데이터형 (웹에서 가장 많이 사용)
 * 	브라우저 => 자바로 값 전송
 * 	-------------------- => 무조건 문자열
 */
public class 자바제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
