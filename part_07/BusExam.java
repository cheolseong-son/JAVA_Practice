package part_07;

public class BusExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus();
		
		bus.run(); //상속 받은 것
		bus.ppangppang(); // 
		
		// 부모 클래스 
		Car car = new Car();
		car.run();
		// car.ppangppang(); // 자식 클래스에 있는 것은 사용 못함 
	}

}
