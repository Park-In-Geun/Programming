package week3;

public class BandMTest {
	public static void main(String args[]){
		Magazine magA = new Magazine("잡지A",10,"기자A","2010년 2월 25일");
		Magazine magB = new Magazine("잡지B",20,"기자B","2010년 3월 8일");
		
		System.out.println(magA.toString());
		System.out.println(magB.toString());
	}
}
