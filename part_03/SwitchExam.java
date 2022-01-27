package part_03;

public class SwitchExam {

	public static void main(String[] args) {
		// switch, case, default, break
		// break를 사용하지 않으면 case 값과 같은 값부터 차례대로 case문 출력
		
		int value = 2;// 정수, 문자열도 가능
		
		switch(value) { 
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("그 외 다른 숫자");
			break;
		}
		
		String str = "A";
		switch(str) {
		case "A":
			System.out.println("A");
			break;
		case "b":
			System.out.println("B");
		}
	}

}
