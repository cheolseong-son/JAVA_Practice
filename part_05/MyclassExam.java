package part_05;

public class MyclassExam {

	public static void main(String[] args) {
		// Myclass �޼��� ���
		// Ŭ������ ���� �޼ҵ带 ����ϱ� ���ؼ��� ��ü�� ������ ����� �� ����!
		Myclass myclass = new Myclass(); //��ü ����
		myclass.method();
		
		myclass.method2(10);
		
		int value = myclass.method3();
		System.out.println("m3�� ������ �� : " + value);
		
		myclass.method4(5, 10);
		
		int value2 = myclass.method5(15);
		System.out.println(value2 + " : m5�� ���ϰ�");
		
	}

}
