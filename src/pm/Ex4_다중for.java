package pm;

public class Ex4_다중for {

	public static void main(String[] args) {
		// 프로그램 시작 부분
		for(int k=0; k<3; k++) { //행의 이동
		//1 2 3 4를 출력하는 반복문
			for(int i = 1; i<5; i++) { //열의 이동
				System.out.printf("%-2d",i); 
				//printf에서는 정수값을 표현할때는 %d를해주고 ,찍고 넣을 변수값을 넣는다.
				// 음수표기법으로 -2d를 하면 왼쪽에 붙어서 정렬
			}
			System.out.println(); //줄바꿈 
		}

	}

}
