package part_06;

public class Myclass2 {
	// 메서드 오버로딩 : 매개변수의 수, 타입이 다른 경우 동일한 이름으로 메소드를 여러 개 정의 할 수 있다.
	// 
	public int plus(int x, int y) {
		return x + y;
	}
	
	//
	public int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	public String plus(String x, String y) {
		return x + y;
	}
}
