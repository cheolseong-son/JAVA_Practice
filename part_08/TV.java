package part_08;

// �������̽�: ���� ���谡 ���� ��ü���� ��ȣ �ۿ��� �ϱ� ���ؼ� ����ϴ� ��ġ�� �ý���
// 
public interface TV {
	// ��� ���� 
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	// �޼��� 
	public void turnOn(); // �߻�޼���� ���, ������ ���� ��ɸ� ������ �ִ� ��
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
