package firstProject;

import java.util.Scanner;

public class WiJunga {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���� �� ��");
		int a1 = scn.nextInt();
		System.out.println("���� ����Ƽ �� ��");
		int a2 = scn.nextInt();
		System.out.println("������� ���ټ� �� ��");
		int a3 = scn.nextInt();
		scn.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scn.nextLine();
		System.out.println("����ó�� �Է��ϼ���.(�ʼ�X)");
		String number = scn.nextLine();

		if(number.equals ("")) {
			number = "0";
		}
		int numberInt = Integer.parseInt(number);
		
		int result = (a1 + a2 + a3) / 3;
		System.out.printf("%s ���� ��� �������� %d\n", name, result);
		System.out.println("�����մϴ�.");
		
	}

}
