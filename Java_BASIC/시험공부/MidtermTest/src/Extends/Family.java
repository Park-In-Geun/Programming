package Extends;

public class Family extends Phone{
	Phone f[] = new Phone[4];
	
	Family(){
		f[0].name = "dad";
		f[1].name = "mom";
		f[2].name = "girl";
		f[3].name = "boy";
	}
	
	public void operation(){
		
		for(int i = 0; i < f.length;i++){
			if(f[i].phone == "applephone"){
				System.out.println(f[i].name + "영상통화를 하며 통화내용을 녹음합니다.");
			}
			else if(f[i].phone == "androphone"){
				System.out.println(f[i].name + "영상통화를 합니다.");
			}
			else
				System.out.println(f[i].name + "통화를 합니다.");
		}
	}
	
	public String change(String f, String p){
		return super.change(f, p);
	}
	
}
