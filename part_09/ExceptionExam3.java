package part_09;

public class ExceptionExam3 {

	public static void main(String[] args) {
		// ������ ���� �߻���Ű��
		int i = 10;
		int j = 0;
		// ���� ó��
		try {
		int k = divide(i, j);
		System.out.println(k);
		
		}catch (IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}
	
	public static int divide(int i, int j) throws IllegalArgumentException  { // ȣ���� �ʿ��� ���� ó���ϵ��� ��
		if (j == 0) { 
			// ���� �߻���Ű��
			throw new IllegalArgumentException("0���� ���� �� �����ϴ�."); 
		}
		int k = i/j;
		return k;
	}

}
