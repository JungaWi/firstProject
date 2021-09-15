package control;

public class ConditionExe {
	public static void main(String[] args) {
		//두 정수 60, 70
		//두 수를 합한 결과 100점 넘어서면 합격, 불합격
		//끝.
				
		int num1 = 60;
		int num2 = 70;
		int result = num1 + num2;				
		if(result >= 100) {
			System.out.println("합격");
		} else { //그렇지 않으면
			System.out.println("불합격");
		}			
		System.out.println("꿑.");		
		
		//두 수를 곱해서 짝수이면 짝수, 홀수이면 홀수.
		//2번째 끝.
		
		if(num1*num2%2==0 ) {
			System.out.println("짝수");
		} else if(num1*num2%2==1) {
			System.out.println("홀수");
		}			
		System.out.println("2번째 꿑.");		
			
		
		// 복합대입연산자사용 60을 10으로 나눈 결과값이 6 2와 3의 배수인지 if구문				
		int num3 = 6;
		if (num3 % 6 == 0) {
			System.out.println("2와 3의 배수");
		} else if (num3 % 2 == 0) {
			System.out.println("2의 배수");
		} else if (num3 % 3 == 0) {
			System.out.println("3의 배수");
		}			
		System.out.println("3번째 꿑.");
		
		// 랜덤 / switch 조건문 - 1이 나왔습니다
		
		int randomValue = (int) (Math.random() * 6) + 1;
		System.out.println(randomValue);		
		
		switch(randomValue) {
		case 1:
			System.out.println("1이 나왔습니다.");
			break;
		case 2:
			System.out.println("2가 나왔습니다.");
			break;
		case 3:
			System.out.println("3이 나왔습니다.");
			break;
		case 4:
			System.out.println("4가 나왔습니다.");
			break;
		case 5:
			System.out.println("5가 나왔습니다.");
			break;
		case 6:
			System.out.println("6이 나왔습니다.");
			break;
		}		
		System.out.println("4번째 꿑.");		
		
		//0~99까지 임의의 값
		//그 랜덤 스코어에 따라 if
		//int randomvalue = (int)(Math.random() * n) + start
		//start부터 시작하는 n개의 정수
		int randomValue2 = (int)(Math.random() * 100) + 0;
		System.out.println(randomValue2+"점");	
		
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
