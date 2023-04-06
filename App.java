// package Jan2023.jdbc;

import java.sql.*;

public class App {
    public static void main(String[] args) {
       try
		{
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//create connection
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/classwork?autoReconnect=true&useSSL=false","root","Akku25@05");

			Statement st=cn.createStatement();
			// execute query
			int x = st.executeUpdate("update emp set ename = 'Akanksha' where eno=102");
			// process each record one by on
			ResultSet rs=st.executeQuery("select * from emp");	
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}

			cn.close();
		}
		
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
catch(SQLException e){
System.out.println(e.getMessage());
}

    }
}


