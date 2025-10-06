/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Clientes;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u06716483144
 */
public class ClientesDAO extends AbstractDAO{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction();        
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.delete(object);
        session.getTransaction();  
    }

    @Override
    public Object list(int id) {
       session.beginTransaction();
       Criteria criteria = session.createCriteria((Clientes.class));
       criteria.add(Restrictions.eq("idusarios", id));
       session.getTransaction(); 
       List lista = criteria.list();
       session.getTransaction().commit();
       return lista; 
    }

    @Override
    public Object listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
