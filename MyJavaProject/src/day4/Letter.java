package day4;

public class Letter {

	public static void main(String[] args) {
//변수의 효용
		String name = "nexon";
		System.out.println("Hello, yoon. maple redlabel bye");
		System.out.println("Hello, "+name+".."+name+" blacklabel bye");
	  //+name+ 변수에 새로운 이름이 들어가겠구나 하는걸 추론 가능
		
		double VAT = 10.0;
		System.out.println(10);  //다른 사람이 의미 파악 불가능
		System.out.println(VAT); //보는 사람이 파악 가능
	}

}
