package embeddedIdTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OrderDetPK obj = new OrderDetPK();
		obj.setGroupID(1);
		obj.setOrderID(10);
		
		EmpDetails emp= new EmpDetails();
		emp.setOrder(obj);
		emp.setDescription("test desc 12");
		emp.setQuantity(100);
		emp.setRate(20.5);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
			session.save(emp);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
