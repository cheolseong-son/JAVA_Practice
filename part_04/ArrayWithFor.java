package part_04;

public class ArrayWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] iarray = new int[100];
		
		iarray[0] = 1;
		iarray[1] = 2;
		System.out.println(iarray.length); //�迭�� ũ��
		
		//ũ�� 100�� �迭�� 1 ~ 100 ����
		for(int i = 0; i <iarray.length; i++) {
			iarray[i] = i + 1;
		}
		//�迭���� �� ���ϱ�
		int sum = 0;
		for(int i = 0; i<iarray.length; i++) {
			sum += iarray[i];
		}
		System.out.println(sum);
	}

}
