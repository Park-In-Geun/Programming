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
		//id가 blue가 아니라면 NotExistIDException 발생시킴	
		//password가 12345가 아니라면 WrongPasswordException 발생시킴
		if(id != "blue"){
			throw new NotExistIDException("ID가 일치하지 않습니다.");
		}
		else if(password != "12345"){
			throw new WrongPasswordException("PASSWORD가 일치하지 않습니다.");
		}
	}
}
