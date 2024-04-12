/*
 * 		1. 변수/상수
 * 			변수는 한개의 데이터를 저장하는 메모리 공간의 이름 => 변경할 수 있다
 * 			=> 외부 => 계속 변경되는 데이터를 찾는다
 * 			데이터형 변수 = 값
 * 			상수는 한개의 데이터를 저장하는 메모리 공간의 이름 => 변경할 수 없다
 * 			final 데이터형 변수 = 값 => 모든 상수명은 대문자로 되어 있다 ex) Byte.MAX_VALUE
 * 			=> IP
 * 
 * 		2. 변수/상수 선언
 * 			=> 데이터형 변수명;
 * 			=> final 데이터형 상수명; => 오류 발생
 * 			=> final 데이터형 상수명=값; => (상수는 무조건 초기값을 설정해야 한다)
 * 
 * 		3. 데이터형 (기본형) => 저장 범위, 메모리 크기(1,2,4,8,...)
 * 			------------------------
 * 			 정수형
 * 				byte : 1byte => -128~127 => 네트워크 전송 시 주로 사용 (업로드, 다운로드)
 * 				int : 4byte => -21억4천~21억4천 => 모든 정수는 컴퓨터에서 int로 인식, 가장 많이 사용되는 정수형
 * 												(웹에 보이는 숫자 : int => ex) 나이, 조회수, 게시글 개수)
 * 				long : 8byte => 최근에 빅데이터, AI에 주로 사용
 * 			------------------------
 * 			 실수형
 * 				double : 8byte => 실수형의 default => 실수가 나오면 컴퓨터에서는 double로 인식 => ex) 평균치, 평점
 * 			------------------------
 * 			 문자형
 * 				char : 2byte(0~65535) => 문자 1개 저장 => '' => 각국의 언어 사용이 가능(65536가지가 있기 때문) => Unicode
 * 					### 연산 시에는 정수로 변경된다
 * 						ex) 'A' + 1 = 65 + 1 = 66
 * 					### 연산처리가 될 때 연산은 같은 데이터형끼리만 연산이 된다
 * 						ex) 10 + 10.5 => 오류 (정수+실수 => byte가 다르다 => 실수로 통일해야 한다)
 * 							10.0 + 10.5 = 20.5 => 가능 (실수+실수 => double로 출력)
 * 			------------------------
 * 			 논리형
 * 				boolean : 1byte (1:ture, 0:false) => true/false로만 고정
 * 				=> 조건이 있는 경우
 * 					boolean bCheck=false;
 * 			------------------------
 * 
 * 		4. 선언 방법 => 초기화
 * 			byte b=10;
 * 			byte b;
 * 			b=20;
 * 			----------
 * 			int i=10; => 선언+초기값
 * 
 * 			// 사용자로부터 입력값을 받는 경우
 * 			int i; => 선언
 * 			i=20; => 초기값
 * 
 * 			// 여러개가 있는 경우
 * 			int a;
 * 			int b;
 * 			int c;
 * 			------- int a,b,c;
 * 
 * 			// 여러개의 변수에 초기화
 * 			int a=10;
 * 			int b=10;
 * 			int c=20;
 * 
 * 			int a=10,b=10,c=20; => 같은 데이터형일 경우에만 사용 가능
 * 
 * 			===============================================
 * 
 * 		5. 변수의 명칭
 * 			1) 알파벳, 한글로 시작한다 (알파벳은 대소문자 구분)
 * 			2) 숫자 사용 가능 (앞에 사용 금지)
 * 			3) 키워드는 사용 불가
 * 			4) 특수문자 사용 가능 (_, $)
 * 			5) 공백은 허용하지 않는다
 * 
 * 		6. 데이터 크기
 * 			byte < char < int < long < double
 * 			boolean은 크기에 관하여 제외
 * 
 * 		7. 데이터 교환
 * 			데이터의 교환은 반드시 임시변수 설정
 * 			int a=10;
 * 			int b=20;
 * 			int temp=a;
 * 			a=b;
 * 			b=temp
 * 		-------------------------------
 * 		### 변수에 값을 대입할 때는 (왼쪽에 받는 것의 값이 커야 한다)
 * 		byte b = byte값
 * 		char c = char값, int값
 * 		int i = byte값, char값, int값
 * 		long l = byte값, char값, int값, long값
 * 		double d = byte값, char값, int값, long값, double값
 * 		-------------------------------
 * 		### 작은 데이터형을 대입하면 자동으로 변경
 * 		char c = 65 => c='A'
 * 		int a = 'A' => a=65
 * 		long a = 10 => a=10L
 * 		double a = 'A' => a=65.0
 */
public class 변수_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Byte.MAX_VALUE); // 127
		System.out.println(Byte.MIN_VALUE); // -128
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Long.MAX_VALUE); // 9223372036854775807
	}

}
