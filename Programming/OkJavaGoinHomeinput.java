import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator; 
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
//import를 통해 Elevator를 짧게 써서 부를 수 있음

public class OkJavaGoinHomeinput {

	public static void main(String[] args) {
		
		//입력과 출력
		// * 구글창에 "java popup input text swing"
		
//		String id = JOptionPane.showInputDialog("Enter a id");
		String id = args[0];
		
//		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		String bright = args[1];
		
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / HallLamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
		//밝기조절램프
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
		//String to double conversion
		//double value = Double.parseDouble(text);
		
		//어떤 INPUT이 있는게 어떻게 프로그램안에 INPUT을 끌여들여올 수 있는가
		
		/***
		 * Argument & Parameter
		 * -Run ㅡ> Run configurationsㅡ>해당 하는 파일 선택 ㅡ> Arguments ㅡ> 원하는 값 입력
		 * Parameter = args(매개변수) : 입력한 arguments 값이 args로 들어오게 됨
		 * 고로, 사용자가 입력한 값이 args라는 파라미터를 통해 들어오게 됨 
		 * 그 파라미터 여러개의 값이 들어올때는 [] 대괄호의 0번째부터 입력해서 입력값을 받아올 수 있으며,
		 * Run configurations을 통해 argument를 통해 입력값 조정 가능
		 * 
		 * Organize favorites를 통해 자주 사용하는 run 등록해놓으면 run test시에 편함
		 */
			}

}
