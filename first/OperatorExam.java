package first;

public class OperatorExam {

	public static void main(String[] args) {
		// 연산자
		// 부호 연산자 (+, -)
		// 산술 연산자 (+, - , *, /, %)
		// 증감 연산자 (++, --)
		
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // 6 출력
		System.out.println(i4);
		System.out.println(i3);
		
		
		int i5 = i3++;
		System.out.println(i5); //i3을 i5에 대입하고 +1을 하기에 6이 출력됨
		System.out.println(i3);
		
		
		int i = 5;
		int j = 2;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / (double)j); // 나눈 몫, 2.5로 값을 출력하고 싶다면 하나를 실수로 만들어야 함
		System.out.println(i % j); // 나머지 값
	}

}
