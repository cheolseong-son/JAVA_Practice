package part_08;

public class InnerExam2 {
	// ���� Ŭ����
	static class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� Ŭ����2 : ���� ��ø Ŭ���� �Ǵ� ����ƽ Ŭ����(static class)
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
		
	}

}
