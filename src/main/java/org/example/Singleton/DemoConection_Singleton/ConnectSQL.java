package org.example.Singleton.DemoConection_Singleton;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ConnectSQL {
    private static ConnectSQL instance;
    private SessionFactory factory;
    private ConnectSQL() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(registry)
                .addAnnotatedClass(User.class)
                .getMetadataBuilder().build();
        factory = metadata.getSessionFactoryBuilder().build();
    }
    public static ConnectSQL getInstance() {
        if(instance == null) {
            instance = new ConnectSQL();
        }
        return instance;
    }
    public SessionFactory getSessionFactory() {
        return factory;
    }
}
