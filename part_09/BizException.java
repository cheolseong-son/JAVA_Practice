package part_09;

// ����� ���� Exception
public class BizException extends RuntimeException {
	
	public BizException(String msg) {  // ���ڿ��� �� �����޼����� ��� ������
		super (msg);                   // �θ��� �����ڿ��� �޼����� �ѱ�
	}

	public BizException(Exception ex) { // ���� �߻��� exception�� ��� ������
		super(ex);						// �θ��� �����ڿ��� ex�� �ѱ�
	}
}
