
public class HumanTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human [] hu = new Human[7];
		
        hu[0] = new Male(15, "Korean");
        hu[1] = new Male(22, "Korean");
        hu[2] = new Male(22, "AnyNation");
        hu[3] = new Male();
        hu[4] = new Female();
        hu[5] = new Female(22, "Korean");
        hu[6] = new Female(22, "AnyNation");

        for(Human obj : hu)
            System.out.println(obj);	
	}
}
