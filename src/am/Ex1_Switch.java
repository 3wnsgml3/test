package am;

import java.util.Scanner;

public class Ex1_Switch {

	public static void main(String[] args) {
		// 키보드와 연결된 읽기를 위한 장치 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력(1~3):"); // 입력(1~3):을 화면에 출력한다
		
		int v1 = scan.nextInt(); // 키보드로부터 입력받는 값을 변수v1에 넣는다
		
		switch(v1) {
			case 1:
				System.out.println("첫번쨰");
				break;
			case 2:
				System.out.println("두번째");
				break;
			case 3:
				System.out.println("세번째");
				break;
			default:
				System.out.println("1에서 3까지의 수중 하나만 입력하시오.");
		}
		

	}

}
