package Extends;

public class Circle {
	private double radius;
	private String color;
	
	Circle(){
		this(0.0);
	}
	Circle(double r){
		this.radius = r;
	}
	
	double getRadius(){
		return this.radius;
	}
	
	double getArea(){
		return this.radius * this.radius * 3.14;
	}
	
}
