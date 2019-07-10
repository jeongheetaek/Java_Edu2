package robot;

import robot_action.FireAction;
import robot_action.FlyAction;
import robot_action.KnifeAction;

public abstract class Robot {
	
	public FlyAction flyaction ; //부모 = FlyAction, instance = flyaction	
	public FireAction fireaction ;
	public KnifeAction knifeAction ;
	
	public Robot() {
		
	}
	
	public abstract void shape();
	public void actionFly() {
		flyaction.fly();
	}

	public void actionFire() {
		fireaction.fire();
	}
	public void actionKnife() {
		knifeAction.knife();
	}
	public void actionBasic() {
		System.out.println("팔, 다리, 머리, 몸통이 있습니다.");
	}
	
	
	
	public FlyAction getFlyaction() {
		return flyaction;
	}

	public void setFlyaction(FlyAction flyaction) {
		this.flyaction = flyaction;
	}

	
}
