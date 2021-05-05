package week3;

public class Person {
	String name; // 이름
	String address; // 주소
	String tel; //전화번호
	
	
	Person(){
		this("unknown","unknown","unknown");
	}
	
	Person(String n, String a, String t) {
		this.name = n;
		this.address = a;
		this.tel = t;
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	public void setAddress(String a){
		this.address = a;
	}
	
	public void setTel(String t){
		this.tel = t;
	}
	
	public String getName(){
		return "고객 이름 : " + this.name + "\n";
	}
	
	public String getAddress(){
		return "고객 주소 : " + this.address + "\n";
	}
	
	public String getTel(){
		return "고객 전화번호 : " + this.tel + "\n";
	}
}
