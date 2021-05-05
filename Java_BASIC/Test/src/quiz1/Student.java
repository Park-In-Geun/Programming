package quiz1;

public class Student {
	private String name;
	private int score;
	static private int stdcount;
	
	Student(int s){
		this("anonymous",s);
	}
	Student(String n, int s){
		this.name = n;
		this.score = s;
		this.stdcount++;
	}
	
	int getScore(){
		return this.score;
	}
	
	String getName(){
		return this.name;
	}
	
	static int getStdcount() {
		return stdcount;
	}
	
	
	
}
