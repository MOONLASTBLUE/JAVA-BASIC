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
		
		String id = JOptionPane.showInputDialog("Enter a id");
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		
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
			}

}
