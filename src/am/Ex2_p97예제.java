package am;

import java.util.Scanner;

public class Ex2_p97���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Ű����� ����� �б⸦ ���� ��ġ ����
		int month = scan.nextInt(); // Ű����κ��� �Է¹޴� ���� ����month�� �ִ´�
		String res = ""; // ���ڿ����� res�� ���� ���ش�. �̷��� �ʱⰪ�� ������ �����ϴ°��� ����.
			switch(month) {  // �Է��� ���� ���ڸ� �ѹ��� ã�ư���.
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					res = "31"; // �Է��� ���� 1,3,5,7,8,10,12�ϰ�� ���ڿ� res�� 31�� �Է�
					break;  // ������� �����ϰ� �������´�.
			
				case 4:
				case 6:
				case 9:
				case 11:
					res = "30"; // �Է��� ���� 4,6,9,11�� ��� ���ڿ����� res�� 30���Է�
					break; // ������� �����ϰ� �������´�.
			
				case 2:
					res ="29"; // �Է��� ���� 2�ϰ�� ���ڿ����� res�� 29�� ���
					break; // ������� �����ϰ� �������´�.
				default : // ������ ����ϰ�� res�� ���� ����
					res = "�������ڽ���";
		}
			if (month>=1 && month<=12)
				System.out.println(month+"����"+res+"�ϱ��� �Դϴ�."); 
		// �߰�ȣ �ۿ��ٻ� sysout�� �������� 31�ϱ��� ������ 30���϶� 29���϶� �����϶� ������
		// �� �־��ֱ� ������ ������ �߰�ȣ �ۿ��ٰ� �ѹ��� �ۼ����Ѵ�.
			else 
				System.out.println(month+"����"+res); 
				

	}

}
