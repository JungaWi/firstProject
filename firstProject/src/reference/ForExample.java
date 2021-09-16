package reference;

public class ForExample {
	public static void main(String[] args) {
		
		{//블록 중요//
			int i=0;
			int j=0;
		}
		//int i = 10; 같은 블록 안에서만 같은 변수 사용 가능
		
		//
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("끝1.");
		
		//1~10 짝수만 출력..
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("끝2.");
		
		//1 ~ 10 홀수만 합
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("끝3.");
		
		// 1~10 sum의 값이 20을 넘어서는 그 때의 횟수
		sum = 0;
		int cnt=0; //횟수를 받아오기 위한
//		int i=1;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (sum >=20) {
				// i값을 반환
				cnt=i;
				break;				
			}
		}
		System.out.println("횟수: "+cnt);
	}

}
