package Extends;

public class Cylinder extends Circle{
	private double height;
	
	Cylinder(){
		this(0.0, 0.0);
	}
	
	Cylinder(double r){
		this(r, 0.0);
	}
	
	Cylinder(double r, double h){
		super(r);
		this.height =h;
	}
	
	double getHeight(){
		return this.height;
	}
	
	double getVolume(){
		return super.getRadius()*getHeight();
	}
}
