package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 1 ~ 10���� ������ ���� ����.
		// �л� 10�� �������� ����
		int[] scores = new int[10]; //new int[����];
		System.out.println(scores.length); //length->�迭ũ��
		for(int i=0; i<scores.length; i++) {
			int temp=(int)(Math.random()*10)+1;
			scores[i]=temp;			
		}
		// scores �迭Ÿ��. scores[0] int Ÿ��.
		//���
		for(int i=0; i<scores.length; i++) {
			System.out.printf("scores[%d]=> %d\n", i, scores[i]);
		}
		System.out.println("===��===");
		
		
		// �迭�� ����ִ� ��ҵ��� ��
		int sum = 0;
		// �迭�� �հ� : 55
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
			
		}
		System.out.println("�迭 �հ�:"+sum);
		System.out.println("===��2===");
		
		// �迭 ��� �� 5���� ū ���� �հ�
		int sum2= 0;
		for(int i=0; i<scores.length; i++) {
			if (i > 5)
			sum2 += scores[i];
		}
		System.out.println("�迭 ��� �� 5���� ū ���� �հ�:"+sum2);
		System.out.println("===��3===");
		
		// �迭 ��� �� ¦���� ° ���� �հ�
		int sum3=0;
		for (int i=0; i<scores.length; i++) {
			if (i%2==1) //�ε����� 0���� �����ϴϱ� Ȧ���� �־�ߴ�
				sum3 += scores[i];
		}
		System.out.println("�迭�� ¦����°�� ���� �հ�:"+sum3);

	}

}
