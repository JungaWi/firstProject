package firstProject;

import java.util.Scanner;

public class WiJunga {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("서비스 몇 점");
		int a1 = scn.nextInt();
		System.out.println("음식 퀄리티 몇 점");
		int a2 = scn.nextInt();
		System.out.println("레스토랑 접근성 몇 점");
		int a3 = scn.nextInt();
		scn.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("연락처를 입력하세요.(필수X)");
		String number = scn.nextLine();

		if(number.equals ("")) {
			number = "0";
		}
		int numberInt = Integer.parseInt(number);
		
		int result = (a1 + a2 + a3) / 3;
		System.out.printf("%s 님의 평균 만족도는 %d\n", name, result);
		System.out.println("감사합니다.");
		
	}

}
