package school;

import java.sql.*;

public class DBConnection {
	private static final String JDBC_DRIVER = "org.gjt.mm.mysql.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/webdb";
	private static final String USER = "root";
	private static final String PASSWD = "1116";
	
	private Connection con = null;
	private PreparedStatement pstmt = null;
	
	public DBConnection(){
		try{
			Class.forName(JDBC_DRIVER);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void connect(){
		try{
			con = DriverManager.getConnection(JDBC_URL, USER, PASSWD);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void disconnect(){
		if(pstmt!=null){
			try{
				pstmt.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		if(con!=null){
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public boolean insertMember(School_member member){
		boolean success = false;
		connect();
		String sql = "insert into member values(?,?, ?, ?)";
		try{
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getSchool());
			pstmt.setString(2, member.getId_number());
	        pstmt.setString(3, member.getPassword());
	        pstmt.setString(4, member.getName());
			pstmt.executeUpdate();
			success = true;
			disconnect();
			return success;
		}catch(SQLException e){
			e.printStackTrace();
			return success;
		}

	}
	
	
}
