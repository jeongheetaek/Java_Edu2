package ch_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<>(); //순서는 유지, 중복은 허용하지 않는다.
		
		hm.put("이승우", "010-2222-3333");
		hm.put("손흥민", "010-2222-3333");
		hm.put("손흥민", "010-2223-3333");
		hm.put("전지현", "010-2242-3333");
		
		System.out.println("이승우 TEL: " + hm.get("이승우"));
		System.out.println("손흥민 TEL: " + hm.get("손흥민"));
		System.out.println("전지현 TEL: " + hm.get("전지현"));
		
		Set<String> st = hm.keySet(); // 순서 유지안함, 중복 허용 안함
		
		for(String str : st) {
			System.out.println(str + "의 전화[set] --> " + hm.get(str));
		}
		
		Iterator<String> it =hm.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + "의 전화" + hm.get(key));
		}

	}

}


