package API11;

public class BasicAPITest {
	public static void main(String[] args) {
		int count = 0;
		
		
		for(int i = 0 ; i < args.length ; i++){
			System.out.print(args[i] + " ");
			for(int j = 0; j < args[i].length(); j++){
				char tmp = args[i].charAt(j);
				if('0' <= tmp && tmp <= '9'){
					count++;
				}
			}
		}
		
		System.out.println("\n����=" + count + "��");
		
	}
}
