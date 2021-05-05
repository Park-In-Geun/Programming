import java.util.*;

public class DogRun {
	public void run() {
		Dog d_array[] = new Dog[5];
		d_array[0] = new Dog(1, "Red", 2);
		d_array[1] = new Dog(3, "Green", 4);
		d_array[2] = new Dog(5, "Blue", 6);
		d_array[3] = new Dog(7, "Brown", 8);
		d_array[4] = new Dog(9, "Yellow", 10);
		Scanner key = new Scanner(System.in);
		String color;
		
		System.out.print("���������� ����\n");
		for (int i = 0 ; i < 5 ; i++) {
			System.out.print(d_array[i]);
		}

		do {
			System.out.print("\n�������� ������ �Է��ϼ���(���� q) : ");
			color = key.next();
			int flag = 0;
			
			if(color.charAt(0) == 'q') {
				System.out.print("\n'q'�� �Է��ϼ̽��ϴ�.\n���α׷��� �����մϴ�.");
				break;
			}
			
			for (Dog dg : d_array) {
				if (dg.getColor().equals(color)) {
					System.out.print("\n�Է��Ͻ� ������ ���� �������� ������ �ִ� ���� �� : "
							+ dg.getFood());
					flag = 1;
				}
			}
			if(flag == 0){
				System.out.print("�Է��Ͻ� ������ ���� �������� �����ϴ�.");
			}
			
		} while (true);
	}
}
