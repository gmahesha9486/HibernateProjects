package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Employee emp = new Employee();
			
			emp.setName("Mahesh");
			emp.setDesignation("Developer");
			
			Address address = new Address();
			
			address.setHouseNo("4359");
			address.setStreet("62nd cross");
			address.setCity("k s layout");
			address.setState("Karnataka");
			emp.setAddress(address);
			
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			
			session.beginTransaction();
				session.save(emp);
			session.getTransaction().commit();
			session.close();
			
	}

}
