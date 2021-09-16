package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 1 ~ 10까지 임의의 수를 생성.
		// 학생 10명 랜덤으로 점수
		int[] scores = new int[10]; //new int[갯수];
		System.out.println(scores.length); //length->배열크기
		for(int i=0; i<scores.length; i++) {
			int temp=(int)(Math.random()*10)+1;
			scores[i]=temp;			
		}
		// scores 배열타입. scores[0] int 타입.
		//출력
		for(int i=0; i<scores.length; i++) {
			System.out.printf("scores[%d]=> %d\n", i, scores[i]);
		}
		System.out.println("===끝===");
		
		
		// 배열에 들어있는 요소들의 합
		int sum = 0;
		// 배열의 합계 : 55
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
			
		}
		System.out.println("배열 합계:"+sum);
		System.out.println("===끝2===");
		
		// 배열 요소 중 5보다 큰 값만 합계
		int sum2= 0;
		for(int i=0; i<scores.length; i++) {
			if (i > 5)
			sum2 += scores[i];
		}
		System.out.println("배열 요소 중 5보다 큰 값만 합계:"+sum2);
		System.out.println("===끝3===");
		
		// 배열 요소 중 짝수번 째 값만 합게
		int sum3=0;
		for (int i=0; i<scores.length; i++) {
			if (i%2==1) //인덱스는 0부터 시작하니까 홀수를 넣어야댐
				sum3 += scores[i];
		}
		System.out.println("배열이 짝수번째의 값만 합계:"+sum3);

	}

}
