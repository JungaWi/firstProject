package control;

public class WiJunga {
	public static void main(String[] args) {
		for (int a=1; a<=20; a++ ) {
			if(a%2==0)
				continue;
			System.out.println(a);			
		}
		
		System.out.println("-----");
		
		while(true) {
			int b = (int) (Math.random()*10)+1;
			System.out.println(b);
			if(b%2==1)
				break;						
		}
		System.out.println("³¡");
		
		
	}

}
