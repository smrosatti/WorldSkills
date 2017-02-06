/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ConnectionFactory.Hibernate;
import Model.Model;
import Model.Charity;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author samuel
 */
public class ModelDao <M extends Model>{
    Hibernate connection = new Hibernate();
    Session sessao;
    
    public ModelDao(){
        sessao = connection.getConnection().openSession();
    }
        public boolean add(M m){
        Transaction tx = sessao.beginTransaction();
        sessao.save(m);
        tx.commit();
        sessao.close();
        return true;
    }
    
    public boolean update(M m){
        Transaction tx = sessao.beginTransaction();
        sessao.update(m);
        tx.commit();
        sessao.close();
        return true;
    }
    
    public boolean remove(M m){
        Transaction tx = sessao.beginTransaction();
        sessao.delete(m);
        tx.commit();
        sessao.close();
        return true;
    }
    
        public <T extends Model> List<T> getList(String a){
        Transaction tx = sessao.beginTransaction();
        Query consult = sessao.createQuery("from "+a);
        List<T> lista = consult.list();
        tx.commit();
        sessao.close();
        return lista;
    }
}
        