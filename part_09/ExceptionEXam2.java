package part_09;

public class ExceptionEXam2 {

	public static void main(String[] args) {
		// throws�� ���ܰ� �߻������� ���ܸ� ȣ���� �ʿ��� ó���ϵ��� �ϴ� ��!
		int i = 10;
		int j = 0;
		//���� ó�� �ڵ�
		try {
		int k = divide(i, j);
		System.out.println(k);
		
	}catch (ArithmeticException e) {
		System.out.println(e.toString());
	}
	}
	// �޼��� 
	public static int divide(int i, int j) throws ArithmeticException {
		int k = i/j;
		return k;
	}

}
