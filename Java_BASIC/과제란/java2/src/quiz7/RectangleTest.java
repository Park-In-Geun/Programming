package quiz7;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle re = new Rectangle();
		
		re.setDimensions(100, 50);
		re.draw();
		System.out.print("\n�簢���� ���� : " + re.getArea());
		
	}
}
