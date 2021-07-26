package day2;

public class Number {

	public static void main(String[] args) {
		//Operator(연산자)
		System.out.println(6+2); //8
		System.out.println(6-2); //4
		System.out.println(6*2); //12
		System.out.println(6/2); //3
		
		System.out.println(Math.PI); // 3.141592653589793
		System.out.println(Math.floor(Math.PI)); //3 (floor는 수학적으로 내림이므로 소숫점 없앰)
		System.out.println(Math.ceil(Math.PI));  //4 (ceil은 3.1459 3뒤에 1을 올려서 더해버림)
	
		System.out.println(7%2); //1 (%은 나머지를 추출하는 연산자 짱 신기하다!)
		System.out.println(Math.floor(Math.random()*10));
		//Math는 수학과 관련된 method(ex.floor,ceil)들을 담아놓은 class
	}

}
