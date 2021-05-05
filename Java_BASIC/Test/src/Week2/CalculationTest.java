package Week2;

public class CalculationTest {
	public static void main(String args[]){
		Calculation cal = new Calculation();
		
		System.out.print("2개의 정수의 합 = " + cal.sum(5, 25));
		System.out.print("\n3개의 정수의 합 = " + cal.sum(5, 25, 100));
		
	}
}
