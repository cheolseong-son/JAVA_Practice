package part_05;

public class MyclassExam {

	public static void main(String[] args) {
		// Myclass 메서드 사용
		// 클래스가 가진 메소드를 사용하기 위해서는 객체로 만들어야 사용할 수 있음!
		Myclass myclass = new Myclass(); //객체 생성
		myclass.method();
		
		myclass.method2(10);
		
		int value = myclass.method3();
		System.out.println("m3이 리턴한 값 : " + value);
		
		myclass.method4(5, 10);
		
		int value2 = myclass.method5(15);
		System.out.println(value2 + " : m5의 리턴값");
		
	}

}
