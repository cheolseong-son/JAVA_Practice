package part_06;

public class Car {
	// Ÿ��, �ʵ��
	// ī ��ü�� �Ӽ�
	String name; 
	int number;
	
	// �ڵ��� ��ü�� ������� �� �ݵ�� �̸��� �������� �ϰ� ���� ��
	// ������
//	public Car(String n) {
//		name = n;
//	}
	
	// this�� ���� ��ü, �ڱ� �ڽ��� �����ϴ� Ű����
	public Car(String name) {
		this.name = name;
	}
	
	// �⺻ ������ ����
	public Car() {
//		this.name = "�̸� ����";
//		this.number = 0;
		this("�̸� ����", 0); // �ߺ��ڵ� ����
	}
	
	// �ΰ� ���ڸ� �޴� ������	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
}
