
public class Male extends Human implements IDuty{
	Male(){
		this(0, "None");
	}
	
	Male(int a, String s){
		super.age = a;
		super.nationaliy = s;
	}
	
	public String goArmy(){
		if(super.age >= 20 && super.nationaliy == "Korean"){
			return "군에 가야해요";
		}
		return "군에 안가요";
	}
	
	public String careCOVID19(){
		if(super.nationaliy == "Korean"){
			return "careCOVID19 great";
		}
		return "careCOVID19 not bad";
	}

	public String toString() {
		return "Male, " + super.age + ", " + super.nationaliy + ", "+ careCOVID19() + ", " + goArmy();
	}
	
	
}
