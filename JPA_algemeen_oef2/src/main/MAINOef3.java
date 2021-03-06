package main;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import domein.Campus;
import domein.Docent;
import domein.Werkruimte;
import util.JPAUtil;

public class MAINOef3 {
	public static void main(String[] args) {
		Docent a  = new Docent(123, "Jan", "Baard", new BigDecimal(8000));
		Docent b  = new Docent(456, "Piet", "Baard", new BigDecimal(10000));
		Docent c  = new Docent(789, "Joris", "ZonderBaard", new BigDecimal(12000));
		Campus gent = new Campus("Gent");
		Campus aalst = new Campus("Aalst");
		Werkruimte r1 = new Werkruimte("SCH123", "zolder", 12, 6);
		Werkruimte r2 = new Werkruimte("SCH555", "kelder", 4, 4);
		Werkruimte r3 = new Werkruimte("AA222", "dak", 10, 2);
		
		EntityManager entitmanger = JPAUtil.getEntityManagerFactory().createEntityManager();
		entitmanger.getTransaction().begin();
		entitmanger.persist(a);
		entitmanger.persist(b);
		entitmanger.persist(c);
		entitmanger.persist(gent);
		entitmanger.persist(aalst);
		entitmanger.persist(r1);
		entitmanger.persist(r2);
		entitmanger.persist(r3);
		entitmanger.getTransaction().commit();
		entitmanger.close();
		JPAUtil.getEntityManagerFactory().close();
		

	}

}