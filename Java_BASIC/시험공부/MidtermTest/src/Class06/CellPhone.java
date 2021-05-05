package Class06;

public class CellPhone {
	static private int count; // 핸드폰 수량
	private String telNum; // 폰번호
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
		return "전화번호 : " + this.telNum + "\n전원 상태 : " + this.power + "\n핸드폰 전체 수량 :" + getCount();
	}
	
}
