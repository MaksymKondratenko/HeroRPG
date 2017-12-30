package com.mk.herorpg.DAO;

import com.mk.herorpg.hero.Action;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;
public class HibernateConnector {
    @Getter @Setter
    private SessionFactory sessionFactory;

        public void initConnection() {

            final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure() // configures settings from hibernate.cfg.xml
                    .build();
            try {
                sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
            }
            catch (Exception e) {

                StandardServiceRegistryBuilder.destroy( registry );
            }
        }

        public void closeConnection() {
            if ( sessionFactory != null ) {
                sessionFactory.close();
            }
        }

        @SuppressWarnings("unchecked")
        public void write(Action action) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(new PersistentAction(action));
            session.getTransaction().commit();
            session.close();
        }

        public List<Action> read() {

            Session session = sessionFactory.openSession();
            session.beginTransaction();
            List<Action> result = (List<Action>)session.createQuery( "from PersistentAction" ).list();
            session.getTransaction().commit();
            session.close();
            return result;
        }

}

