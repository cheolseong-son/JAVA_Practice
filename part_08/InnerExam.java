package part_08;


//���� Ŭ���� : Ŭ���� �ȿ� ����� Ŭ����
public class InnerExam {
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� Ŭ����1 : ��ø Ŭ���� '�Ǵ� �ν��Ͻ� Ŭ����(instance class)
		InnerExam t = new InnerExam();
		InnerExam.Cal cal = t.new Cal();
		cal.plus();
		System.out.println(cal.value);
		
		}

	}

