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
			return this.ftype + "������ȭ�� �ϸ� ��ȭ������ �����մϴ�.";
		}
		else if(this.ctype && !this.record){
			return this.ftype + "������ȭ�� �մϴ�.";
		}
		return this.ftype + "��ȭ�� �մϴ�.";
	}
}
