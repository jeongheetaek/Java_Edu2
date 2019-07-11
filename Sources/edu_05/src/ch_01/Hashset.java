package ch_01;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("구렁2");
		hs.add("고양이");
		hs.add("야옹이");
		hs.add("구렁2");
		hs.add("진도개");
		hs.add("멍멍이");
		
		for(String str : hs) {
			System.out.println(str);
		}
		
		System.out.println("======================");
		java.util.Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
