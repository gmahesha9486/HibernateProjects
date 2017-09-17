package associationTest.oneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MCategory category = new MCategory();
		category.setCategoryName("Mobile phone");
		
		
		MProduct product1 = new MProduct();
		product1.setProductName("samsung");
		product1.setCategory(category);
		 
		
		MProduct product2 = new MProduct();
		product2.setProductName("Apple");
		product2.setCategory(category);
		
		Set<MProduct> products = new HashSet<>();
		products.add(product1);
		products.add(product2);
		category.setProduct(products);
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
			session.save(category);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
