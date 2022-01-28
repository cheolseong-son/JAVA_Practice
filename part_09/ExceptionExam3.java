package part_09;

public class ExceptionExam3 {

	public static void main(String[] args) {
		// 강제로 오류 발생시키기
		int i = 10;
		int j = 0;
		// 오류 처리
		try {
		int k = divide(i, j);
		System.out.println(k);
		
		}catch (IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}
	
	public static int divide(int i, int j) throws IllegalArgumentException  { // 호출한 쪽에서 오류 처리하도록 함
		if (j == 0) { 
			// 오류 발생시키기
			throw new IllegalArgumentException("0으로 나눌 수 없습니다."); 
		}
		int k = i/j;
		return k;
	}

}
