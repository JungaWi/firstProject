package reference;

public class MethodExample2 {
	
	public static void main(String[] args) {
		sum(24, 55); //�޼ҵ� ���� : ��ȣ �ȿ� ���� ���� ���߸�.
		
		int a = 45, b = 77;
		sum(a,b);
		
		multi(35, 88);
		
		getArea(3.5);
		
		int res = getMax(a,b);
		System.out.println("ū ���� "+res);
		
		double res2 = divide(5, 3);
		System.out.println("����� : "+res2);
		
	}
	
	// �� ������ �Է� �޾Ƽ� �� ���� ���� console ������
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("�� ���� �� : " + sum);		
	}
	
	// �� ������ �Է� �޾Ƽ� �� ���� ���� console ������
	public static void multi(int i1, int i2) {
		int sum = i1 * i2;
		System.out.println("�� ���� �� : " + sum);	
	}
	
	// ���簢�� �ʺ� ������ִ� �޼ҵ�.
	public static void getArea(double side) { //void�� ��ȯ�� ���� ���ٴ� �ǹ�
		double sum= side * side;
		System.out.println("���簢�� �ʺ� : " + sum);		
	}
	
	// �� �� �߿��� ū ���� ��ȯ���ִ� �޼ҵ�.
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ? num1 : num2; //���̸� num1 �����̸� num2
		return result; //��ȯ		
	}
	
	// �� ������ �Է¹޾Ƽ� ù ��° ���� �ι�° ������ ���� ��� ��ȯ
	public static double divide(int a, int b) {
		double result = ((double) a / b);
		//�Ҽ������� ǥ���Ϸ��� (double) int�� �� �״�� �ϸ� �Ҽ������� ǥ�ø� ���ؼ�???
		return result;
		
		
	}

}
