package excepQuiz;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} 
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public static void login(String id, String password) throws NotExistIDException,WrongPasswordException{
		//id�� blue�� �ƴ϶�� NotExistIDException �߻���Ŵ	
		//password�� 12345�� �ƴ϶�� WrongPasswordException �߻���Ŵ
		if(id != "blue"){
			throw new NotExistIDException("ID�� ��ġ���� �ʽ��ϴ�.");
		}
		else if(password != "12345"){
			throw new WrongPasswordException("PASSWORD�� ��ġ���� �ʽ��ϴ�.");
		}
	}
}
