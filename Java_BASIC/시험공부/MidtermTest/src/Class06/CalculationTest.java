package Class06;

public class CalculationTest {
	public static void main(String args[]){
		Calculation c = new Calculation();
		
		System.out.println("2개의 정수 계산 sum = "  + c.sum(5, 5));
		System.out.println("3개의 정수 계산 sum = "  + c.sum(5, 5, 10));
	}
}
