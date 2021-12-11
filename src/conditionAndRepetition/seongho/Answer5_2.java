package conditionAndRepetition.seongho;

public class Answer5_2 {

	public static void main(String[] args) {
		int i =1;
		int j =100;
		while( !((i >= 100) && (j < 1))) {
			if(i < 100) { // 똑바로  if문
			System.out.print(i+" ");
			i++;
			if(i == 100){
				System.out.println(i+" ");
			}
			}else if (j > 0) {// 역으로 else if문 
			System.out.print(j+" ");
			
			j--;
			
			}
		}
	}	
}
