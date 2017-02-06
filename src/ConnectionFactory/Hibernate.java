/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionFactory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Samuel
 */
public class Hibernate {
    
    public SessionFactory connection = getConnection();
    
    public SessionFactory getConnection(){
        Configuration cfg = new Configuration().configure();
        StandardServiceRegistryBuilder build = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
        SessionFactory sessao = cfg.buildSessionFactory(build.build());
        return sessao;
    }
    
}