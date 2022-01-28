package part_08;

public class MyCalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		// static한 메서드를 호출할 때
		Calculator.exec2(8, 9);
	}

}
