package Class06;
import java.util.Scanner;

public class CellPhoneTest {
	public static void main(String args[]){
		CellPhone cp[] = { new CellPhone("010-0000-0000"),
							new CellPhone("010-1111-1111"),
							new CellPhone("010-2222-2222"),
							new CellPhone("010-3333-3333"),
							new CellPhone("010-4444-4444")};
		String telNum;
		Scanner key = new Scanner(System.in);
		int flag = 0;
		
		while(true){
			System.out.print("��ȭ��ȣ�� �Է��ϼ���(q �� �Է½� ����) : ");
			
			telNum = key.next();
			
			if(telNum.equals("q")){
				System.out.print("�˻� �ý��� ����!");
				break;
			}
			
			for(int i = 0; i < cp.length; i++){
				if(cp[i].getTelNum().equals(telNum)){
					System.out.println(telNum + "�� ���� ���� : " + cp[i].getPower());
					flag = 1;
				}	
			}
			if(flag == 0){
				System.out.print("ã���ô� ��ȣ�� �����ϴ�.\n");
			}
		}		
	}
}
