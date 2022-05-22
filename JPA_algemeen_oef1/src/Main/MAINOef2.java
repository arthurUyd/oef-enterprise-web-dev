package Main;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import domein.Docent;
import util.JPAUtil;

public class MAINOef2 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		
		Docent d = em.find(Docent.class, 2L);
		if(d != null) {
			d.opslag(new BigDecimal(200));
		}else {
			System.out.println("Docent 2 is niet gevonden.");
		}
		
		em.getTransaction().commit();
		em.close();
		JPAUtil.getEntityManagerFactory().close();
		
	}
}
