package Class06;

public class Dog {
	private int age;
	private int food;
	static private int total;
	private String color;
	
	Dog(){
		this(0, 0, "anonymous");
	}
	
	Dog(int a, int f, String c){
		this.age = a;
		this.food = f;
		this.color = c;
		total++;
	}
	
	String barking(){
		if(this.food == 0){
			return "�ù���\n";
		}
		this.food--;
		return "�۸�\n";
	}
	
	boolean hungry(){
		if(this.food <= 1){
			return true;
		}
		return false;
	}
	boolean sleeping(int f){
		if(f > 0){
			this.food += f;
			return false;
		}
		return true;
	}

	public String toString() {
		return "Dog [age=" + this.age + ", food=" + this.food + ", color=" + this.color + "]\n";
	}
	
	public static int getTotal(){
		return total;
	}
	
}
