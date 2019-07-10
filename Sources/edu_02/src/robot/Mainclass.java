package robot;

public class Mainclass {

	public static void main(String[] args) {

		System.out.println("SuperRobot 주문 들어왔어요. 만들어 주세요.");
		Robot superRobot = new Superrobot();
		superRobot.shape();
		superRobot.actionBasic();
		superRobot.actionFly();
		superRobot.actionFire();
		
		System.out.println("--------------------------");
		
		System.out.println("StandardRobot 주문 들어왔어요. 만들어 주세요.");
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
		standardRobot.actionBasic();
		standardRobot.actionFly();
		standardRobot.actionFire();
		
		System.out.println("--------------------------");
		
		System.out.println("CheapRobot 주문 들어왔어요. 만들어 주세요.");
		Robot cheapRobot = new CheapRobot();
		cheapRobot.shape();
		cheapRobot.actionBasic();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		
		System.out.println("--------------------------");
	}

}
