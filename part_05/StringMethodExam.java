package part_05;

public class StringMethodExam {

	public static void main(String[] args) {
		// 
//		String str = new String("hello");
		
		String str = "hello world";
//		str.length() //문자의 길이
		System.out.println(str.length());
		
		// 문자열과 문자열 결합
		System.out.println(str.concat(" friends"));
		
		System.out.println(str);
		
		str = str.concat(" friends");
		System.out.println(str);
		
		//문자 잘라내기
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,6)); // 3인덱스부터 6인덱스까지

		
	}

}
