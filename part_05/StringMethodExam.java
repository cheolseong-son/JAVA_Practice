package part_05;

public class StringMethodExam {

	public static void main(String[] args) {
		// 
//		String str = new String("hello");
		
		String str = "hello world";
//		str.length() //������ ����
		System.out.println(str.length());
		
		// ���ڿ��� ���ڿ� ����
		System.out.println(str.concat(" friends"));
		
		System.out.println(str);
		
		str = str.concat(" friends");
		System.out.println(str);
		
		//���� �߶󳻱�
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,6)); // 3�ε������� 6�ε�������

		
	}

}
