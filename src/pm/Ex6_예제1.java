package pm;

public class Ex6_예제1 {

	public static void main(String[] args) {
		
	int r1 = 0;  // 정수형 변수 r1을 0으로 선언한다. 
		for(int k = 0; k<3; k++) { // 
			
			for(int i = 1; i<6; i++) { // 5번 반복 시켜준다.
				System.out.printf("%-4d", ++r1); // r1변수를 +1씩번져 증가시껴서 5번 수행
				 
			
			}
			System.out.println();// 줄바꿈
		}

	}

}

