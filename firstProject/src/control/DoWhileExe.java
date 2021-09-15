package control;

public class DoWhileExe {

	public static void main(String[] args) {
		boolean run = false;
		
		// 1~10까지 출력
		//끝1.
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
		System.out.println("끝1");
		
		//짝수만 출력
		//끝2.
		int i2 = 0;
		do {
			i2++;
			if (i2%2==1) {
				continue; //홀수는 지나가게 내버려둔다는 뜻
			}
			System.out.println(i2);
			if (i2 >= 10) {
				break;
			}
		} while (true);
		System.out.println("끝2");
		
		//홀수만 합계
		//끝3.
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
		System.out.println("끝3");
		
		//임의의 값을 1 ~ 10;
		//sum 값이 100보다 큰 수가 되었을 때 그 sum 값을 출력 - 몇 번 실행했는지 표시
		//ex sum : 101. 실행 : 13
		//끝4.

		
		
		
	}

}
