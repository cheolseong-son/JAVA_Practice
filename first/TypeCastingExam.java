package first;

public class TypeCastingExam {

	public static void main(String[] args) {
		// 타입 변환
		// int --> long, 문제없이 형 변환 일어남, 묵시적 형변환
		int x = 50000;
		long y = x;
		
		
		// long --> int, 강제 형변환
		long x2 = 5;
		int y2 = (int) x2;
		
	}

}
