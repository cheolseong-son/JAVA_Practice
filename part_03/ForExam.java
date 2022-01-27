package part_03;

public class ForExam {

	public static void main(String[] args) {
		//  for(초기화식; 조건식; 증감식)
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
