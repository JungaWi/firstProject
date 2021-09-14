package firstProject;

public class StringExample2 {

	public static void main(String[] args) {
		String name = "위정아";
		int age = 28;
		
		System.out.println("이름은 " + name + ", 나이는 " + age);
		System.out.printf("이름은 %s, 나이는 %d\n", name, age);
		// \n엔터역할
		
		byte b1 = 90;
		byte b2 = 10;
		
		byte result = (byte)(b1 + b2);
		System.out.println(b1+"+"+b2+"="+result);
		//isLarger ->boolean
		//result > 0
	
		
		long var1 = 220000000L;
		int var2 = 78;
		int var3 = 8;
		double avg = (double)(var2 / var3);
		System.out.println(avg);
		System.out.println(var2+"을 "+var3+"으로 나눈 결과:"+avg);
		
	}
	
	 
		
		

	}


