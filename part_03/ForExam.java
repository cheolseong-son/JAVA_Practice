package part_03;

public class ForExam {

	public static void main(String[] args) {
		//  for(�ʱ�ȭ��; ���ǽ�; ������)
		int total = 0;
		
		for (int i = 1; i <= 100; i++) {
//			if(i % 2 !=0) {
//				continue;
//			}
			
			total += i; //
			if(i == 50) {
				break;
			}
		}
		System.out.println(total);
	}

}
