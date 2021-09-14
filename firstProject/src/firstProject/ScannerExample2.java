package firstProject;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		// 변수: 사용자 입력 (10, 20)
		// 10 + 20 = 30
		
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요");
		int age1 = scn.nextInt();
		System.out.println("두번째 값을 입력하세요");
		int age2 = scn.nextInt();
		
		int result = age1 + age2;
		
		
		System.out.println(age1+"+"+age2+"="+result);
	}

}
