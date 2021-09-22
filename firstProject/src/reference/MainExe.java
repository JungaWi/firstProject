package reference;

import java.util.Scanner;

public class MainExe {
	
	public static void main(String[] args) {
		// 1.학생 수 지정, 2.학생 이름 입력, 3.출력, 4.종료
		String[] student = null;
		while(true) {
			showMenu();
			int choice = readInt("번호를 선택하세요.");		
			if(choice ==1) {
				int size = creatStudent();
				student = new String[size];
			}else if(choice ==2) {
				inputValue(student);
			}else if(choice ==3) {
				studentList(student);
			}else if(choice ==4) {
				break;
			}
		}
		System.out.println("끝.");
	}
	
	public static void showMenu() {
		System.out.println("1.학생 수 지정, 2.학생 이름 입력, 3.학생 목록, 4.종료");
	}	
	
	
	public static int creatStudent() {
		int cnt = readInt("1. 학생 수를 입력하세요.");
		return cnt;		
	}
	
	public static void inputValue(String[] studentInfo) {
		if (studentInfo == null) {
			System.out.println("먼저 학생 수를 입력하세요.");
			return;
		}
		for (int i= 0; i <studentInfo.length; i++) {
			studentInfo[i]=readString("2. 학생 이름을 입력하세요.");
		}
	}
		
	public static void studentList(String [] studentInfo) {
		if (studentInfo == null) {
			System.out.println("먼저 학생 수를 입력하세요.");
			return;
		}
		for (int i=0; i<studentInfo.length; i++) {
			System.out.printf("%d번 학생의 이름은 %s\n", i, studentInfo[i]);
		}
		
	}

	public static String readString(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		String menu = scn.nextLine();
		return menu;
	}
	 
	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;			
		
	}
		
			
}
	

