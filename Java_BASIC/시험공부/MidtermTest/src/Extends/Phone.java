package Extends;

public class Phone {
	
	String name;
	String phone;

	
	public String change(String f, String p){
		this.phone = p;
		return f + "의 핸드폰을 교환합니다.";
	}
	
}
