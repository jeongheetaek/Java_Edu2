package ch_01;

import java.util.ArrayList;

public class ArrayL1 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>(); // 들어간 (입력된) 데이터들의 순서를 지켜주고, 중복을 혀용하고 있음을 보여준다.    -> 내가 만든 데이터는 대부분 list, 외부에서 가져오는 데이터는 중복제거를 위해 list를 사용하면 안되는건가?
		al.add("구렁2");
		al.add("팔렁이");
		al.add("구렁2");
		al.add("구렁4");
		al.add("구렁3");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("================================");
		for(String str : al) {
			System.out.println(str);
		}
		
	}

}
