package operator;

public class OeratorExample2 {
	public static void main(String[] args) {
		// 대입(할당)연산자
		int num1, num2, result;
		num1 = num2 = 10;
		
		result = num1 + num2;
		
		result = result + 10;
		result += 10; //원래 result에 10을 더한 값을 다시 result에 담겠다
		
		result -= 10; // result = result - 10; 
		//복합대입연산자
		result *= 10;
		result /= 10;
		
		String str="hello";
		str = str + " World";
		str += " Welcome";
		System.out.println(str);
		
		
		//3항 연산자
		int score = 80;
		boolean pass = (score > 60) ? true : false;
		String isOK = (score > 60) ? "Pass" : "Fail";
		
		
		
	}

}
