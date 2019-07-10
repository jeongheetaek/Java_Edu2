package robot;

public class Mainclass {

	public static void main(String[] args) {

		System.out.println("SuperRobot 주문 들어왔어요. 만들어 주세요.");
		Robot superRobot = new Superrobot(); //부모 -> 자식
		superRobot.shape();
		superRobot.actionBasic(); //상위 클래스에 없으면 자동으로 그 상위 클래스까지 메소드를 찾으러 간다? 
		superRobot.actionFly();
		superRobot.actionFire();
		superRobot.actionKnife();
		
		System.out.println("--------------------------");
		
		System.out.println("StandardRobot 주문 들어왔어요. 만들어 주세요.");
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
		standardRobot.actionBasic();
		standardRobot.actionFly();
		standardRobot.actionFire();
		standardRobot.actionKnife();
		
		System.out.println("--------------------------");
		
		System.out.println("CheapRobot 주문 들어왔어요. 만들어 주세요.");
		Robot cheapRobot = new CheapRobot();
		cheapRobot.shape();
		cheapRobot.actionBasic();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		cheapRobot.actionKnife();
		
		System.out.println("--------------------------");
	}

}
