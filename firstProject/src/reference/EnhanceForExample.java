package reference;

public class EnhanceForExample {

	public static void main(String[] args) {
		String[] strAry = null; //참조 값이 없다는 뜻
		strAry = new String[5]; // null, null, null, null, null
		strAry = new String[] {"Hong", "Park", "Choi","Kim","Hwang"};
		System.out.println(strAry.length);
		
		strAry[2]="Hong"; //3번째 위치(인덱스는0부터시작하므로2)에 홍을 담겠다
		//문자열 비교 : .equals()
		
		for(int i=0; i<strAry.length; i++) {
			if (strAry[i].equals("Hong"))
				System.out.println(strAry[i]);
		}
		System.out.println("===다시===");
		
		//Enhanced for
		for (String name : strAry) {
			System.out.println(name);			
		}
		
		int [] scores = {50, 70, 80, 60};
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}

		// 학생 3명 . 4.2. 3.5. 2.8
		
		double [] a = {4.2, 3.5, 2.8};
		double sum2 = 0;
		for(double score2 : a) {
			sum2 += score2;

		}
		double avg = sum2 / a.length;
		System.out.println(avg);
	}

}
