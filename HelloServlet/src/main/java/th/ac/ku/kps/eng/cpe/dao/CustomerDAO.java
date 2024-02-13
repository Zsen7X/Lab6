package th.ac.ku.kps.eng.cpe.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.TransactionException;

import th.ac.ku.kps.eng.cpe.entity.Customer;
import th.ac.ku.kps.eng.cpe.entity.Phonenumber;
import util.SessionUtil;

public class CustomerDAO {
	public ArrayList<Customer> getAllCustomers() {
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Customer");
		ArrayList<Customer> customers = (ArrayList<Customer>) query.list();
		session.close();
		return customers;
	}

	public boolean addCustomer(Customer c) {
		try {
			Session session = SessionUtil.getSession();
			Transaction tx = session.beginTransaction();
			tx.begin();
			session.save(c);
			tx.commit();
			session.close();
		} catch (TransactionException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static void main(String[] args) throws SQLException {
		CustomerDAO c = new CustomerDAO();
		c.addCustomer(new Customer("S1", new HashSet<Phonenumber>()));
		for (Customer cs : c.getAllCustomers())
			System.out.println(cs.getName());
	}


}
