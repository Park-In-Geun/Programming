package Week4;

public class FamilyExample {
	public static void main(String[] args) {
		
		Family family = new Family();

		family.operation(); System.out.println();
		
		System.out.println( family.change("boy", "applephone") + "\n");
		System.out.println( family.change("girl", "andrphone") + "\n");
		
		
		family.operation(); System.out.println();
	}
}
