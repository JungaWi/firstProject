package control;

public class DoWhileExe {

	public static void main(String[] args) {
		boolean run = false;
		
		// 1~10���� ���
		//��1.
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
		System.out.println("��1");
		
		//¦���� ���
		//��2.
		int i2 = 0;
		do {
			i2++;
			if (i2%2==1) {
				continue; //Ȧ���� �������� �������дٴ� ��
			}
			System.out.println(i2);
			if (i2 >= 10) {
				break;
			}
		} while (true);
		System.out.println("��2");
		
		//Ȧ���� �հ�
		//��3.
		int i3 = 0;
		int sum = 0;
		do {
			i3++;
			if (i3%2==0) {
				continue;
			}
			if (i3 >=10) {
				break;
			}
			sum += i3++;
		} while (true);
		System.out.println("sum: " + sum);
		System.out.println("��3");
		
		//������ ���� 1 ~ 10;
		//sum ���� 100���� ū ���� �Ǿ��� �� �� sum ���� ��� - �� �� �����ߴ��� ǥ��
		//ex sum : 101. ���� : 13
		//��4.

		
		
		
	}

}
