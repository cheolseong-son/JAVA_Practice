package part_03;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// �ѹ��� ������ ����Ǵ� �ݺ���
		int value = 0;
		Scanner scan = new Scanner(System.in); //�� �Է�
		
		do{
			// �ݺ��� �����
			value = scan.nextInt();
			System.out.println("�Է¹��� ��:"+value);
			
		}while(value != 10);
		
		System.out.println("�ݺ��� ����");
	}

}
