package firstProject;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		//�������� �Է�
		//�������� �Է�
		//�̸��Է�
		//ȫ�浿���� ����������� ����?, �����> �Դϴ�.
		Scanner scn = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		int a1 = scn.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int a2 = scn.nextInt();
		scn.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scn.nextLine();
		
		
		int result1 = a1 + a2;
		int result2 = (a1 + a2) / 2;
		
		if (result2 >= 120)
			System.out.println(name + " ���� �հ��Դϴ�.");
		if (result2 < 120)
			System.out.println(name + " ���� ���հ��Դϴ�.");
		
		System.out.printf("%s ����, ����, ���� ���� ����? %d, �����? %d", name, result1, result2);
		
		
		
	}

}
