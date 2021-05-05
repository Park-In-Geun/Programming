
public class Dog {
	private int age; //����
	private String color; //����
	private int food; //���İ���
	static private int total; //Dog ��ü ��
	
	Dog(int age, String color, int food){
		this.age = age;
		this.color = color;
		this.food = food;
		total++;
	}
	
	String barking(){
		if(this.food==0){ return "�ù���\n"; }
		this.food--;
		return "�۸�\n";
	}
	
	boolean hungry(){
		if(this.food <= 1) return true;
		else return false;
	}
	
	boolean sleeping(int nfood){
		if(nfood <= 0){
			return true;
		}
		else{
			this.food += nfood;
			return false;
		}
	}
	
	String getColor(){
		return this.color;
	}
	
	int getFood(){
		return this.food;
	}
	
	public String toString(){
		return "������ ���� : " + this.age + ", ������ ���� : " + this.color + ", ���� ���� : " + this.food + "\n";
	}
	
	static int getTotal(){
		return total;
	}
}
