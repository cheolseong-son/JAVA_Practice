package part_06;

public class MethodOverloadExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass2 m = new Myclass2();
		
		System.out.println(m.plus(5, 10));
		
		System.out.println(m.plus("hello", "world"));
		
		System.out.println(m.plus(5, 10, 20));

	}

}
