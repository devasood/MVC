import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Mine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setName("Saurabh");
		
		Configuration configuration=new Configuration();
		configuration.setProperty("hibernate.connection.driver_class","org.postgresql.Driver");		
		configuration.setProperty("hibernate.connection.url","jdbc:postgresql://localhost/postgres");
		configuration.setProperty("hibernate.connection.username","postgres");
		configuration.setProperty("hibernate.connection.password","sandbox");
		configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		configuration.setProperty("connection.pool_size","1");
		configuration.setProperty("cache.provider_class","org.hibernate.cache.NoCacheProvider");
        configuration.setProperty("show_sql","true");
        configuration.setProperty("hibernate.hbm2ddl.auto","update");        
		
		
		SessionFactory sessionFactory=configuration.configure()
				.buildSessionFactory(new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build());
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	
	}

}
