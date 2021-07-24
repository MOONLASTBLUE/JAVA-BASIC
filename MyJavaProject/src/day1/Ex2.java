package day1;

public class Ex2 {

	public static void main(String []args) {
		System.out.println();
		// syso(작성)+ctrl+space
		//변수
		//숫자형, 문자형, 논리형
		
		//숫자형 : double, float 소숫점 유(실수),int 무(정수)
		double dou=1.14; //float의 2배(8byte), 실수의 기본형, 굳이 쓸거면 뒤에 d붙임
		float f=1.2f;	 //float는 숫자뒤에 f를 써서 float임을 알려줘야함(4byte)
		int in=16868686;
		System.out.println(dou);
		
		//문자형 : 한글자(char), 여러글자(String)
		char yoon = 'a'; //작은따옴표 사용, String도 한글자 담을 수 있기때문에 차별화
		
		String mj = "민주는 선생님이다";
		 System.out.println(mj);
		 
		//논리형 : 참 true 거짓 false 
	    //      : boolean 변수이름 = 참/거짓;
		//1. 5>4 -> true
		//2. 4>5 -> false
		//3. 1==1 -> true
        //4. 1!=1 -> false
		 
		 //비교연산자
		 // >,<,==,<=,>=,!=(같지않다)
		 // !는 부정연산자
		 // true, false로 가려지는 것만 넣을 것 아니면 true,false만 가능
		 boolean check = !(1!=1) ;
		 boolean check2 = true;
		 
		 System.out.println(check);
		 System.out.println(check2);
		 
		// 좌항=우항; : 우항에 있는 것을 좌항에 대입
		// 수학 = : ==같다 비교연산지
		 
		 //넥슨 아이디 회원가입
		 String id = "minju최강전사";
		 String pw = "1234";
		 // 로그인
		 String id2 = "minju최강법사";
		 String pw2 = "4321";
		 
		 boolean check4 = id.equals(id2);
		 boolean check5 = pw.equals(pw2);
		 
		 // 로그인하려면 아이디, 비밀번호 두개가 꼭 동시에 맞아야 함
		 // 수학 and : && / or : || (shift+원화표시 누르면 나타남)
		 boolean check6 = id.equals(id2) && pw.equals(pw2);
	}
}
