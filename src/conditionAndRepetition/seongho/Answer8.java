package conditionAndRepetition.seongho;

public class Answer8 {

	public static void main(String[] args) {
	
		
		for(int i=2; i <= 8; i=i+2 ) {
			System.out.println("======"+i+"단======");
			for(int j=1; j <= i; j++) {
				System.out.printf("  %2dx%2d=%2d\n",i,j,i*j);
			}
				
		}
	}
}