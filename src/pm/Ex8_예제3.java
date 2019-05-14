package pm;

public class Ex8_예제3 {

	public static void main(String[] args) {
		String ss = "*"; // 문자열 변수 ss에 *값을 넣어준다.
		for(int k = 1; k<=4; k++) {  // 4번 반복해준다.
			for(int i = 1; i<=5; i++) { 	// 5번 반복해준다.		
				if (k<i)  // k가 i보다 작을때 *를 찍어준다.
					System.out.printf("%-2s", ss);
					
				
			}
			System.out.println(); // 줄바꿈
		}
	}

}
