package control;

public class ForExample {
	public static void main(String[] args) {
		int cnt = 0;
		
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		System.out.println("--�ٽ�--");
				cnt = 0;
		//�ݺ��� for //i++(1�������Ѵٴ��ǹ�) i+=1�� ����
		for(int i=1; i<=5; i++) {
			cnt += i;
			System.out.printf("i: %d, cnt: %d\n", i, cnt);
			// ���� i�� 1 cnt(0)+1 = 1, i���� 3���� �����Ƿ� cnt�� 1�� ���
			// ���� i�� 2 cnt(1)+2 = 3, i���� 3���� �����Ƿ� cnt�� 3�� ���			
		}

		

		int tempValue = 0;
		System.out.println("--�ٽ�2--");
		for(int i=1; i<=5; i++) {
			tempValue = 0;
			tempValue += (int) (Math.random() * 10) +1;
			//tempValue = tempValue + (int) (Math.random() * 10) +1; ���������ǹ�
			System.out.printf("%d��° ��:%d\n", i, tempValue);
			}
		
		System.out.println("sum:" + tempValue);
		System.out.println("�ݺ��� ��.");
		
		
		for(int i=1; i<=10; i++) {
			cnt =i;
			System.out.printf("i: %d, cnt: %d\n", i, cnt);
			}
		System.out.println("��1.");
		
		
		//1~10���� �� ���ϱ�
	int sum = 0;
		
		int i = 0;
		for(i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " �� : " + sum);
		
	}

}
