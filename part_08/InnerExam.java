package part_08;


//내부 클래스 : 클래스 안에 선언된 클래스
public class InnerExam {
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 내부 클래스1 : 중첩 클래스 '또는 인스턴스 클래스(instance class)
		InnerExam t = new InnerExam();
		InnerExam.Cal cal = t.new Cal();
		cal.plus();
		System.out.println(cal.value);
		
		}

	}

