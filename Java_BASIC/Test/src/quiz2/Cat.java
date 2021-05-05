package quiz2;

public class Cat extends Animal{
	static int count;
	String name;
	
	Cat(){
		this("Anonymous");
	}
	
	Cat(String n){
		this.name = n;
		this.count += 1;
	}
	
	public void sound(){
		System.out.print(" ��~��");
	}
	
	int getCountCat(){
		return this.count;
	}
	
	public String toString(){
		return this.name + "������";
	}
	
}
