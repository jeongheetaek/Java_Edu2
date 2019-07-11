package ch_01;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		String[] pet = {"지렁이", "강아지", "멍멍이", "야옹이"};
		Stack<String> st = new Stack<>();
		
		for(String str : pet){
			System.out.println("push -->"+str); //넣기
			st.push(str); 
		}
		
		System.out.println("-----------------------------------");
		while(!st.isEmpty()) {
			System.out.println("pop ->" + st.pop()); //꺼내기
		}

	}

}
