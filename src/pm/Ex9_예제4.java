package pm;

public class Ex9_예제4 {

	public static void main(String[] args) {
		
	int v1 = 1; // 정수형 변수 v1에 1을 대입한다.
		for(int k = 1; k<10; k++) { //1~9까지 반복한다.
			
			for(int i = 2; i<10; i++) { //2~9까지 반복한다.
				System.out.printf("%d*%d=%-4d",i,v1, (v1*i));
				//2*1=2 3*1=3를 9까지 반복하고 
				
			
			}
			v1++;
			System.out.println(); //줄바꿈
			 	
			
		}
				
			
			
		
	}

}
