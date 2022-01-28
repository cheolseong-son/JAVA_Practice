package part_09;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 0;
		
		
		//예외 처리 : Try-catch-finally
		try {
		int k = i / j;
		System.out.println(k);
		
		}catch (ArithmeticException e){ // Exception e로 사용 가능
			System.out.println("0으로 나눌 수 없음!"+ e.toString());
		}finally {
			System.out.println("오류가 발생하든 안하든 무조건 실행");
		}
		System.out.println("main end!");
		
		
	}

}
