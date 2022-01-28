package part_08;

public interface Calculator {

	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	
	// default 키워드를 이용하여 메소드 구현이 가능
	default int exec(int i, int j) {
		return i + j;
	}
	// static 키워드를 이요하여 메소드 구현이 가능
	public static int exec2(int i, int j) {
		return i * j;
	}
}
