package pm;

import java.util.Scanner;

public class Ex3_for3 {

	public static void main(String[] args) {
		// 프로그램 시작 부분
		
		//숫자를 입력받아서 입력받은 숫자까지의 합을 구하는 공식
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력:");
		
		int su1 = scan.nextInt();
		int sum = 0;
		for(int i = 1; i<=su1; i++) {
			sum += i;
			
		}
			
		System.out.println("1부터"+su1+"까지 합:"+sum);
	}

}
