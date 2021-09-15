package control;

public class ConditionExample {
	public static void main(String[] args) {
		int score = 70;
		
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else { //그렇지 않으면
			System.out.println("불합격입니다.");
		}
		
		// 90 이상 A, 80 이상 B, 70 이상 C, 60 이상 D, 그외 F
		if(score >= 90) {
			System.out.println("A");			
		} else if (score >=80) {
			System.out.println("B");
		} else if (score >=70) {
			System.out.println("C");
		} else if (score >=60) {
			System.out.println("D");
		} else {
			System.out.println("F");		
		}		
		
		System.out.println("끝.");
	}


	
	
	
	
}
