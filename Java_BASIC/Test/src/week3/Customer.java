package week3;

public class Customer extends Person {
	String Pnum; //����ȣ
	String Pm; //�� ���ϸ���
	
	Customer(){
		this("unknown", "unknown");
	}
	
	Customer(String pn, String pm){
		this.Pnum = pn;
		this.Pm = pm;
	}

	public String getPnum() {
		return "����ȣ : " + this.Pnum + "��\n";
	}

	public void setPnum(String pnum) {
		this.Pnum = pnum;
	}

	public String getPm() {
		return "�� ���ϸ��� : " + this.Pm + "��\n";
	}

	public void setPm(String pm) {
		this.Pm = pm;
	}

	
	
}
