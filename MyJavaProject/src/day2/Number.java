package day2;
public class Number{
	public static void main(String [] args) {
		System.out.println(6); //Number
		System.out.println("six"); //String
		
		System.out.println("6"); //String 6 - 문자로 인식
		// 각각의 데이터 타입에 따라 연산이 다르므로 엄격하게 분리 필요
		
		System.out.println(6+6); // 12
		System.out.println("6"+"6"); // 66 (결합연산자)
		
		System.out.println(6*6); // 36
	  //System.out.println("6"*"6"); //오류, 6*6은 데이터가 맞지 않아서 안됨
	
		System.out.println("1111".length()); // 4 , 문자열의 길이를 알려주는 연산
	  //System.out.println(1111.length()); // 오류, 숫자는 숫자열의 길이를 알려주는 연산X
	}
}