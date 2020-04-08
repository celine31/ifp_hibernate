import org.hibernate.exception.GenericJDBCException;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

class HibernateTest {
@Test
  void testok(){

  try {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("derby-persistence-unit");

    EntityManager em = emf.createEntityManager();
    System.out.println("ok");
  }catch(GenericJDBCException e ){
    System.out.println("erreur JDBC");
  }
}
}
