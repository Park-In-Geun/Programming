package week3;

public class Magazine extends Book{
	String date; // �߸��� ����

	Magazine(String t, int p, String w, String d){
		super(t,p,w);
		this.date = d;
	}
	
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String toString(){
		return super.toString() + "\n�߸��� : " + this.date;
	}
}
