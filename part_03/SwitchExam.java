package part_03;

public class SwitchExam {

	public static void main(String[] args) {
		// switch, case, default, break
		// break�� ������� ������ case ���� ���� ������ ���ʴ�� case�� ���
		
		int value = 2;// ����, ���ڿ��� ����
		
		switch(value) { 
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("�� �� �ٸ� ����");
			break;
		}
		
		String str = "A";
		switch(str) {
		case "A":
			System.out.println("A");
			break;
		case "b":
			System.out.println("B");
		}
	}

}
