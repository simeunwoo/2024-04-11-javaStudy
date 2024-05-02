/*
 * 	1. 자바 실행 과정
 * 	   ----------
 * 			  2진파일 변경 (0,1 => 컴퓨터 인식)
 * 			   컴파일			 인터프리터
 * 	   A.java =====> A.class =====> 실행
 * 			  javac (바이트 코드) java  |
 * 						|		 한줄씩 번역
 * 					  배포(AWS)
 * 		*** 컴파일 / 인터프리터 (면접 => 75%)
 * 
 * 	2. 자바
 * 		변수 / 상수 / 리터럴
 * 		변수 : 데이터가 저장된 주기억장치 속 기억장소
 * 			  데이터를 저장하는 메모리 공간
 * 						 ----- 주소 (0번 ~ 크기)
 * 			변수 => 읽기/쓰기 => 쓰기하면 덮어쓴다
 * 			int a=10;
 * 			a=20;
 * 			a=30; => 메모리에 저장된 값 (최종)
 * 
 * 		상수 : 데이터를 저장하는 메모리 공간
 * 				=> 변경할 수 없다
 * 				=> final
 * 		리터럴 : 실제 값
 * 				int a=10;
 * 					  -- 리터럴
 * 		*** 변수
 * 			= 지역변수 => 메소드 안에 선언된 변수
 * 						메소드 안에서만 사용 가능
 * 						반드시 초기화를 한 다음 사용한다
 * 						=> 매개변수
 * 						=> Stack 공간 => 메모리 자체 관리 {}끝나면 자동으로 사라진다
 * 						=> 변수가 저장되는 시기 : 메소드 호출 시마다
 * 			-------------- 클래스 영역에 선언
 * 			= 멤버변수 : new를 사용 시마다 따로 저장되는 변수 (new)
 * 					   = 자바에서 가장 많이 사용되는 변수
 * 			= 공유변수 : 저장 공간이 1개라서 모든 클래스 변수에서 공유해서 사용
 * 					   static (컴파일 시에 저장) => 오라클
 * 			-------------- 모든 사이트는 동일
 * 
 * 		*** 식별자
 * 			클래스명,메소드명,변수명,인터페이스,열거형,어노테이션,추상클래스명,내부클래스
 * 			1. 알파벳이나 한글로 시작한다
 * 					  ---- 운영체제에 따라 한글이 깨진다
 * 			   ---- 대소문자
 * 			2. 숫자 사용이 가능 (앞에 사용 금지)
 * 			3. 특수문자 사용 (_, $)
 * 			4. 키워드는 사용 금지 (키워드는 빨간색으로 되어 있음)
 * 			5. 공백이 있으면 안된다
 * 			----------------------------------------
 * 			약속 (자바 프로그래머끼리의 약속)
 * 
 * 			1) 클래스,인터페이스,추상클래스,내부클래스 => 첫자는 대문자로 한다
 * 				class MainClass
 * 				interface MainInterface
 * 				abstract class MainClass
 * 				class Abc
 * 				{
 * 					class Bcd
 * 					{
 * 
 * 					}
 * 				}
 * 
 * 			2) 변수,메소드 => 소문자로 시작한다
 *
 *			3) 상수 : 모든 문자를 대문자로 한다
 *
 *			4) 길이에는 제한이 없다 => 3~7자 정도로 결정
 *				약간의 의미만 부여
 *
 *		A.java ===== A.class
 *		------		 -------
 *		원시소스		  기계어
 *		  |				| 컴퓨터만 인식
 *	 자바 프로그래머만 인식
 *		String n => name
 *		String s => sex
 *	 -------------------------------
 *		변수 선언
 *		-------
 *		데이터형
 *			= 기본형 => 자바에서 제공
 *				정수/실수/문자/논리
 *				byte/int/long => 데이터 분석
 *					---- default
 *				double : 15자리
 *				char : 사라진다 => String
 *				boolean : true/false
 *			  ---- 파일 입출력, 네트워크
 *			= 참조형 => 여러개 데이터를 모아서 저장 => 메모리 주소만 이용
 *				| 배열/클래스 => 사용자 정의
 *			= 지역변수 : 기본형
 *			= 멤버변수 : String + 기본형 => 배열 (특별한 경우가 아니면 빈도수가 없다)
 *									   ------------------------------
 *										고정 => 보완 => 컬렉션
 *			------------------------- 데이터 저장
 *			데이터 처리
 *			연산자
 *				단항연산자 (++,--,! (type))
 *								------- 형변환연산자 => 논리 제외
 *				이항연산자
 *					= 산술연산자 : +,-,*,/,%
 *								+ : 문자열 결합
 *					= 비교연산자 : ==,!=,<,>,<=,>=
 *					= 논리연산자 : &&,||
 *					= 대입연산자 : =,+=,-=
 *				삼항연산자 : (조건)?값:값
 *					=> 웹에서 많이 등장
 *			제어문
 *				조건문 : if, if~else, if~else if~...~else
 *				선택문
 *				반복문 : for, while
 *				반복제어문 : break
 *			---- +
 *			메소드
 *			형식) 리턴형 메소드명(매개변수목록)
 *				-----
 *				{
 *					=== 구현부
 *					return 값
 *						  --- 리턴형은 데이터형 => 리턴형에 해당되는 데이터를 보낸다
 *					=> 리턴형 : void면 => return 생략이 가능
 *						*** 자동으로 컴파일러가 return을 추가한다
 *					*** void는 결과값이 없는 경우
 *						---- 메소드 자체 출력
 *						---- 오라클 연결 / 파일 연결 => 추가, 삭제, 수정
 *				}
 *				=> 데이터를 읽어온 경우에만 값이 존재
 *			
 *			리턴형 => 기본형 (int,byte,long,double,...)
 *					배열 : int[], String[],...
 *					클래스 : Student, String, Music, Movie,... : 상세 보기
 *			매개변수 => 기본형 => Call By Value : 새로운 메모리 생성
 *					  배열/클래스 => Call By Reference : 매개변수 자체 처리
 *						=> 얕은 복사 => 별칭을 이용한다
 *			----------------------------------------------------------
 *			리턴형 : 요청에 대한 결과값
 *			매개변수 : 사용자 요청값
 *
 *			++ 결과값은 경우의 수...
 *			경우의 수 2개 => boolean
 *			경우의 수 여러개 => String, int
 *			=> 로그인
 *				=> id,pwd => 매개변수
 *				=> 리턴형
 *					=> 아이디가 없는 경우 => 1
 *					=> 비밀번호가 틀린 경우 => 2
 *					=> 로그인 => 3
 */
public class 자바마지막정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
