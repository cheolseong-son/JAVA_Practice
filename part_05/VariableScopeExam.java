package part_05;

public class VariableScopeExam {
	// 
	int globalScope = 10;
	static int staticVal = 7;// static한 필드

	//메서드
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	//메서드
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope); // 에러 발생, 범위를 벗어났기에 사용 불가
//		System.out.println(value);
		System.out.println(value2);
	}
	
	
	public static void main(String[] args) {
		// 사용 불가, 모든 클래스는 인스턴스화 하지 않은 채로 사용할 수 없다.
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		
		// static : 키워드 static을 사용하면 인스턴스화 하지 않아도 사용할 수 있다.
		System.out.println(staticVal);
		
		// static한 메서드에서 static하지 않은 변수를 사용하려면 객체를 생성하여 사용
		// 인스턴스가 생성될 때 따로 생성되기때문에 값을 공유하지 않는다.
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		// 클래스 변수 : static한 변수, 값을 저장할 수 있는 공간이 하나밖에 없어서 값을 공유한다.
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);

		// 인스턴스가 생성되지 않아도 사용할 수 있기때문에 아래와 같이 사용하는 것이 바람직하다.
		System.out.println(VariableScopeExam.staticVal);
		
	}
}
