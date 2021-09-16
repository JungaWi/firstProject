package reference;

import java.util.Scanner;

public class AppMain {
	
	public static void main(String[] args) {
		//학생 정보를 생성, 점수 분석.
		
		//학생 인원 지정, 학생 점수, 전체 리스트, 분석:평균, 최고점, 종료.
		int[] scores = null;
		while(true) {
			showMenu();
			int choice = readInt("번호를 선택하세요.");
			
			if(choice == 1) {
				int size = createStudent();
				scores = new int[size];
			} else if (choice == 2) {
				inputValue(scores);
				
			} else if (choice == 3) {
				showList(scores);				
				
			} else if (choice == 4) {
				analysis(scores);

			} else if (choice == 5) {
				break;
			}
		}
		System.out.println("끝.");
	}
	
	public static void showMenu() {
		System.out.println("1:학생 인원 지정, 2:학생 점수 입력, 3:전체 리스트, 4:분석:평균, 최고점, 5:종료.");
	}
	
	public static int createStudent() {
		int cnt = readInt("학생 수를 입력하세요.");
		return cnt;
		}

	public static void inputValue(int[] ary) {
		if (ary == null) {
			System.out.println("먼저 학생 수를 입력하세요.");
			return;
		}
		for (int i = 0; i< ary.length; i++) {
			ary[i] = readInt("학생 점수를 입력하세요.");			
		}
	}
	
	public static void showList(int[] ary) {
		if (ary == null) {
			System.out.println("먼저 학생 수를 입력하세요.");
			return;
		}
		for(int i=0; i<ary.length; i++) {
			// scores[0] => 88
			System.out.printf("scores[%d] => %d\n", i, ary[i]);
		}
		
		
	}
	
	public static void analysis(int[] ary) {
			return;
		}
		// 평균, 최고점 => 콘솔.
		int sum = 0;
		for(int num : ary)
			sum +=num;		
		double avg = (double) sum / ary.length;
		
		int maxVal = 0;
		boolean isTrue = false;		
		for(int i=0; i<ary.length; i++ ) {
			isTrue=maxVal < ary[i];
			if (isTrue) { 
				maxVal = ary[i]; 
			}
		}		
		System.out.printf("평균:%d, 최고점:%d", avg, maxVal);
		
	}
	
	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;
		
	}
}
