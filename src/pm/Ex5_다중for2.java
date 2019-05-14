package pm;

public class Ex5_다중for2 {

	public static void main(String[] args) {
		// 프로그램 시작 부분
		
		// @ @ @ @ 을 출력하는 반복문
		String ss = "@";
		for(int k = 0; k<4; k++) { // @ @ @ @을 4번 실행한다.
			for(int i = 0; i<4; i++) { // @ @ @ @을 한번 실행한다.
				System.out.printf("%-2s", ss); // %-2s는 왼쪽으로 붙어서 문자열을 출력한다. 그리고 출력하는 변수값을 ,뒤에써준다.
				if ( i ==2 ) //2일때면 0,1,2까지한번찍고 if문으로온다.
					break;
				/* switch(i) {
				case 2:
					break; //switch문을 탈출한것이라 의미가없다.
				} */
			}
			System.out.println(); // 줄바꿈
		}
	}

}
