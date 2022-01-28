package part_06;

public class Car {
	// 타입, 필드명
	// 카 객체의 속성
	String name; 
	int number;
	
	// 자동차 객체가 만들어질 때 반드시 이름을 가지도록 하고 싶을 때
	// 생성자
//	public Car(String n) {
//		name = n;
//	}
	
	// this는 현재 객체, 자기 자신을 참조하는 키워드
	public Car(String name) {
		this.name = name;
	}
	
	// 기본 생성자 정의
	public Car() {
//		this.name = "이름 없음";
//		this.number = 0;
		this("이름 없음", 0); // 중복코드 방지
	}
	
	// 두개 인자를 받는 생성자	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
}
