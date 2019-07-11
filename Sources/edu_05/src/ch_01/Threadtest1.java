package ch_01;

class A1 extends Thread{ //스레드를 상속받는 순간 A1은 스레드가 된다.
	A1(String str){
		super(str);
	}
	public void run() {
		for(int i=1; i<= 100; i++) {
			System.out.print(getName() + i+ " \t");
			if( i%10 == 0) System.out.println();
			try {
				Thread.sleep(50);
			}catch (InterruptedException e) {
			}
		}
		super.run();
	}
}
public class Threadtest1{
	public static void main(String [] args) {
		A1 a1 = new A1("subA");
		A1 a2 = new A1("subB");
		a1.start();
		a2.start();
		
		for(int i=1; i<=100; i++){
			System.out.print("Main " + i + "\t");
			if( i %10 == 0) System.out.println();
		}
	}

}