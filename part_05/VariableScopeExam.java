package part_05;

public class VariableScopeExam {
	// 
	int globalScope = 10;
	static int staticVal = 7;// static�� �ʵ�

	//�޼���
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	//�޼���
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope); // ���� �߻�, ������ ����⿡ ��� �Ұ�
//		System.out.println(value);
		System.out.println(value2);
	}
	
	
	public static void main(String[] args) {
		// ��� �Ұ�, ��� Ŭ������ �ν��Ͻ�ȭ ���� ���� ä�� ����� �� ����.
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		
		// static : Ű���� static�� ����ϸ� �ν��Ͻ�ȭ ���� �ʾƵ� ����� �� �ִ�.
		System.out.println(staticVal);
		
		// static�� �޼��忡�� static���� ���� ������ ����Ϸ��� ��ü�� �����Ͽ� ���
		// �ν��Ͻ��� ������ �� ���� �����Ǳ⶧���� ���� �������� �ʴ´�.
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		// Ŭ���� ���� : static�� ����, ���� ������ �� �ִ� ������ �ϳ��ۿ� ��� ���� �����Ѵ�.
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);

		// �ν��Ͻ��� �������� �ʾƵ� ����� �� �ֱ⶧���� �Ʒ��� ���� ����ϴ� ���� �ٶ����ϴ�.
		System.out.println(VariableScopeExam.staticVal);
		
	}
}
