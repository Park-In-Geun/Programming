package quiz7;

public class Rectangle implements IGraphicsObject{
	private int length;
	private int width;
	
	public void setDimensions(int l, int w){
		this.length = l;
		this.width = w;
	}
	
	public int getArea(){
		return this.length * this.width;
	}
	
	public void draw(){
		System.out.print("사각형을 그립니다.");
	}

}
