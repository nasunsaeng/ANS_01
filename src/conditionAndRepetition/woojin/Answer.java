package conditionAndRepetition.woojin;

import java.util.Scanner;

public class Answer { // 1번문제답
	public static void main(String[] args) {
		int num = 120;
		if ((num >0) && (num%2)==0) {
			
				System.out.println("양수이면서 짝수");
			
		}
	}

//=============================================
	// 1번문제 추가질문 1.1 
	String num01 = "integer";
	String num02 = "actual";
			
	public Answer (int num01, int num02) {
		if (num01%2 ==0) {
			System.out.println("integer");
		}else {
			System.out.println("actual");
		}
		
	
//============================================


//============================================
	//4.문제 답 for 문
	int sum = 0;
	
	for (int i = 1; i <= 99; i++) {

    sum += i;

		}
	System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

		


//====================================================
	// 5번 문제 답  // do while은... 모르겠다능
	int k = 1;
	while (k <= 100 ) {
		System.out.println(+1);
		k++;
		}
	int k1 = 100;
	while (k1 >=0 ) {
		System.out.println(+1);
		k1--;
		}
//=================================================
	// 7번 문제 
    int num = 5;

    for (int i = 1; i < 10; i++) {
        System.out.println(num+"*"+i+"="+(num*i));
    	}
	
// ===================================
// 8번 문제
	
    for(int i = 2; i < 10; i += 2) {
    	for(int j = 1; j < 10; j++) {
    	System.out.println(i + " x " + j + " = " + (i * j));
    	if(j >= i)
    	break;
    	
    		}
		}	
    
 //   ============================================
    // 9. 
    
    
    
    
	}
}


