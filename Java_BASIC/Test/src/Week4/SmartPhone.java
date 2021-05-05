package Week4;

public class SmartPhone extends Phone{
	int memory;
	boolean hasBluetooth;
	
	SmartPhone(String maker, int price, String type, int m, boolean h){
		super(maker,price,type);
		this.memory = m;
		this.hasBluetooth = h;
	}

	public int getMemory() {
		return this.memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public boolean getHasBluetooth() {
		return this.hasBluetooth;
	}

	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}
	
	
}
