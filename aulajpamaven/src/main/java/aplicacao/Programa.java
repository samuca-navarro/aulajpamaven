package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
//		Pessoa p1 = new Pessoa(null, "Maria da Silva", "maria@gmail.com");
//		Pessoa p2 = new Pessoa(null, "Cristina da Silva", "cristina@gmail.com");
//		Pessoa p3 = new Pessoa(null, "Cibele da Silva", "cibele@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		Pessoa p = em.find(Pessoa.class, 1);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("objeto " + p + " deletado");
				
		em.clear();
		emf.close();
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
		

	}

}
