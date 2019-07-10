package ch_01;

public class Ex06 extends Exception{

	public String getMessage() {
		
		//super.getMessage()getMessage();
		
		String ErrMsg;
		
		ErrMsg = "아니 10보다 크다니";
		
		return ErrMsg;
		
	}
}
