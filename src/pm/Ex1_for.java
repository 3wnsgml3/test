package pm;

public class Ex1_for {

	public static void main(String[] args) {
		// 프로그램의 시작
		
		// 1~5까지 출력하는 반복문 수행
		for(int i = 1; i <=5; i++)
			// int형 변수 i를 1로 선언하고 i는 5보다 작거나같을때까지 실행되고 i++는 i가 1씩증가한다.
			System.out.println(i+"번째 수행");
		
		// System.out.println(i); // i는 for문 안에서 만들어졌다. 그럼으로 for문밖에있는
		// i를 출력하는 이 코드는 i라는 변수를 알수없어 출력할수 없다.
		// 자바에서는 처음 변수가 만들어질때 해당 영역에서만 사용할수 있다.
		
		
		int i = 1; //이렇게 for문 밖에다가 변수를 지정해준다면 아래for문과 더아래의 변수 i를 출력할수있다.
		for(; i <=5; i++)
			 //int형 변수 i를 1로 선언하고 i는 5보다 작거나같을때까지 실행되고 i++는 i가 1씩증가한다.
			System.out.println(i+"번째 수행");
		
		//System.out.println(i); 
		
		
		 //for(int i = 1; i <=5; i++); // 이렇에 세미클론으로 닫아준다면
		// for문 괄호안에서 1부터 5까지 적용되고 6으로 빠져나와 아래 출력문을 수행한다.
			System.out.println(i+"번째 수행");
			
	}

}
