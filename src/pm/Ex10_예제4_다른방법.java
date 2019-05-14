package pm;

public class Ex10_예제4_다른방법 {

	public static void main(String[] args) {
		 for(int x=1; x<=9; x++) {
	            for(int z=2; z<=9; z++) {
	                System.out.printf("%d * %d = %2d", z, x, (z*x));
	                System.out.printf("   ");
	            }
	            System.out.println();

	}
	}
}
