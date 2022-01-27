package first;

public class OperatorExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c);
		System.out.println((a - b) * c);
		
		System.out.println(a > 5 && b > 5);
		System.out.println(a > 5 || b > 5);
		
		System.out.println(++a - 5); //  a는 6이 되고 5를 빼줌, 1 출력
		
		// a = 6
		System.out.println(a++ - 5); //  a는 5가 되고 5를 빼서 0 출력, 그리고 a에 1을 더하여 a = 6이 됨
		System.out.println(a); //6 출력
	}

}
