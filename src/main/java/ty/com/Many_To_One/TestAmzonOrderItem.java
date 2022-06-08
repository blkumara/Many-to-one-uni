package ty.com.Many_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestAmzonOrderItem {
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Item item1=new Item();
		item1.setName("Shoes");
		item1.setPrice(2000);
		item1.setQuantity(1);
		
		Item item2=new Item();
		item2.setName("cloth");
		item2.setPrice(3000);
		item2.setQuantity(2);
		
		Item item3=new Item();
		item3.setName("watch");
		item3.setPrice(1500);
		item3.setQuantity(1);
		
		AmazonOrder amazonOrder=new AmazonOrder();
		amazonOrder.setAddress("Bangalore");
		amazonOrder.setName("PersonalItem");
		amazonOrder.setStatus("Items Add To Kart");
		
		item1.setAmazonOrder(amazonOrder);
		item2.setAmazonOrder(amazonOrder);
		item3.setAmazonOrder(amazonOrder);
		
		entityTransaction.begin();
		entityManager.persist(amazonOrder);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		entityTransaction.commit();
		
		System.out.println("Added");
	}

}
