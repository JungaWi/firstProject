package firstProject;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		// ����: ����� �Է� (10, 20)
		// 10 + 20 = 30
		
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���");
		int age1 = scn.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		int age2 = scn.nextInt();
		
		int result = age1 + age2;
		
		
		System.out.println(age1+"+"+age2+"="+result);
	}

}
