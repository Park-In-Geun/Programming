
public class Dog {
	private int age; //³ªÀÌ
	private String color; //»ö±ò
	private int food; //°£½Ä°³¼ö
	static private int total; //Dog °´Ã¼ ¼ö
	
	Dog(int age, String color, int food){
		this.age = age;
		this.color = color;
		this.food = food;
		total++;
	}
	
	String barking(){
		if(this.food==0){ return "½Ã¹«·è\n"; }
		this.food--;
		return "¸Û¸Û\n";
	}
	
	boolean hungry(){
		if(this.food <= 1) return true;
		else return false;
	}
	
	boolean sleeping(int nfood){
		if(nfood <= 0){
			return true;
		}
		else{
			this.food += nfood;
			return false;
		}
	}
	
	String getColor(){
		return this.color;
	}
	
	int getFood(){
		return this.food;
	}
	
	public String toString(){
		return "°­¾ÆÁö ³ªÀÌ : " + this.age + ", °­¾ÆÁö »ö±ò : " + this.color + ", °£½Ä °³¼ö : " + this.food + "\n";
	}
	
	static int getTotal(){
		return total;
	}
}
