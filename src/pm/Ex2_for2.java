package pm;

public class Ex2_for2 {

	public static void main(String[] args) {
		// ���α׷� ����
		
		// 1~10���� ��� �ϴ� �ݺ���
		for(int i = 1; i<11; i++)
			System.out.println(i+"��° ���");
		//------------------------------------------------------
		
		//1~10������ ���� ���Ͻÿ�
		//��,�ݺ����� Ȱ���Ͽ� 1~10������ ���� ������Ų�� �ѹ��� ������ ���� ���� ����Ͻÿ�!
		
		
		int sum = 0; // ���� sum�� ����
		for(int i = 1; i<11; i++) {
			sum = sum + i; //1~10�� ���ʷ� �������� �ִ� ������ ����
			System.out.println(sum); // 1,3,6,10.........
		}
		System.out.println("1~10������ �� : "+sum); // 55
	}

}
