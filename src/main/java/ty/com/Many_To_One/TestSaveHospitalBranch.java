package ty.com.Many_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitalBranch {
	public static void main(String[] args) {
		

	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Branch branch1=new  Branch();
	branch1.setName("Hassan");
	branch1.setState("Karnataka");
	branch1.setCountry("India");
	branch1.setPhone(9859859654l);
	
	
	Branch branch2=new Branch();
	branch2.setName("ChannarayaPatna");
	branch2.setState("Karnataka");
	branch2.setCountry("India");
	branch2.setPhone(8746852892l);
	
	Branch branch3=new Branch();
	branch3.setName("Hyderbad");
	branch3.setState("AndraPradesh");
	branch3.setPhone(7465965958l);
	
	Hospital hospital=new Hospital();
	hospital.setName("Rajiv Hospital");
	hospital.setWebsite("www.rajivhospital.com");
	
	branch1.setHospital(hospital);
	branch2.setHospital(hospital);
	branch3.setHospital(hospital);
	
	entityTransaction.begin();
	entityManager.persist(hospital);
	entityManager.persist(branch1);
	entityManager.persist(branch3);
	entityTransaction.commit();
	System.out.println("Added");
	}

}
