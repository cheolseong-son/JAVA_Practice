package part_05;

public class StringExam {

	public static void main(String[] args) {
		// String�� new �����ڸ� �̿����� ������ �ν��Ͻ��� ���� �� ����
		String str1 = "hello";
	    String str2 = "hello";
		// str1,2�� ���� hello�� ����Ű�� �ִ�.
		
		String str3 = new String("hello");
		String str4 = new String("Hello");
		// str3,4�� ���� �ν��Ͻ��� �� ������ �������, ���� ����
		
		 if(str1 == str2){  // ���� �ν��Ͻ��� �����ϹǷ� ����� true 
		        System.out.println("str1�� str2�� ���� ���۷����Դϴ�.");
		    }
		 
		 if(str1 == str3) {
			 System.out.println("str1�� str2�� ���� ���۷����Դϴ�."); //��� �ȵ�, �� �ٸ� �κ��̴�.
		 }
		 
		 if(str3 == str4){ 
		        System.out.println("str1�� str2�� ���� ���۷����Դϴ�.");//��� �ȵ�, �� �ٸ� �κ��̴�.
		    }
		// String�� �ѹ� ������ Ŭ������ ������ �ʴ´�.
		//String�� ������ �ִ� �޼ҵ��� String�� ��ȯ�ϴ� �޼ҵ�� ��� ���ο� String�� �����ؼ� ��ȯ�Ѵ�.
		 System.out.println(str1.substring(3));
		 System.out.println(str1); // ������ �ʴ´�.

		 
		
	}

}
