package firstProject;

public class VariableExample2 {

	public static void main(String[] args) {
		// 이름, 나이, 참/거짓 
		int age = 25;
		
		int myAge = 28;
		String myName = "위정아";
		
		
		// age <= 나이 => 이름은 25세 이상.
		if(age <= myAge) {
			System.out.println(myName + "는 " + age + "세 이상.");
		}
		// age >= 나이 => 이름은 25세 이하. 어캐함?ㄱ-

		System.out.println("end of program.");

	}

}
