package part_05;

public class EnumExam {
	
	// 
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy" // ���� �߻�
	}

}
// Ư������ ����ؾ� �Ѵٸ� �Ʒ�ó�� ���������� ����ϸ� ����.
enum Gender{
	MALE, FEMALE;
}
