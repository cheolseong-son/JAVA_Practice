package part_07;

public class BusExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bus2 bus = new Bus2();
//		bus.run();
		
		// �θ�Ÿ������ �ڽİ�ü�� �����ϰ� �Ǹ� �θ� ������ �ִ� �޼ҵ常 ����� �� �ִ�.
		// �ڽİ�ü�� ������ �ִ� �޼ҵ峪 �Ӽ��� ����ϰ� �ʹٸ� ����ȯ �ؾ� �Ѵ�.
		Car c = new Bus(); // ������ ���� ����ȯ�� �Ͼ ��
		c.run();
		
		// ����ȯ // 
		Bus bus = (Bus) c;
		bus.run();
		bus.ppangppang();
		
	}
}
