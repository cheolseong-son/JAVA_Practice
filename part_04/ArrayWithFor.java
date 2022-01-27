package part_04;

public class ArrayWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] iarray = new int[100];
		
		iarray[0] = 1;
		iarray[1] = 2;
		System.out.println(iarray.length); //배열의 크기
		
		//크기 100인 배열에 1 ~ 100 저장
		for(int i = 0; i <iarray.length; i++) {
			iarray[i] = i + 1;
		}
		//배열값을 다 더하기
		int sum = 0;
		for(int i = 0; i<iarray.length; i++) {
			sum += iarray[i];
		}
		System.out.println(sum);
	}

}
