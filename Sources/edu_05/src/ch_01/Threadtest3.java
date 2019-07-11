package ch_01;

import javax.swing.JOptionPane;

class C1 extends Thread{
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

public class Threadtest3 {
	public static void main( String [ ] args) {
		C1 c = new C1();
		c.start();
		String name = JOptionPane.showInputDialog("이건 뭐냐");
		System.out.println("당신의 이름은 " + name + "입니다.");
		
	}

}
