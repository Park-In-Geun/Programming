package Week4;

public class Test {
	public static void main(String agrs[]){
		Fruit fs[] = { new Fruit(),
					   new Apple(),
					   new Grape(),
					   new Pear() };
		
		System.out.println("Fruit Ŭ������ me()��ü : " + fs[0].me());
		System.out.println("Apple Ŭ������ me()��ü : " + fs[1].me());
		System.out.println("Grape Ŭ������ me()��ü : " + fs[2].me());
		System.out.println("Pear Ŭ������ me()��ü : " + fs[3].me());
		
	}
}
