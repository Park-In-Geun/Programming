package quiz2;

public abstract class  Animal {
	
	String reaction(Animal ani){
		if(ani instanceof Dog){
			return "�����ø���";
		}
		else return "����������";
	}
	
	public abstract void sound();
	
	public String toString(){
		return "Anonymous";
	}
	
	
	
}