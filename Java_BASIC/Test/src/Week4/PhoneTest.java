package Week4;

public class PhoneTest {
	public static void main(String args[]){
		SmartPhone[] Smartphones = { new SmartPhone("�Ｚ",1000000,"3G",32,true),
						   new SmartPhone("����",900000,"3G",64,false),
						   new SmartPhone("�Ｚ",400000,"2G",16,false),
						   new SmartPhone("����",500000,"2G",32,true),
		};
		
		for(int i = 0 ; i < Smartphones.length;i++){
			System.out.println((i+1) + "�� ° ����Ʈ�� Maker : " + Smartphones[i].getMaker() + " Price : " + Smartphones[i].getPrice() + " Type : " + Smartphones[i].getType() + " Memory : " + Smartphones[i].getMemory() + " hasBluetooth : " + Smartphones[i].getHasBluetooth());
		}
		
	}
}
