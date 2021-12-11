package conditionAndRepetition.seongho;

public class Answer6 {

	
	public static void main(String[] args) {
		
	int result =0;
	for(int i=1 ; i < 1000 ; i++) {
	if( (i%2)==0 && (i%7)==0 ) {
		System.out.print(i+" ");
		result =result + i ;
	}
}
	System.out.print("\n1000이하의 자연수중에 2의 배수이자 7의 배수의 합은 " + result + "입니다");
}
}