package day4;

public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;           //실수
		double b = 1;             //정수도 실수에 담기므로 출력-> 
		//정수 1이 double에 들어갈 수 있었던 것은 손실이 없었기 때문에 자동 캐스팅
		double b2 = (double)1;    //위와 동일한 형식(수동으로)
		
		System.out.println(b);
		
//		int c = 1.1;       //오류, 성립하지 않기 때문
		double d = 1.1;    //Change type of 'int' to 'double'
		int e = (int) 1.1; //Add cast to 'int'
		System.out.println(e);
		/***
		 * //(int) 괄호안에 int를 강조표시하며 넣으면서 강제로 정수로 만듬
		 * 1.1(double)ㅡ>1.0(int)
		 * 강제로 정수로 바꾸면 소숫점 밑에 있던 0.1이 사라지면서 '손실'이 일어남
		 * 손실이 있을 경우엔 반드시 명시적으로 형변환 해야함
		 * 손실이 일어날 수 있기때문에 우리가 명시적으로 int라고 하기전까지는 자동으로 해주지 않음
		 */
		
		// 1 to String (java int to string casting 구글검색)
		String f = Integer.toString(1);
		System.out.println(f);
		
		//여기의 1의 데이터타입은 숫자 1이 아니라 문자열임 이를 확인해보고 싶을땐
		System.out.println(f.getClass()); //getClass코드 이용
	}

}
