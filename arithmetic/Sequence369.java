package arithmetic;

/**
 * 3의 배수를 제외한 1 부터 10까지 정수 출력 [결과] 1 2 4 5 7 8 10
 */
public class Sequence369 {
	public static void main(String[] args) {
		System.out.println("3의 배수를 제외한 1부터 10까지 정수 출력");
		String res= "";
		for(int i = 0; i <10; i++) {
			if((i+1)%3 !=0) {
				if(i+1<10) {
					res += i+1+",";
				}else {
					res += i+1;
				}
			} 
		}
			System.out.println(res);
		}
	}
