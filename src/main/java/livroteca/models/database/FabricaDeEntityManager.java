package livroteca.models.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaDeEntityManager {
	
	private static final EntityManagerFactory fabrica = Persistence
					.createEntityManagerFactory("livroteca");
	
	public static EntityManager getEntityManager() {
		
		EntityManager em = fabrica.createEntityManager();
		
		return em;
		
	}
	
	
}
