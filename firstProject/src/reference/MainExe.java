package reference;

import java.util.Scanner;

public class MainExe {
	
	public static void main(String[] args) {
		// 1.�л� �� ����, 2.�л� �̸� �Է�, 3.���, 4.����
		String[] student = null;
		while(true) {
			showMenu();
			int choice = readInt("��ȣ�� �����ϼ���.");		
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
		System.out.println("��.");
	}
	
	public static void showMenu() {
		System.out.println("1.�л� �� ����, 2.�л� �̸� �Է�, 3.�л� ���, 4.����");
	}	
	
	
	public static int creatStudent() {
		int cnt = readInt("1. �л� ���� �Է��ϼ���.");
		return cnt;		
	}
	
	public static void inputValue(String[] studentInfo) {
		if (studentInfo == null) {
			System.out.println("���� �л� ���� �Է��ϼ���.");
			return;
		}
		for (int i= 0; i <studentInfo.length; i++) {
			studentInfo[i]=readString("2. �л� �̸��� �Է��ϼ���.");
		}
	}
		
	public static void studentList(String [] studentInfo) {
		if (studentInfo == null) {
			System.out.println("���� �л� ���� �Է��ϼ���.");
			return;
		}
		for (int i=0; i<studentInfo.length; i++) {
			System.out.printf("%d�� �л��� �̸��� %s\n", i, studentInfo[i]);
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
	

