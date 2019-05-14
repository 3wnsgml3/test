package pm;

public class Ex2_for2 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 1~10까지 출력 하는 반복문
		for(int i = 1; i<11; i++)
			System.out.println(i+"번째 출력");
		//------------------------------------------------------
		
		//1~10까지의 합을 구하시오
		//단,반복문을 활용하여 1~10까지의 값을 누적시킨후 한번에 누적된 합의 값을 출력하시오!
		
		
		int sum = 0; // 변수 sum을 선언
		for(int i = 1; i<11; i++) {
			sum = sum + i; //1~10이 차례로 더해질수 있는 변수값 설정
			System.out.println(sum); // 1,3,6,10.........
		}
		System.out.println("1~10까지의 합 : "+sum); // 55
	}

}
