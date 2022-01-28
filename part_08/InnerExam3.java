package part_08;

public class InnerExam3 {
	// 내부 클래스
	public void exec() {
		class Cal{
			int value = 0;
			public void plus() {
				value++;
			}
		}
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	} //
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 내부 클래스3 : 지역 중첩 클래스 또는 지역 클래스(local class),
		InnerExam3 t = new InnerExam3();
		t.exec();
	}

}
