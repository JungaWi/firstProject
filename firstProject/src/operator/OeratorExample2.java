package operator;

public class OeratorExample2 {
	public static void main(String[] args) {
		// ����(�Ҵ�)������
		int num1, num2, result;
		num1 = num2 = 10;
		
		result = num1 + num2;
		
		result = result + 10;
		result += 10; //���� result�� 10�� ���� ���� �ٽ� result�� ��ڴ�
		
		result -= 10; // result = result - 10; 
		//���մ��Կ�����
		result *= 10;
		result /= 10;
		
		String str="hello";
		str = str + " World";
		str += " Welcome";
		System.out.println(str);
		
		
		//3�� ������
		int score = 80;
		boolean pass = (score > 60) ? true : false;
		String isOK = (score > 60) ? "Pass" : "Fail";
		
		
		
	}

}
