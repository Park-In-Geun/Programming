package quiz2;

public abstract class  Animal {
	
	String reaction(Animal ani){
		if(ani instanceof Dog){
			return "部府棵府绊";
		}
		else return "部府郴府绊";
	}
	
	public abstract void sound();
	
	public String toString(){
		return "Anonymous";
	}
	
	
	
}
