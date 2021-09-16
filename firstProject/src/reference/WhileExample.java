package reference;

public class WhileExample {
	public static void main(String[] args) {
		//while 반복문. 
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++; //반복 끝내는 증감식을 반드시
		}
		
		// 1~ 10 짝수만 출력
		boolean run = true; //true일 경우 반복
		i=1;
		while(run) {
			if(i==10)
				run = false; //i가 10되면 while구문을 종료하는 조건
			if (i%2==0) {
				System.out.println(i);
			}			
			i++;
		}
		
		while (true) {
			if(i==10) {
				break; //while구문을 종료하는 조건
			}
		}
		
	}

}
