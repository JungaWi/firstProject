package reference;

public class WhileExample {
	public static void main(String[] args) {
		//while �ݺ���. 
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++; //�ݺ� ������ �������� �ݵ��
		}
		
		// 1~ 10 ¦���� ���
		boolean run = true; //true�� ��� �ݺ�
		i=1;
		while(run) {
			if(i==10)
				run = false; //i�� 10�Ǹ� while������ �����ϴ� ����
			if (i%2==0) {
				System.out.println(i);
			}			
			i++;
		}
		
		while (true) {
			if(i==10) {
				break; //while������ �����ϴ� ����
			}
		}
		
	}

}
