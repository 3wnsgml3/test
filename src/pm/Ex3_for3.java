package pm;

import java.util.Scanner;

public class Ex3_for3 {

	public static void main(String[] args) {
		// ���α׷� ���� �κ�
		
		//���ڸ� �Է¹޾Ƽ� �Է¹��� ���ڱ����� ���� ���ϴ� ����
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է�:");
		
		int su1 = scan.nextInt();
		int sum = 0;
		for(int i = 1; i<=su1; i++) {
			sum += i;
			
		}
			
		System.out.println("1����"+su1+"���� ��:"+sum);
	}

}
