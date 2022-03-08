package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Exemplo {
    public static void main(String[] args) throws Exception {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.getCurrentSession();

        Produto p1 = new Produto();
        p1.setNome("p1");
        session.beginTransaction();
        session.save(p1);
        System.out.println(p1.getId());

        Produto p2 = new Produto();
        p2.setNome("p2");
        session.save(p2);
        session.getTransaction().commit();

        System.out.println(p2.getId());

    }
}
