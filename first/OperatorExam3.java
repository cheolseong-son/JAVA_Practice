package first;

public class OperatorExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c);
		System.out.println((a - b) * c);
		
		System.out.println(a > 5 && b > 5);
		System.out.println(a > 5 || b > 5);
		
		System.out.println(++a - 5); //  a�� 6�� �ǰ� 5�� ����, 1 ���
		
		// a = 6
		System.out.println(a++ - 5); //  a�� 5�� �ǰ� 5�� ���� 0 ���, �׸��� a�� 1�� ���Ͽ� a = 6�� ��
		System.out.println(a); //6 ���
	}

}
