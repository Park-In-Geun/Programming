package Week4;

public class FamilySPhone extends FamilyPhone {
	
	String ftype;
	boolean ctype;
	boolean record;
	

	FamilySPhone(String f, boolean c, boolean r){
		super(f);
		this.ftype = f;
		this.ctype = c;
		this.record = r;
	}
	
	public String toString(){
		if(this.ctype && this.record){
			return this.ftype + "영상통화를 하며 통화내용을 녹음합니다.";
		}
		else if(this.ctype && !this.record){
			return this.ftype + "영상통화를 합니다.";
		}
		return this.ftype + "통화를 합니다.";
	}
}
