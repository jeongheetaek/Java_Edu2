package ch_01;

public class Ex07 {

	public static void main(String[] args) { // ex06 클래스를 외부 에러 함수로 설정한뒤 에러 발생히 ex06에 해당하는 에러내용 표현
	
		int kkk = 15;
		try {
			if (kkk > 10) throw new Ex06(); // 에러가 발생하지 않으면 수행
		} catch (Ex06 e) {
			System.out.println(e.getMessage());
		}

	}

}
