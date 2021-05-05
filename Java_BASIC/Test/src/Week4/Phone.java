package Week4;

public class Phone {
	String maker;
	int price;
	String type;
	
	Phone(String m, int p, String t){
		this.maker = m;
		this.price = p;
		this.type = t;
	}

	public String getMaker() {
		return this.maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
