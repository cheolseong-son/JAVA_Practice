package part_04;

public class ArrayExam {

	public static void main(String[] args) {
		// 배열,   int[] array1 = new int[배열 크기];
		// 배열의 크기는 나중에 변경할 수 없음
		
		int[] array1 = new int [100]; // 
		
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[]{1,2,3,4}; //배열 4개짜리에 값 1,2,3,4 있는 배열 array2
		
		int[] array3 = {1,2,3,4};
		
		System.out.println(array3[3]);
		
		int value = array3[0];
		System.out.println("value : "+value);		
		
	}

}
