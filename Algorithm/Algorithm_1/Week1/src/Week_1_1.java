import java.util.Scanner; //java.util ��Ű���� �ִ� Scanner Ŭ������ ����ϱ� ���� ����մϴ�.

public class Week_1_1 {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); //factorial ���� ����� ���� �Է¹ޱ� ���� ��ü�� �����մϴ�.
		
		System.out.print("input value : "); //����ڿ��� �Է��� �䱸�ϴ� ��¹� �Դϴ�.
		
		int n = input.nextInt(); //����ڿ��Լ� ���������� �Է¹޾� n�� int���� �Ҵ��մϴ�.
		
		System.out.println(n + " Loop Factorial result : " + loopFactorial(n)); 
		//�Է¹��� ���� n�� loopFactorial()�Լ��� �����ؼ� ���� ����� ������ݴϴ�. 
		
		System.out.println(n + " Recursion Factorial result : " + recFactorial(n)); 
		//�Է¹��� ���� n�� recFactorial()�Լ��� �����ؼ� ����� ������ݴϴ�.
	}
	
	static int loopFactorial(int n){ //�ݺ������� factorial�� ���ϴ� �Լ��Դϴ�.
		
		int result = 1; //reulst ��� ������ ������ �����ϰ� 1 ���� �־��ݴϴ�.
		
		for(int i = 1; i <= n; i++){ //������ ���� i�� 1���� �Է¹��� n ���� �۰ų� ���� ������ i�� 1�� ������Ű�� �ݺ����Դϴ�.
			result *= i; //result�� result*i�� ���� �־��ݴϴ�. 
		}
		return result; //result ���� ��ȯ�� �ݴϴ�.
	}
	
	static int recFactorial(int n){ //���,��ȯ ������� factorial�� ���ϴ� �Լ��Դϴ�.
		if(n <= 1) return 1; //�Է¹��� n�� ���� 1���� �۰ų� ���� ���� 1 �� ��ȯ�� �ݴϴ�.
		else return n * recFactorial(n - 1); 
		//�Է¹��� n�� ���� 1���� Ŭ ��� n ���ٰ� �ڱ� �ڽ�(�Լ�)�� n-1�� ���� �־ ���� ���� ���ؼ� ��ȯ�� �ݴϴ�.
	}
}