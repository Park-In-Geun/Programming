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
			System.out.print("전화번호를 입력하세요(q 를 입력시 종료) : ");
			
			telNum = key.next();
			
			if(telNum.equals("q")){
				System.out.print("검색 시스템 종료!");
				break;
			}
			
			for(int i = 0; i < cp.length; i++){
				if(cp[i].getTelNum().equals(telNum)){
					System.out.println(telNum + "의 전원 상태 : " + cp[i].getPower());
					flag = 1;
				}	
			}
			if(flag == 0){
				System.out.print("찾으시는 번호가 없습니다.\n");
			}
		}		
	}
}
