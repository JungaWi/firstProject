package control;

public class ConditionExe {
	public static void main(String[] args) {
		//�� ���� 60, 70
		//�� ���� ���� ��� 100�� �Ѿ�� �հ�, ���հ�
		//��.
				
		int num1 = 60;
		int num2 = 70;
		int result = num1 + num2;				
		if(result >= 100) {
			System.out.println("�հ�");
		} else { //�׷��� ������
			System.out.println("���հ�");
		}			
		System.out.println("�L.");		
		
		//�� ���� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��.
		//2��° ��.
		
		if(num1*num2%2==0 ) {
			System.out.println("¦��");
		} else if(num1*num2%2==1) {
			System.out.println("Ȧ��");
		}			
		System.out.println("2��° �L.");		
			
		
		// ���մ��Կ����ڻ�� 60�� 10���� ���� ������� 6 2�� 3�� ������� if����				
		int num3 = 6;
		if (num3 % 6 == 0) {
			System.out.println("2�� 3�� ���");
		} else if (num3 % 2 == 0) {
			System.out.println("2�� ���");
		} else if (num3 % 3 == 0) {
			System.out.println("3�� ���");
		}			
		System.out.println("3��° �L.");
		
		// ���� / switch ���ǹ� - 1�� ���Խ��ϴ�
		
		int randomValue = (int) (Math.random() * 6) + 1;
		System.out.println(randomValue);		
		
		switch(randomValue) {
		case 1:
			System.out.println("1�� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println("2�� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("3�� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4�� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5�� ���Խ��ϴ�.");
			break;
		case 6:
			System.out.println("6�� ���Խ��ϴ�.");
			break;
		}		
		System.out.println("4��° �L.");		
		
		//0~99���� ������ ��
		//�� ���� ���ھ ���� if
		//int randomvalue = (int)(Math.random() * n) + start
		//start���� �����ϴ� n���� ����
		int randomValue2 = (int)(Math.random() * 100) + 0;
		System.out.println(randomValue2+"��");	
		
		if(randomValue2 >= 90) {
			System.out.println("A");			
		} else if (randomValue2 >=80) {
			System.out.println("B");
		} else if (randomValue2 >=70) {
			System.out.println("C");
		} else if (randomValue2 >=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
			
			
	}

}
