package part_04;

public class ArrayExam {

	public static void main(String[] args) {
		// �迭,   int[] array1 = new int[�迭 ũ��];
		// �迭�� ũ��� ���߿� ������ �� ����
		
		int[] array1 = new int [100]; // 
		
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[]{1,2,3,4}; //�迭 4��¥���� �� 1,2,3,4 �ִ� �迭 array2
		
		int[] array3 = {1,2,3,4};
		
		System.out.println(array3[3]);
		
		int value = array3[0];
		System.out.println("value : "+value);		
		
	}

}