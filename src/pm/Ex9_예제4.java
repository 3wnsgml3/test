package pm;

public class Ex9_����4 {

	public static void main(String[] args) {
		
	int v1 = 1; // ������ ���� v1�� 1�� �����Ѵ�.
		for(int k = 1; k<10; k++) { //1~9���� �ݺ��Ѵ�.
			
			for(int i = 2; i<10; i++) { //2~9���� �ݺ��Ѵ�.
				System.out.printf("%d*%d=%-4d",i,v1, (v1*i));
				//2*1=2 3*1=3�� 9���� �ݺ��ϰ� 
				
			
			}
			v1++;
			System.out.println(); //�ٹٲ�
			 	
			
		}
				
			
			
		
	}

}
