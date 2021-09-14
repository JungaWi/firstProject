package firstProject;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		//영어점수 입력
		//수학점수 입력
		//이름입력
		//홍길동님의 영어수학점수 합은?, 평균은> 입니다.
		Scanner scn = new Scanner(System.in);
		System.out.println("영어 점수를 입력하세요.");
		int a1 = scn.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int a2 = scn.nextInt();
		scn.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		
		
		int result1 = a1 + a2;
		int result2 = (a1 + a2) / 2;
		
		if (result2 >= 120)
			System.out.println(name + " 님은 합격입니다.");
		if (result2 < 120)
			System.out.println(name + " 님은 불합격입니다.");
		
		System.out.printf("%s 님의, 영어, 수학 점수 합은? %d, 평균은? %d", name, result1, result2);
		
		
		
	}

}
