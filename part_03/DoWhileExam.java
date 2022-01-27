package part_03;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// 한번은 무조건 실행되는 반복문
		int value = 0;
		Scanner scan = new Scanner(System.in); //값 입력
		
		do{
			// 반복할 문장들
			value = scan.nextInt();
			System.out.println("입력받은 값:"+value);
			
		}while(value != 10);
		
		System.out.println("반복문 종료");
	}

}
