package ch03;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Employee {

	private final float RATE = 0.1f;
	
	private String name ;
	int pay, bonus;
	
	Employee() {}
	
	Employee(String name){
		this.name = name;
	}
	
	public int computePay() {
		return 0;
	}
	

	public final int computeIncentive() {
		pay = computePay();
		
		if(pay > 20000) {
			bonus = (int) (pay * RATE);
		}
		return bonus ;
	}

	public void print() {
		System.out.println(name + "의 급여 : " +pay+" , 상여 : "+ bonus);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public float getRATE() {
		return RATE;
	}

}
