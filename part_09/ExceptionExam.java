package part_09;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 0;
		
		
		//���� ó�� : Try-catch-finally
		try {
		int k = i / j;
		System.out.println(k);
		
		}catch (ArithmeticException e){ // Exception e�� ��� ����
			System.out.println("0���� ���� �� ����!"+ e.toString());
		}finally {
			System.out.println("������ �߻��ϵ� ���ϵ� ������ ����");
		}
		System.out.println("main end!");
		
		
	}

}
