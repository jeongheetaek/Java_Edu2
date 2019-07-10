package ch_01;

public class MyException2 extends Exception{

	public String getMessage() {
		String ErrMss;
		ErrMss = "사장님 1000만원 넘 많아요, 좀 덕당히 합시다";
		return ErrMss;
	}
}
