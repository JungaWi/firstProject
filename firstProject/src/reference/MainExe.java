package reference;

import java.util.Scanner;

public class MainExe {
	
	public static void main(String[] args) {
		// 1.�л� �� ����, 2.�л� �̸� �Է�, 3.���, 4.����
		String[] names = null;
		while(true) {
			showMenu();
			int choice = readInt("��ȣ�� �����ϼ���.");
			
			if(choice ==1) {
				int size = creatStudent();
				names = new String[size];
			}
		}
		
	}
	
	public static void showMenu() {
		System.out.println("1.�л� �� ����, 2.�л� �̸� �Է�, 3.���, 4.����");
	}
	
	public static int creatStudent() {
		int cnt = readInt("�л� ���� �Է��ϼ���.");
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
