package Class06;

public class CellPhone {
	static private int count; // �ڵ��� ����
	private String telNum; // ����ȣ
	private boolean power; // on/off
	
	CellPhone(String n){
		this.telNum = n;
		this.power = true;
		count++;
	}
	
	static int getCount(){
		return count;
	}
	
	void powerToggle(){
		this.power = !this.power;
	}
	
	public String getTelNum(){
		return this.telNum;
	}
	
	public boolean getPower(){
		return this.power;
	}
	
	
	public String toString(){
		return "��ȭ��ȣ : " + this.telNum + "\n���� ���� : " + this.power + "\n�ڵ��� ��ü ���� :" + getCount();
	}
	
}
