
public class Female extends Human implements IDuty{
	
	Female(){
		this(0, "None");
	}
	
	Female(int a, String s){
		super.age = a;
		super.nationaliy = s;
	}
	
	public String goArmy(){
		return "군에 안가요";
	}
	
	public String careCOVID19(){
		if(this.nationaliy == "Korean"){
			return "careCOVID19 great";
		}
		return "careCOVID19 not bad";
	}
	
	public String toString() {
		return "Female, " + super.age + ", " + super.nationaliy + ", "+ careCOVID19() + ", " + goArmy();
	}
}
