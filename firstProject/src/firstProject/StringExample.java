package firstProject;

public class StringExample {
	// byte < short < int < long < float < double
	public static void main(String[] args) {
		int age = 20;
		String name = "홍길동";
		
		long myAge = age; // 자동형변환(promotion)
		age = (int) myAge; // 강제형변환(casting)
		
//		age = "홍길동";
//		name = 20;
		System.out.println(name + "의 나이는 " + age);
		
		age = 28;
		name = "위정아";
		System.out.println(name + "의 나이는 " + age + "입니다.");
	}

}
