package school;

import java.sql.*;

public class DBConnection {
	private static final String JDBC_DRIVER = "org.gjt.mm.mysql.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/school";
	private static final String USER = "root";
	private static final String PASSWD = "1116";
	//jdbc 드라이버 로딩 , mysql 연결 입니다.
	
	private Connection con = null; //connection 클래스의 con 변수를 설정후 null값을 넣어줍니다.
	private PreparedStatement pstmt = null; //데이터베이스 연결로 부터 SQL 문을 수행할 수 있도록 해주는 클래스 PreparedStatement 의  변수 pstmt를 선언하고 null값응 넣어줍니다.
	
	public DBConnection(){ //DB 연결 입니다.
		try{
			Class.forName(JDBC_DRIVER); //class.forName 메서드를 이용해 jdbc 드라이버를 로딩합니다.
		}catch(Exception e){ 
			e.printStackTrace(); //오류 발생시 e.printStackTrace 메서드를 실행합니다.
		}
	}
	
	public void connect(){ //mysql을 사용하기 위해 연결합니다.
		try{
			con = DriverManager.getConnection(JDBC_URL, USER, PASSWD); //Connection 클래스 인스턴스 레퍼런스를 얻기 위한 방법입니다.
		}catch(Exception e){
			e.printStackTrace(); //오류 발생시 e.printStackTrace 메서드를 실행합니다.
		}
	}
	
	public void disconnect(){ // 연결 해제 메서드입니다.
		if(pstmt!=null){ //pstmt의 값이 null이 아닐경우
			try{
				pstmt.close(); //pstmt.close() 메서드를 통해 해제합니다.
			}catch(Exception e){
				e.printStackTrace(); //오류 발생시 e.printStackTrace 메서드를 실행합니다.
			}
		}
		if(con!=null){ //con의 값이 null이 아닐경우
			try{
				con.close(); //con.close() 메서드를 통해 해제합니다.
			}catch(Exception e){ 
				e.printStackTrace(); //오류 발생시 e.printStackTrace 메서드를 실행합니다.
			}
		}
	}
	
	public boolean insertMember(School_member member){ //회원 가입시 사용할 메서드 입니다. School_member 빈즈 클래스를 사용합니다.
		boolean success = false; //success에 false값을 넣습니다.
		connect(); //mysql을 연결합니다.
		String sql = "insert into member(school,id_number,password,name) values(?,?,?,?)"; //member테이블에 학교,아이디(햑번),비번,이름을 삽입합니다.
		try{
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getSchool());
			pstmt.setString(2, member.getId_number());
	        pstmt.setString(3, member.getPassword());
	        pstmt.setString(4, member.getName());
	        //pstmt에 sql을 연결하고 1,2,3,4에 해당하는 값들을 넣어줍니다.
			pstmt.executeUpdate(); //insert문을 사용했으므로 executeUpdate를 사용합니다.
			success = true; //success에 true값을 넣어줍니다.
			disconnect(); //연결을 해제합니다.
			return success; //success를 반환합니다.
		}catch(SQLException e){ 
			e.printStackTrace();//오류 발생시 e.printStackTrace 메서드를 실행합니다.
			return success; //success를 반환합니다.
		}

	}
	public boolean isMember(String id_number,String password){ //로그인 시 사용할 메서드 입니다. 아이디(학번)과 비밀번호 를 받습니다.
		connect(); //mysql을 연결합니다.
		String sql="select * from member"; //member테이블에 있는 값들을 select를 사용해 데이터를 조회합니다.
		ResultSet rs=null; //조회 결과를 반환하기 위한 ResultSet의 변수 rs에 null값을 넣어줍니다.
		
		try{
			pstmt=con.prepareStatement(sql); //pstmt에 sql을 연결합니다.
			rs = pstmt.executeQuery(sql); //select문을 사용했으므로 executeQuery를 사용해 sql의 내용을 rs에 넣어줍니다.
			
				while(rs.next()) // rs.next() 메서드로 다음 데이터를 확인합니다. 
					if(id_number.equals(rs.getString("id_number")) && password.equals(rs.getString("password"))) //id_number와 password가 sql에 저장된 id_number와 password와 일치하면 
						return true; //true를 반환합니다.
			
			rs.close(); // ResultSet객체의  close() 메서드를 이용해 리소스를 반환합니다.
			disconnect(); //mysql연결을 해제합니다.
			
			return false; //false를 반환합니다.
		}catch(Exception e){ 
			e.printStackTrace(); //오류 발생시 e.printStackTrace 메서드를 실행합니다.
			return false;
		}
	}
	public School_member getMember(String id_number,String password){ //빈즈 클래스의 getMember메서드를 생성하고 id_number와 password 값을 받습니다.
		connect(); //mysql을 연결합니다.
		String sql="select * from member where id_number=? and password=?"; //member테이블의 id_number와 password 모든 값을 조회합니다.
		ResultSet rs=null; //조회 결과를 반환하기 위한 ResultSet의 변수 rs에 null값을 넣어줍니다.
		School_member sm = new School_member(); //빈즈 클래스의 sm객체를 생성합니다
		
		try{
			pstmt=con.prepareStatement(sql); 
			pstmt.setString(1, id_number);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			//pstmt에 sql을 연결하고 1,2에 해당하는 값들을 넣어줍니다. select문을 사용하였으므로 euecuteQuery를 사용합니다.
			
			while(rs.next()) { // rs.next() 메서드로 다음 데이터를 확인합니다.
				sm.setSchool(rs.getString("school")); //sm객체에 setSchool을 사용해 school값을 저장합니다.
				sm.setId_number(rs.getString("id_number")); //sm객체의 setId_number을 사용해 id_number값을 저장합니다.
				sm.setName(rs.getString("name")); //sm객체의 setName을 사용해 name값을 저장합니다.
			}
					
			
			rs.close(); // ResultSet객체의  close() 메서드를 이용해 리소스를 반환합니다.
			disconnect(); //mysql연결을 해제합니다.
			
			return sm; //sm객체에 저장된 값들을 반환합니다.
		}catch(Exception e){
			e.printStackTrace(); //오류 발생시 e.printStackTrace 메서드를 실행합니다.
			return null; //null값을 반환합니다.
		}
	}
}