package ch_01;

import java.util.LinkedList;


public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> kk = new LinkedList<>();
		String[] animal = {"산토키", "고양이", "진도개", "치와와", "토기"};
		
		for(int i=0;i<animal.length;i++){
			kk.add(animal[i]);
		}
		int i=0;
		
		java.util.Iterator<String> it = kk.iterator();
		
		while(it.hasNext()) {
			System.out.println(i+"->" + it.next());
			i++;
		}
		
		i=0;
		while(!kk.isEmpty()) {
			System.out.println("poll 1번째");
			System.out.println(i+"->"+kk.poll());
			i++;
		}
		i=0;
		while(animal[i] != null) {
			System.out.println(animal[i]);
			i++;
		}
		
	}
}


