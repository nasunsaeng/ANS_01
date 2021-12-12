package conditionAndRepetition.seongho;

public class Answer5_1 {

	public static void main(String[] args) {
		int i =1;
		int j =100;
		  do {
		  if(i <= 100) {
			  System.out.print(i+" ");
			  i++;
			  if(i==101) {
				  System.out.println();
			  }
		  }else if (j>=1) {
			  System.out.print(j+" ");
			  j--;
		  }
		  
		 } while (!((i >= 100) && (j <= 1)));
			
		}

	}


