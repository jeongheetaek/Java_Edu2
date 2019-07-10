package ch_01;

public class MyException1 extends Exception{
	
	public String getMessage() {
		String ErrMss;
		ErrMss = "사장님 100만원 보다 적어요 !! 이 뭡니다";
		return ErrMss;
	}

}
