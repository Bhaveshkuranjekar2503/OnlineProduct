package DAO;
import java.sql.*;

import Beans.CustomerBean;
//import DBInfo.DBConnection;
public class CustomerDAO 
{
	public CustomerBean custValid(String userName,String passWord)
	{
		CustomerBean cb=null;
		Connection con =DBConnection1.getConnection();
		try (con){
			PreparedStatement ps=con.prepareStatement("select * from CUSTOMER55 where USERNAME=? and PASSWORD=?");
			ps.setString(1, userName);
			ps.setString(2, passWord);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				cb=new CustomerBean();
				cb.setUserName(rs.getString(1));
				cb.setPassWord(rs.getString(2));
				cb.setFirstName(rs.getString(3));
				cb.setLastName(rs.getString(4));
				cb.setEmail(rs.getString(5));
				cb.setMobile(rs.getLong(6));
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return cb;
	}

}
