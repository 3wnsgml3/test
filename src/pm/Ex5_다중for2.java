package pm;

public class Ex5_����for2 {

	public static void main(String[] args) {
		// ���α׷� ���� �κ�
		
		// @ @ @ @ �� ����ϴ� �ݺ���
		String ss = "@";
		for(int k = 0; k<4; k++) { // @ @ @ @�� 4�� �����Ѵ�.
			for(int i = 0; i<4; i++) { // @ @ @ @�� �ѹ� �����Ѵ�.
				System.out.printf("%-2s", ss); // %-2s�� �������� �پ ���ڿ��� ����Ѵ�. �׸��� ����ϴ� �������� ,�ڿ����ش�.
				if ( i ==2 ) //2�϶��� 0,1,2�����ѹ���� if�����ο´�.
					break;
				/* switch(i) {
				case 2:
					break; //switch���� Ż���Ѱ��̶� �ǹ̰�����.
				} */
			}
			System.out.println(); // �ٹٲ�
		}
	}

}
