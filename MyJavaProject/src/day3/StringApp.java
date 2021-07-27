package day3;

public class StringApp {

	public static void main(String[] args) {
		System.out.println("Hello World"); //String-문자열,문자(Cha)가 모여있는 것
	  //System.out.println('Hello World'); //Character(Cha)- '', 한글자를 표현하는 데이터 타입
		System.out.println("H");           //""안에 들어가있으므로 문자열인 String
		
	  //System.out.println("Hello "
	  //					+"World");     //이렇게 해도 줄바꿈은 안됨
		//New line(\n)
		System.out.println("Hello \nWorld"); //(역슬래시)\n=줄바꿈=NEW LINE
		
		//excape -> Hello "World"
		System.out.println("Hello \"world\"");  //\(역슬래시)는 일시적으로 그 뒤에 오는 문자의 임무를 해방시킴
		                                        //""는 문자열의 시작과 끝
	
	}

}   
