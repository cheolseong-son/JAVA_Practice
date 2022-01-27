package part_04;

public class ForEachExam {

	public static void main(String[] args) {
		// for each 구문
		int[] iarr = {10, 20, 30, 40, 50};
		
		
		// for 이용
		for(int i = 0; i < iarr.length; i++) {
			int value = iarr[i];
			System.out.println(value);
		}
		
		//for each 이용
		for(int value:iarr) {
			System.out.println(value);
		}
	}

}
