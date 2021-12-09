package conditionAndRepetition.nayeon;

import java.util.ArrayList;
import java.util.List;

import javax.print.event.PrintJobAttributeListener;

class Answer01 implements AnswerInterface{	
	public void answer() {
		System.out.println("01. ");
		int num = 120;		
		if((num > 0) && ((num % 2) == 0)) {
			System.out.println("양수이면서 짝수");
		}	
	}

	//1) 2로 나누어서 나누어 떨어지면 짝수 그렇지 않으면 홀수
	//2) || 연산자일 경우 둘 중 하나만 참이어도 참이 반환되고
	//   && 연산자일 경우 둘 다 참이어야 참이 반환되므로
	//   || 일 때는 앞의 조건식이 참일 가능성이 높은것을 두고 그것이 참이면 
	//   뒤에 것을 확인하지 않고 참을 반환하므로 효율적
	//   && 일 때는 앞의 조건식이 거짓일 가능성이 높은 것을 두고 그것이 거짓이면
	//   뒤에 것을 확인하지 않고 거짓을 반환하므로 효율적  
}

class Answer02 implements AnswerInterface{
	public void answer() {
		System.out.println("02. ");
		int num = 120;		
		String bool = (num>0 && (num % 2)==0)? "양수이면서 짝수" : "둘다 아님";
		System.out.println(bool);
	}
}

class Answer03 implements AnswerInterface{
	public void answer() {
		System.out.println("03. ");
		int n = 3;
		
		if(n == 1) {
			System.out.println("Simple Java");
		}else if(n == 2) {
			System.out.println("Funny Java");
		}else if(n == 3) {
			System.out.println("Fantastic Java");
		}else {
			System.out.println("The best programming language");	
		}
		System.out.println("Do you like Java?");
	}
}

class Answer04 implements AnswerInterface{
	public void answer() {
		int sum01 = 0;
		for(int i = 1; i<100; i++) {
			sum01 += i;
		}
		System.out.println("04. 1)" + sum01);
		
		int sum02 = 0;
		int j = 1;
		while(j <100) {
			sum02 += j;
			j ++;
		}
		System.out.println("04. 2)" + sum02);		
	}
}

class Answer05 implements AnswerInterface{
	public void answer() {
		System.out.println("05. ");
		int i = 0;
		while(i<100) {
			System.out.print(++i + " ");
		}
		System.out.println();
		do{
			System.out.print(i-- + " ");	
		}while(i>0);
	}
}

class Answer06 implements AnswerInterface{
	public void answer() {
		System.out.println("06. ");
		int i = 1;
		int sum = 0;
		while(i<=1000) {
			if((i % 2) == 0 && (i % 7) == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
}

class Answer07 implements AnswerInterface{
	public void answer() {
		System.out.println("07. ");
		for(int i = 1; i<10; i++) {
			System.out.println("5 × "+i+" = "+(5*i));
		}
	}
}

class Answer08 implements AnswerInterface{
	public void answer() {
		System.out.println("08. ");
		for(int i = 1 ; i<10; i++) {
			if((i % 2) == 0){
			System.out.println(i+" 단 ");
				for(int j =1; j<=i ; j++) {				
					System.out.println(i+" × "+j+" = "+i*j);
				}
			}
		}
	}
}

class Answer09 implements AnswerInterface{
	public void answer() {
		System.out.println("09. 문제의 의도가 무엇인가?");
		System.out.println("1) 두 자리 ab ba 를 더해서 99가 나오는가?");

		List<int[]> permu_1 = new ArrayList<>(); // 순열 -> 순서 상관 O
		
		String abToString = "";
		String baToString = "";
		int ab = 0;
		int ba = 0;
		
		// 순열 뽑기
		for(int tempA = 1; tempA < 10; tempA++) {
			for(int tempB = 1 ; tempB < 10; tempB++) {
				abToString = Integer.toString(tempA) + Integer.toString(tempB);
				baToString = Integer.toString(tempB) + Integer.toString(tempA);
				
				ab = Integer.parseInt(abToString);
				ba = Integer.parseInt(baToString);
				
				if(ab + ba ==99) {
					permu_1.add(new int[]{tempA, tempB});
				}
			}
		}
		
		// 조합으로 만들기
		List<int[]> combi_1 = new ArrayList<>(permu_1); // 조합 -> 순서 상관 X
		for(int i = 0; i<combi_1.size(); i++) {
			int[] temp = combi_1.get(i);
			for(int j = i+1; j<(combi_1.size()); j++) {
				int[] compare = combi_1.get(j);
				if(temp[0] == compare[1]) {
					combi_1.remove(j);
				}
			}
		}
		
		System.out.println("순열");
		printList(permu_1);
		System.out.println("조합");
		printList(combi_1);
		
		System.out.println();
		System.out.println("2) a+b=9 이면 되는건가");
		List<int[]> permu_2 = new ArrayList<>(); // 순열 -> 순서 상관 O
		
		
		// 순열 뽑기
		for(int tempA = 1; tempA < 10; tempA++) {
			for(int tempB = 1 ; tempB < 10; tempB++) {
				if((tempA + tempB) == 9) {
					permu_2.add(new int[]{tempA, tempB});
				}
			}
		}
		
		// 조합으로 만들기
		List<int[]> combi_2 = new ArrayList<>(permu_2); // 조합 -> 순서 상관 X
		for(int i = 0; i<combi_2.size(); i++) {
			int[] temp = combi_2.get(i);
			for(int j = i+1; j<(combi_2.size()); j++) {
				int[] compare = combi_2.get(j);
				if(temp[0] == compare[1]) {
					combi_2.remove(j);
				}
			}
		}		
		
		System.out.println("순열");
		printList(permu_2);
		System.out.println("조합");
		printList(combi_2);
	}
	
	private void printList(List<int[]> list) {
		System.out.println("A / B");
		for(int[] a : list) {
			System.out.println(a[0]+" / "+a[1]);
		}
	}
}

public class Answer {
	public static void main(String[] args) {
		Answer01 a1 = new Answer01();
		Answer02 a2 = new Answer02();
		Answer03 a3 = new Answer03();
		Answer04 a4 = new Answer04();
		Answer05 a5 = new Answer05();
		Answer06 a6 = new Answer06();
		Answer07 a7 = new Answer07();
		Answer08 a8 = new Answer08();
		Answer09 a9 = new Answer09();
		
		a1.answer();
		a2.answer();
		a3.answer();
		a4.answer();
		a5.answer();
		a6.answer();
		a7.answer();
		a8.answer();
		a9.answer();
		
		System.out.println("자체 평가");
		System.out.println("9번 문제 너무 어렵게 푼 것 같다... 반성한다.");
		
    }
}