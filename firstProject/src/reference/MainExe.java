package reference;

import java.util.Scanner;

public class MainExe {
	
	public static void main(String[] args) {
		// 1.학생 수 지정, 2.학생 이름 입력, 3.출력, 4.종료
		String[] names = null;
		while(true) {
			showMenu();
			int choice = readInt("번호를 선택하세요.");
			
			if(choice ==1) {
				int size = creatStudent();
				names = new String[size];
			}
		}
		
	}
	
	public static void showMenu() {
		System.out.println("1.학생 수 지정, 2.학생 이름 입력, 3.출력, 4.종료");
	}
	
	public static int creatStudent() {
		int cnt = readInt("학생 수를 입력하세요.");
		return cnt;		
	}
	
	public static void inpuValue(String[] names) {
		for (String i= 0)
	}
	
	public static int readString(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		String choice = scn.nextLine();
		return choice;
	}
}
