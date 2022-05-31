import ijseJDBCHibernate.entity.Customer;
import ijseJDBCHibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setId("C001");
        c1.setName("Kamal");
        c1.setSalary(30000);
        c1.setAddress("Panadura");

        Customer c2=new Customer();
        c1.setId("C002");
        c1.setName("Supun");
        c1.setSalary(20000);
        c1.setAddress("Colombo");

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(c1);
        transaction.commit();

        session.close();
    }
}
