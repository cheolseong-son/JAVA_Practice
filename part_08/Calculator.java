package part_08;

public interface Calculator {

	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	
	// default Ű���带 �̿��Ͽ� �޼ҵ� ������ ����
	default int exec(int i, int j) {
		return i + j;
	}
	// static Ű���带 �̿��Ͽ� �޼ҵ� ������ ����
	public static int exec2(int i, int j) {
		return i * j;
	}
}
