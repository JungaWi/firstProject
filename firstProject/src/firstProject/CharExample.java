package firstProject;

public class CharExample {

	public static void main(String[] args) {
		// int, String, boolean, char
		// byte < char, short < int < long
		char myFirstCharType = 97;
		
		System.out.println(myFirstCharType);

		byte b1 = 10; // 1byte(8bit) ||
		// 0 0 0 0 0 0 0 0
		// 2*8 256가지 (-128~127)
		//
		b1 = 127;
		b1++; //b1 = b1 = 1;
		System.out.println(b1);
		
		short s1 = 0;
		// short -32768 ~ 32767
		short result = (short)(b1 + s1);
		//byte랑 short 더할 때 연산자가 int 기준 -> 강제로 (short)로 변환
		System.out.println(Short.MAX_VALUE);
		
		long fakeLong = 214748364L;

	}
}
