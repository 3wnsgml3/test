package pm;

public class Ex7_����2 {

	public static void main(String[] args) {
		
		String ss = "*"; // ���ڿ� ���� ss�� *���� �־��ش�.
		for(int k = 0; k<4; k++) {  // 4�� �ݺ����ش�.
			for(int i = 0; i<5; i++) { 	// 5�� �ݺ����ش�.
				if (k>=i)  // k�� i���� ũ�ų� ������ *�� ����ش�.
					System.out.printf("%-2s", ss);
								
			}
			
			System.out.println(); // �ٹٲ�
			
		}
	}

}
