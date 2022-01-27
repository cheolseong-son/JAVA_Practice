package part_05;

public class Myclass {
//	public 리턴타입 메서드명 (매개변수) {구현}
	// 리턴타입이 없을 경우 void를 사용함
	public void method() {
		System.out.println("m1이 실행함");
	}
	
	// 
	public void method2(int x) {
		System.out.println(x + "를 이용한 m2 실행");
	}
	
	//
	public int method3() {
		System.out.println("m3 실행");
		return 10;
	}
	
	//
	public void method4(int x, int y) {
		System.out.println(x + y+"m4를 실행함");
	}
	
	//
	public int method5(int y) {
		System.out.println(y+"이용한 m5 실행");
		return y*2;
	}
}
