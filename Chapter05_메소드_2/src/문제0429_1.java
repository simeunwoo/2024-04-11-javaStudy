// 리턴형 (X) / 매개변수 (X)
public class 문제0429_1 {
	static void one()
	{
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one(); // 리턴형이 없는 경우
	}
/*
 * 		메소드 => 전체 소스를 분리해서 작업 (분업화)
 * 		1) 형식
 * 			리턴형 메소드명(매개변수) ===========> 선언부(원형)
 * 			----존재 여부 -----존재 여부
 * 			{
 * 				=> 구현
 * 				return 값 => void일 경우 생략할 수 있다
 * 			}
 * 		2) 유형
 * 			리턴형 매개변수
 * 			 O		O
 * 			 O		X
 * 			 X		O
 * 			 X		X
 * 		3) 구현
 * 			{
 * 				구현 => 연산자/제어문
 * 			}
 * 		4) 호출
 * 			리턴형이 있는 경우
 * 				데이터형 변수=메소드명()
 * 			리턴형이 없는 경우
 * 				메소드명()
 * 
 * 		---------------------------
 * 		매개변수 => 메소드(값,값,값,...)
 * 		*** 메소드는 호출 시마다 => 처음부터 수행
 * 		*** 객체지향의 3대 요소 : 변수, 메소드, 생성자
 * 		*** 클래스는 1개의 기능만 가지고 있다
 * 				  -------- 세분화 : 메소드
 * 				  예) class 예약 ===> 웹 프로그램에 조립
 * 					  {
 * 						1. 맛집 목록 출력
 * 						2. 맛집 클릭 시에 예약일 출력
 * 						3. 예약일 클릭 시 예약 가능 시간
 * 						4. 시간 => 인원수
 * 						5. 예약 버튼 활성화
 * 					  }
 */
}
