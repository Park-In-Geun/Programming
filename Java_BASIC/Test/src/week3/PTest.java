package week3;
import java.util.Scanner;


public class PTest {
	public static void main(String args[]){
		Prun pr = new Prun();
		Scanner k = new Scanner(System.in);
		int n;
		
		while(true){
			System.out.println("Person & Customer Ŭ������ �׽�Ʈ Ŭ�����Դϴ�.");
			System.out.println("���� ���� ������ �Է��� �ּ���.");
			System.out.println("1 : ������ �Է� X ��ü, 2 : ������ �Է� O ��ü, 3 : ����");
			n = k.nextInt();
			if(n==1){
				pr.run();
			}
			else if(n==2){
				pr.run2();
			}
			else if(n==3){
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}
