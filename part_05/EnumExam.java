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
		
//		gender2 = "boy" // 에러 발생
	}

}
// 특정값만 사용해야 한다면 아래처럼 열거형으로 사용하면 좋다.
enum Gender{
	MALE, FEMALE;
}
