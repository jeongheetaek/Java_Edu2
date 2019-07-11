package ch_01;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");
		
		System.out.println("요소의 개수 - > " + list.size());
		System.out.println(" >> Iterator 객체로 요소 얻기 <<");
		
		//java.util.Iterator<String> elements = list.iterator();
		java.util.Iterator<String> elements = list.iterator();
		
		while(elements.hasNext()) // 다음요소가 있는지 물어본다.
			System.out.print(elements.next()+ "\t"); //해당 포인터 요소 출력
		
		System.out.println();
		
		System.out.println(">> get 메소드로 요소얻기 <<");
		
		for(int i =0; i<list.size(); i++)
			System.out.println(list.get(i) + "\t");
		System.out.println();
		
	}

}

