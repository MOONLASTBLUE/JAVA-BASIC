import org.opentutorials.iot.Elevator; 
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
//import를 통해 Elevator를 짧게 써서 부를 수 있음

public class OkJavaGoinHome {

	public static void main(String[] args) {
		String id = "JAVA APT 507";
		
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
		
		/***
		 * 디버거(벌레모양 아이콘)
		 * 디버거를 이용하면 프로그램을 한 줄씩 실행 시킬 수 있음
		 * 실행되는 순간에 애플리케이션 내에 변수 상태를 하나씩 체크가능
		 * 
		 * 입력과 출력
		 * 구글창에 "java popup input text swing"
		 */
		 
			}

}
