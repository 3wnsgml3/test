package pm;

public class Ex11_예제2다른방법 {

	public static void main(String[] args) {
		for(int k = 1; k<=4; k++) {  // 4번 반복해준다.
			for(int i = 1; i<=k; i++) { 	// 5번 반복해준다.
				  // k가 i보다 크거나 작을때 *를 찍어준다.
					System.out.printf("%-2s", '*');
								
			}
			
			System.out.println(); // 줄바꿈
		}
	}

}
