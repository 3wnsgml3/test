package am;

import java.util.Scanner;

public class Ex2_p97예제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 키보드와 연결된 읽기를 위한 장치 생성
		int month = scan.nextInt(); // 키보드로부터 입력받는 값을 변수month에 넣는다
		String res = ""; // 문자열변수 res를 선언만 해준다. 이렇게 초기값을 없더라도 설정하는것이 좋다.
			switch(month) {  // 입력한 달의 숫자를 한번에 찾아간다.
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					res = "31"; // 입력한 달이 1,3,5,7,8,10,12일결우 문자열 res에 31이 입력
					break;  // 여기까지 실행하고 빠져나온다.
			
				case 4:
				case 6:
				case 9:
				case 11:
					res = "30"; // 입력한 달이 4,6,9,11일 경우 문자열변수 res에 30이입력
					break; // 여기까지 실행하고 빠져나온다.
			
				case 2:
					res ="29"; // 입력한 달이 2일경우 문자열변수 res에 29가 출력
					break; // 여기까지 실행하고 빠져나온다.
				default : // 나머지 경우일경우 res에 몰라가 저장
					res = "몰라이자슥아";
		}
			if (month>=1 && month<=12)
				System.out.println(month+"월은"+res+"일까지 입니다."); 
		// 중괄호 밖에다사 sysout을 한이유는 31일까지 있을때 30일일때 29일일때 몰라일때 일일이
		// 다 넣어주기 귀찮기 때문에 중괄호 밖에다가 한번에 작성을한다.
			else 
				System.out.println(month+"월은"+res); 
				

	}

}
