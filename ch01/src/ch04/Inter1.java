package ch04;

public interface Inter1 {
	int AA = 3;
	void display();
	void print();
	

}

class D1 implements Inter1 {
	
	public void display() {
		//AA = AA + 1; // Fianl 필드는 값 수정이 불가능하다.
		System.out.println("재정의 했으 .... a --> " + AA);
		// TODO Auto-generated method stub
		
	}
	public void print() {
		System.out.println("나도야 간다");
	}

}

/*
 public abstract class Inter1 {
	int AA = 3;
	abstract void display();
	abstract void print();
	

}

class D1 extends Inter1 {
	
	public void display() {
		//AA = AA + 1; // Fianl 필드는 값 수정이 불가능하다.
		System.out.println("재정의 했으 .... a --> " + AA);
		// TODO Auto-generated method stub
		
	}
	public void print() {
		System.out.println("나도야 간다");
	}

}

*/