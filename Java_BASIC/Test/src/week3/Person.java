package week3;

public class Person {
	String name; // �̸�
	String address; // �ּ�
	String tel; //��ȭ��ȣ
	
	
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
		return "�� �̸� : " + this.name + "\n";
	}
	
	public String getAddress(){
		return "�� �ּ� : " + this.address + "\n";
	}
	
	public String getTel(){
		return "�� ��ȭ��ȣ : " + this.tel + "\n";
	}
}
