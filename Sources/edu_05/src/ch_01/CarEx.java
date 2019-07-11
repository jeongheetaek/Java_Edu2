package ch_01;

import java.util.ArrayList;

public class CarEx {

	public static void main(String[] args) {
		
		ArrayList<Car> al = new ArrayList<>(); //최상위 클래스를 사용한다. 
		
		al.add(new Car());
		al.add(new Bus());
		al.add(new Taxi());
		
		
		for(Car c : al) { //Car c 의 Car는 최상위 클래스만 가능한건가? 아님 어떤 클래스든 넣어도 해당 클래스 안의 메소드를 다 사용할 수 있는건가? (대표객체)
			c.print();
			if( c instanceof Bus) {
				((Bus)c).move();
				
				
//				Bus b = (Bus)c;
//				b.move();
			}
		}
	}

}
