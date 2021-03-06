import java.util.Scanner; //java.util 패키지에 있는 Scanner 클래스를 사용하기 위해 사용합니다.

public class Week_1_1 {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); //factorial 에서 사용할 수를 입력받기 위해 객체를 생성합니다.
		
		System.out.print("input value : "); //사용자에게 입력을 요구하는 출력문 입니다.
		
		int n = input.nextInt(); //사용자에게서 정수형으로 입력받아 n에 int형을 할당합니다.
		
		System.out.println(n + " Loop Factorial result : " + loopFactorial(n)); 
		//입력받은 정수 n을 loopFactorial()함수에 삽입해서 나온 결과를 출력해줍니다. 
		
		System.out.println(n + " Recursion Factorial result : " + recFactorial(n)); 
		//입력받은 정수 n을 recFactorial()함수에 삽입해서 결과를 출력해줍니다.
	}
	
	static int loopFactorial(int n){ //반복문으로 factorial을 구하는 함수입니다.
		
		int result = 1; //reulst 라는 정수형 변수를 선언하고 1 값을 넣어줍니다.
		
		for(int i = 1; i <= n; i++){ //정수형 변수 i가 1부터 입력받은 n 보다 작거나 같을 때까지 i를 1씩 증가시키는 반복문입니다.
			result *= i; //result에 result*i의 값을 넣어줍니다. 
		}
		return result; //result 값을 반환해 줍니다.
	}
	
	static int recFactorial(int n){ //재귀,순환 방식으로 factorial을 구하는 함수입니다.
		if(n <= 1) return 1; //입력받은 n의 값이 1보다 작거나 같을 때는 1 을 반환해 줍니다.
		else return n * recFactorial(n - 1); 
		//입력받은 n의 갓이 1보다 클 경우 n 에다가 자기 자신(함수)에 n-1의 값을 넣어서 나온 값을 곱해서 반환해 줍니다.
	}
}
