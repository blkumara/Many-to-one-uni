package ty.com.Many_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetItemAmazonOrder {
	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Item item=entityManager.find(Item.class, 1);		
		
		System.out.println("Item Id:"+item.getId());
		System.out.println("Item Name:"+item.getName());
		System.out.println("Item Price:"+item.getPrice());
		System.out.println("Item Quantity:"+item.getQuantity());
		System.out.println("*****************");
		
		AmazonOrder amazonOrder=item.getAmazonOrder();
		System.out.println("AmazonOrder Id Is:"+amazonOrder.getId());
		System.out.println("AmzonOrder name Is:"+amazonOrder.getName());
		System.out.println("AmazonOrder Adress:"+amazonOrder.getAddress());
		System.out.println("AmazonOrder status:"+amazonOrder.getStatus());
		
		
	}

}
