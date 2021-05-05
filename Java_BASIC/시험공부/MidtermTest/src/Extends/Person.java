package Extends;

public class Person {
	private String name;
	private String address;
	private String tel;
	
	Person(){
		this("anonymous","anonymous","anonymous");
	}
	Person(String n, String a, String t){
		this.name = n;
		this.address = a;
		this.tel = t;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String n){
		this.name = n;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
