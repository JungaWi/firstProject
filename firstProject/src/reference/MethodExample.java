package reference;

public class MethodExample {

	public static void main(String[] args) {
		// 비만도 계산 공식
		//double bmi = weight / (height * height);
		//bmi < 18.5 저체중
		//18.5 ~ 23 정상
		//23 ~ 25 과체중
		//25 ~ 비만 .. 고도비만.
		double w1 = 72.4, h1 = 1.75;
		checkBMI(w1, h1); //메소드 실행.
		double w2 = 65.7, h2 = 163.4;
		checkBMI(w2, h2);
		checkBMI(65.8, 173.6);
	}
	//메소드를 정의할 때 매개변수.
	public static void checkBMI(double weight, double height) {
		double bmi = weight / (height * height);
		if(bmi < 18.5) {
			System.out.println("저체중");			
		} else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("적정체중");
		} else if (bmi >= 21 && bmi < 25) {
			System.out.println("과체중");				
		} else if (bmi >= 25) {
			System.out.println("비만");
		} else {
			System.out.println("의사와 상담하세요.");		
		}	
		
	}
}


