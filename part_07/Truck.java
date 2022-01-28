package part_07;

public class Truck extends Car1 {
	public Truck() {
		super("소방차"); //Truck의 생성자가 호출이 될 때 자동으로 부모의 생성자도 호출, super() 자동으로 생성됨
		System.out.println("Truck의 기본 생성자입니다.");
	}
}
