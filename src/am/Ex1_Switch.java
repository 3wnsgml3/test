package am;

import java.util.Scanner;

public class Ex1_Switch {

	public static void main(String[] args) {
		// Ű����� ����� �б⸦ ���� ��ġ ����
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Է�(1~3):"); // �Է�(1~3):�� ȭ�鿡 ����Ѵ�
		
		int v1 = scan.nextInt(); // Ű����κ��� �Է¹޴� ���� ����v1�� �ִ´�
		
		switch(v1) {
			case 1:
				System.out.println("ù����");
				break;
			case 2:
				System.out.println("�ι�°");
				break;
			case 3:
				System.out.println("����°");
				break;
			default:
				System.out.println("1���� 3������ ���� �ϳ��� �Է��Ͻÿ�.");
		}
		

	}

}
