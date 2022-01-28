package part_07;

public class BusExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bus2 bus = new Bus2();
//		bus.run();
		
		// 부모타입으로 자식객체를 참조하게 되면 부모가 가지고 있는 메소드만 사용할 수 있다.
		// 자식객체가 가지고 있는 메소드나 속성을 사용하고 싶다면 형변환 해야 한다.
		Car c = new Bus(); // 엄밀히 말해 형변환이 일어난 것
		c.run();
		
		// 형변환 // 
		Bus bus = (Bus) c;
		bus.run();
		bus.ppangppang();
		
	}
}
