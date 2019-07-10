package robot;

//import robot_action.FireNo;
import robot_action.Fireok;
import robot_action.Knifeno;
import robot_action.flyno;

public class CheapRobot extends Robot { //abstract 는 
	
	public CheapRobot() {
		flyaction = new flyno();
		fireaction = new Fireok();
		knifeAction = new Knifeno();
		//fireaction = new FireNo();
		
	}
	
	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리, 몸콩으로 이루어져 있습니다. 그리고 걷고, 달릴 수 있습니다.");
	}

}
