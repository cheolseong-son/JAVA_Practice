package part_08;

public class InnerExam3 {
	// ���� Ŭ����
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
		// ���� Ŭ����3 : ���� ��ø Ŭ���� �Ǵ� ���� Ŭ����(local class),
		InnerExam3 t = new InnerExam3();
		t.exec();
	}

}
