package ch_01;

import java.util.ArrayList;

public class ArrayL2 {

	public static void print(ArrayList<String> list) {
		for( String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println("\n-----------------------------------------------");
	}
	
	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("수박");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");
		
		System.out.println("갯수 : " + list.size());
		print(list);
		
		list.add(1,"키위"); //추가 (뒤에 인덱스 하나씩 밀림) //굉장히 유연하다.
		print(list);
		list.set(4, "봉숭아"); //삽입 (해당 인덱스에 덮어쓰기)
		print(list);
		list.remove(0); 
		print(list);
		
		System.out.println("4번 인덱스 --> " + list.get(3));
		System.out.println("바나나 문의 1 : " + list.contains("바나나"));
		System.out.println("바나나 문의 2 : " + list.indexOf("바나나"));
		System.out.println("바나나 문의 3 : " + list.lastIndexOf("바나나"));
		
		for(int i=0; i< list.size(); i++) {
			if(list.get(i).equals("바나나")) {
				list.set(i,  "딸기");
			}
		}
		System.out.println();
		print(list);
		
		
	}
}
