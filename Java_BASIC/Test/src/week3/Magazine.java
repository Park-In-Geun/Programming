package week3;

public class Magazine extends Book{
	String date; // 발매일 정보

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
		return super.toString() + "\n발매일 : " + this.date;
	}
}
