package reference;

public class MethodExample2 {
	
	public static void main(String[] args) {
		sum(24, 55); //메소드 실행 : 괄호 안에 실제 값이 들어가야만.
		
		int a = 45, b = 77;
		sum(a,b);
		
		multi(35, 88);
		
		getArea(3.5);
		
		int res = getMax(a,b);
		System.out.println("큰 수는 "+res);
		
		double res2 = divide(5, 3);
		System.out.println("결과는 : "+res2);
		
	}
	
	// 두 정수를 입력 받아서 두 수의 합을 console 보여줘
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("두 수의 합 : " + sum);		
	}
	
	// 두 정수를 입력 받아서 두 수의 곱을 console 보여줘
	public static void multi(int i1, int i2) {
		int sum = i1 * i2;
		System.out.println("두 수의 곱 : " + sum);	
	}
	
	// 정사각형 너비를 계산해주는 메소드.
	public static void getArea(double side) { //void는 반환한 값이 없다는 의미
		double sum= side * side;
		System.out.println("정사각형 너비 : " + sum);		
	}
	
	// 두 수 중에서 큰 값을 반환해주는 메소드.
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ? num1 : num2; //참이면 num1 거짓이면 num2
		return result; //반환		
	}
	
	// 두 정수를 입력받아서 첫 번째 값을 두번째 값으로 나눈 결과 반환
	public static double divide(int a, int b) {
		double result = ((double) a / b);
		//소수점까지 표시하려면 (double) int로 준 그대로 하면 소숫점밑은 표시를 못해서???
		return result;
		
		
	}

}
