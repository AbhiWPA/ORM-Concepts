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
        c2.setId("C002");
        c2.setName("Supun");
        c2.setSalary(20000);
        c2.setAddress("Colombo");

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        //for save
        //session.save(c2);

        //for Update
        /*c1.setAddress("Galle");
        session.update(c1);

        c2.setSalary(45000);
        session.update(c2);*/

        //for get one customer
        /*Customer c3 = session.get(Customer.class, "C001");
        System.out.println(c1);
        System.out.println(c3.getId());
        System.out.println(c3.getName());
        System.out.println(c3.getAddress());
        System.out.println(c3.getSalary());*/

        //for delete customer
        Customer c3 = new Customer();
            //catch the object first
            c3.setId("C001");
            //delete
            session.delete(c3);

        transaction.commit();

        session.close();
    }
}
