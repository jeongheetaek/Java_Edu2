package ch_01;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> cha = new ArrayList<>();
		ArrayList<Integer> hap = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		cha.addAll(list1);
		cha.removeAll(list2);
		
		hap.addAll(cha);
		hap.addAll(list2);
		
		System.out.println(" 합칩합 : " + hap);
		System.out.println(" 차칩합 : " + cha);
		

	}

}
