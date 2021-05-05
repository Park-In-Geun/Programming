package week3;
import java.util.Scanner;


public class PTest {
	public static void main(String args[]){
		Prun pr = new Prun();
		Scanner k = new Scanner(System.in);
		int n;
		
		while(true){
			System.out.println("Person & Customer 클래스의 테스트 클래스입니다.");
			System.out.println("보고 싶은 정보를 입력해 주세요.");
			System.out.println("1 : 고객정보 입력 X 객체, 2 : 고객정보 입력 O 객체, 3 : 종료");
			n = k.nextInt();
			if(n==1){
				pr.run();
			}
			else if(n==2){
				pr.run2();
			}
			else if(n==3){
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
