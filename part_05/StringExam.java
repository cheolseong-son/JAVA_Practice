package part_05;

public class StringExam {

	public static void main(String[] args) {
		// String은 new 연산자를 이용하지 ㅇ낳고 인스턴스를 만들 수 있음
		String str1 = "hello";
	    String str2 = "hello";
		// str1,2는 같은 hello를 가르키고 있다.
		
		String str3 = new String("hello");
		String str4 = new String("Hello");
		// str3,4는 새로 인스턴스를 힙 영역에 만들어짐, 각각 존재
		
		 if(str1 == str2){  // 같은 인스턴스를 참조하므로 결과는 true 
		        System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		    }
		 
		 if(str1 == str3) {
			 System.out.println("str1과 str2는 같은 레퍼런스입니다."); //출력 안됨, 즉 다른 부분이다.
		 }
		 
		 if(str3 == str4){ 
		        System.out.println("str1과 str2는 같은 레퍼런스입니다.");//출력 안됨, 즉 다른 부분이다.
		    }
		// String은 한번 생성된 클래스는 변하지 않는다.
		//String이 가지고 있는 메소드중 String을 반환하는 메소드는 모두 새로운 String을 생성해서 반환한다.
		 System.out.println(str1.substring(3));
		 System.out.println(str1); // 변하지 않는다.

		 
		
	}

}
