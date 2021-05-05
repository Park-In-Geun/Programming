package Class06;

public class DogTest {
	public static void main(String args[]){
		Dog d[] = new Dog[5]; 
	
		System.out.println(Dog.getTotal());
		
		for(int i = 0 ; i < d.length; i++){
			d[i] = new Dog(i, 10+i, "anycolor");
		}
		
		System.out.println(Dog.getTotal());
		
		
	}
}
