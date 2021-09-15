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
		System.out.println("--다시--");
				cnt = 0;
		//반복문 for //i++(1씩증가한다는의미) i+=1랑 같음
		for(int i=1; i<=5; i++) {
			cnt += i;
			System.out.printf("i: %d, cnt: %d\n", i, cnt);
			// 현재 i값 1 cnt(0)+1 = 1, i값은 3보다 작으므로 cnt는 1로 출력
			// 현재 i값 2 cnt(1)+2 = 3, i값은 3보다 작으므로 cnt는 3로 출력			
		}

		

		int tempValue = 0;
		System.out.println("--다시2--");
		for(int i=1; i<=5; i++) {
			tempValue = 0;
			tempValue += (int) (Math.random() * 10) +1;
			//tempValue = tempValue + (int) (Math.random() * 10) +1; 누적같은의미
			System.out.printf("%d번째 값:%d\n", i, tempValue);
			}
		
		System.out.println("sum:" + tempValue);
		System.out.println("반복문 끝.");
		
		
		for(int i=1; i<=10; i++) {
			cnt =i;
			System.out.printf("i: %d, cnt: %d\n", i, cnt);
			}
		System.out.println("끝1.");
		
		
		//1~10까지 합 구하기
	int sum = 0;
		
		int i = 0;
		for(i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
	}

}
