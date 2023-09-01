import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.elly.web.Member;

public class JpaMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		logic(em);
		tx.commit();

		em.close();
		emf.close();
	}

	private static void logic(EntityManager em) {
		
		
		Member member = new Member();
		member.setMid("elly1");
		member.setMname("즨이");
		member.setMpw("1234");
		
		em.persist(member);
		
		System.out.println(member);
		
	}
}
