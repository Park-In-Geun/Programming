package school;

public class School_member { //빈즈 클래스 입니다.
	
	String school; 
	String name;
	String id_number;
	String password;
	String subject;
	//빈즈 클래스에서 사용할 멤버변수입니다.
	
	public String getSchool() { //school에 대한 getter 메서드 입니다.
		return school; 
	}
	public void setSchool(String school) { //school에 대한 setter 메서드 입니다.
		this.school = school; 
	}
	public String getId_number() { //id_number에 대한 getter 메서드 입니다.
		return id_number;
	}
	public void setId_number(String id_number) { //id_number에 대한 setter 메서드입니다.
		this.id_number = id_number;
	}
	public String getName() { //name에 대한 getter 메서드 입니다.
		return name; 
	}
	public void setName(String name) { //name에 대한 setter 메서드입니다.
		this.name = name;
	}
	public String getSubject() { //subject에 대한 getter메서드 입니다.
		return subject;
	}
	public void setSubject(String subject) { //subject에 대한 setter메서드입니다.
		this.subject = subject;
	}
	public String getPassword() { //password에 대한 getter메서드입니다.
		return password;
	}
	public void setPassword(String password) { //password에 대한 setter메서드 입니다.
		this.password = password;
	}
	
	
}
