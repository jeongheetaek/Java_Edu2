package ch05;

public class Robotex {

	static void action (Robot r) {
		if( r instanceof DanceRobot) {
			((DanceRobot)r).dance();
		}
		else if ( r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		}
		else {
			SingRobot sr = (SingRobot) r;
			sr.sing();
		}
	}
	
	public static void main(String[] args) {
		Robot[] rb = new Robot[3] ;
		
		rb[0] = new DanceRobot();
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();
		
		for ( Robot r : rb)
			action(r);

	}

}
