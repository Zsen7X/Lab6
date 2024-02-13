package test;

import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import th.ac.ku.kps.eng.cpe.dao.CustomerDAO;
import util.SessionUtil;

public class Main2 {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	SessionUtil.getSession() ;		
	
	CustomerDAO c = new CustomerDAO() ;
	c.getAllCustomers();
	System.out.println(c.getAllCustomers().size());
	
	}
}
