package part_08;

// 인터페이스: 서로 관계가 없는 물체들이 상호 작용을 하기 위해서 사용하는 장치나 시스템
// 
public interface TV {
	// 상수 정의 
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	// 메서드 
	public void turnOn(); // 추상메서드와 비슷, 구현은 없고 기능만 가지고 있는 것
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
