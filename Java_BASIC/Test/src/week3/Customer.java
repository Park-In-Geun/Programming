package week3;

public class Customer extends Person {
	String Pnum; //고객번호
	String Pm; //고객 마일리지
	
	Customer(){
		this("unknown", "unknown");
	}
	
	Customer(String pn, String pm){
		this.Pnum = pn;
		this.Pm = pm;
	}

	public String getPnum() {
		return "고객번호 : " + this.Pnum + "번\n";
	}

	public void setPnum(String pnum) {
		this.Pnum = pnum;
	}

	public String getPm() {
		return "고객 마일리지 : " + this.Pm + "점\n";
	}

	public void setPm(String pm) {
		this.Pm = pm;
	}

	
	
}
