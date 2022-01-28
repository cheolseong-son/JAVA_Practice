package part_09;

public class ExceptionEXam2 {

	public static void main(String[] args) {
		// throws는 예외가 발생했을때 예외를 호출한 쪽에서 처리하도록 하는 것!
		int i = 10;
		int j = 0;
		//오류 처리 코드
		try {
		int k = divide(i, j);
		System.out.println(k);
		
	}catch (ArithmeticException e) {
		System.out.println(e.toString());
	}
	}
	// 메서드 
	public static int divide(int i, int j) throws ArithmeticException {
		int k = i/j;
		return k;
	}

}
