package Week4;

public class Test {
	public static void main(String agrs[]){
		Fruit fs[] = { new Fruit(),
					   new Apple(),
					   new Grape(),
					   new Pear() };
		
		System.out.println("Fruit Å¬·¡½ºÀÇ me()°´Ã¼ : " + fs[0].me());
		System.out.println("Apple Å¬·¡½ºÀÇ me()°´Ã¼ : " + fs[1].me());
		System.out.println("Grape Å¬·¡½ºÀÇ me()°´Ã¼ : " + fs[2].me());
		System.out.println("Pear Å¬·¡½ºÀÇ me()°´Ã¼ : " + fs[3].me());
		
	}
}
