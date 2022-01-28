package part_08;

public class InnerExam2 {
	// 내부 클래스
	static class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 내부 클래스2 : 정적 중첩 클래스 또는 스태틱 클래스(static class)
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
		
	}

}
