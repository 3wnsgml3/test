package pm;

public class Ex8_����3 {

	public static void main(String[] args) {
		String ss = "*"; // ���ڿ� ���� ss�� *���� �־��ش�.
		for(int k = 1; k<=4; k++) {  // 4�� �ݺ����ش�.
			for(int i = 1; i<=5; i++) { 	// 5�� �ݺ����ش�.		
				if (k<i)  // k�� i���� ������ *�� ����ش�.
					System.out.printf("%-2s", ss);
					
				
			}
			System.out.println(); // �ٹٲ�
		}
	}

}
