package Extends;

public class Customer extends Person{

	private String cnum;
	private int m;
	
	Customer(){
		this("000",0);
	}
	Customer(String c,int mil){
		this.cnum = c;
		this.m = mil;
	}
	public String getCnum() {
		return cnum;
	}
	public void setCnum(String cnum) {
		this.cnum = cnum;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	
	
}
