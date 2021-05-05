package quiz2;

public class Dog extends Animal{
	static int count;
	String name;
	
	Dog(){
		this("Anonymous");
	}
	
	Dog(String n){
		this.name = n;
		this.count += 1;
	}
	
	public void sound(){
		System.out.print(" �۸�");
	}
	
	static int getCountDog(){
		return count;
	}
	
	public String toString(){
		return this.name + "������";
	}
	
	
}