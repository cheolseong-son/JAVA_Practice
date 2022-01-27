package first;

public class ConstantExam {

	public static void main(String[] args) {
		// 상수는 한번 저장한 데이터 값을 변경 할 수 없다.
		int i;
		i = 10;
		i = 5;
		// 상수를 선언할 땐 앞에 final을 붙여준다.
		// 상수는 대문자 사용
		final int J;
		J = 10;
		
		// 중간에 바꾸는 것이 불가능 J = 5;
		
		double circleArea;
		final double PI = 3.14;
		circleArea = 3 * 3 * PI;
		
		final int OIL_PRICE = 1450;
		int totalPrice = 50 * OIL_PRICE;
		
	}

}
