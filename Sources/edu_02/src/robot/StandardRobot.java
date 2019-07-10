package robot;

import robot_action.Fireok;
import robot_action.Knifewithwood;
import robot_action.flyno;

public class StandardRobot extends Robot {

	public StandardRobot() {
		flyaction = new flyno();
		fireaction = new Fireok(); 
		knifeAction = new Knifewithwood();
	}
	
	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리, 몸통으로 이루어져 있습니다. 그리고 걷고, 달릴 수 있습니다.");
	}
}
