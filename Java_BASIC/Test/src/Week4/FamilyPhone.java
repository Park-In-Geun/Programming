package Week4;

public class FamilyPhone{
	
	String ftype;
	String stype;
	
	FamilyPhone(String f){
		this.ftype = f;
	}

	public String getFtype() {
		return this.ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public String getStype() {
		return this.stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}
	
	public String toString(){
		return this.ftype + "통화를 합니다.";
	}

}
