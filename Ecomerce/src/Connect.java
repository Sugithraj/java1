import java.sql.*;
public class Connect {
     
	public static void main (String[]args)throws Exception{
		getdata();  //insertdata
	}
	
	public static void getdata() throws  Exception {
		String url="jdbc:mysql://127.0.0.1:3306/Customer";
		String username="root";
		String password="pass1234";
		String Query="select * from details";//insert into details values(?,?,?)
		Connection con=DriverManager.getConnection(url, username, password);
		Statement pst=con.createStatement(); //Prepared //con.prepareStatement		
		ResultSet rst=pst.executeQuery(Query);
		while(rst.next()) {
			System.out.println("user id: "+rst.getInt(1));
			System.out.println("user name: "+rst.getString(2));
			System.out.println("user mailid: "+rst.getString(3));	
		}
		con.close();
			
	}
}