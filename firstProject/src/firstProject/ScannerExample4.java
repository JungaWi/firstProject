package firstProject;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {
		// "100" vs. 100
		int num1 = 100;
		String num2 = "100";
		
		int num2Int = Integer.parseInt(num2);
		
		String num3 = "12.25";
		double num3Double = Double.parseDouble(num3);
		
		int result = num1 + num2Int;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력>>>");
		String name = scn.nextLine();
		System.out.println("나이를 입력>>>");
		String age = scn.nextLine();
		//나이를 꼭 입력하지 않아도 넘어가게끔 만드는 방법
		if(age.equals ("")) {
			age = "0";
		}
		int ageInt = Integer.parseInt(age);
		System.out.println("연락처를 입력>>>");
		String phone = scn.nextLine();
		System.out.println("[입력한 내용]");
		System.out.printf("이름:%s, 나이:%d, 연락처:%s\n", name, ageInt, phone);
		System.out.println("끝.");


	}

}
