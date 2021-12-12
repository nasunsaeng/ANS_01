package conditionAndRepetition.seongho;

public class Answer1 {

	
	//if 를 하나만 사용해서 바꾸기
	
	public static void main(String[] args) {
		int num = 120;
		if(num >0 && (num%2)==0) {
				System.out.println("양수이면서 짝수");
			}
		}
	}


// 1) 짝수 인지 홀수인지 알아내는 알고리즘은?
// 정답 : if문에서  2로 나누었을때 나머지가 0이라면 true는 짝수 false는 홀수
// 2) 조건문의 조선식이 중첩되어있을때 순서를 어떤식으로 배치해야하는가?
// 정답 : dead code가 생겨날수도있으니 포함관계를 확인해야할거같습니다 ..
