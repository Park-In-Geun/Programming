package Week4;

public class Family	{

	FamilyPhone[] fp = new FamilyPhone[4];
	
	Family(){
		fp[0] = new FamilyPhone("dad");
		fp[1] = new FamilyPhone("mom");
		fp[2] = new FamilyPhone("girl");
		fp[3] = new FamilyPhone("boy");
	}
	
	public void operation(){
		for(int i = 0 ; i < fp.length;i++){
			System.out.println(fp[i].toString());
		}
	}
	
	public boolean change(String n, String stype){
		for(int i=0;i<fp.length;i++){
			if(fp[i].getFtype() == n){
				if(stype== "andrphone"){
					fp[i] = new FamilySPhone(fp[i].getFtype(), true, false);
					System.out.println(fp[i].getFtype() + "의 핸드폰을 교환합니다.");
					return true;
				}
				else if(stype == "applephone"){
					fp[i] = new FamilySPhone(fp[i].getFtype(), true, true);
					System.out.println(fp[i].getFtype() + "의 핸드폰을 교환합니다.");
					return true;
				}
				else
					return false;
			}
		}
		return false;
	}

}
