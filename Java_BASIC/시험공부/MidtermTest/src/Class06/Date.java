package Class06;


public class Date {
	private String year;
	private String month;
	private String day;
	
	Date(String y, String m, String d){
		this.year = y;
		this.month = m;
		this.day = d;
	}
	
	String print1(){
		return this.year + "." + this.month + "." + this.day + "\n";
	}
	String print2(){
		return this.month + " " + this.day + ", " + this.year + "\n";	
	}
}
