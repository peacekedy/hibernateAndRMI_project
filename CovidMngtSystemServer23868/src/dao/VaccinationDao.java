/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Vaccination;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author IT MODERN
 */
public class VaccinationDao {
    
      public String registerVaccination(Vaccination vaccination){
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.save(vaccination);
        tr.commit();
        ss.close();
        
        return "Data saved succefully";
    
    }
    
     public String updateVaccination(Vaccination vaccination){
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.update(vaccination);
        tr.commit();
        ss.close();
        
        return "Data updated succefully";
    
    }
    
      public String deleteVaccination(Vaccination vaccination){
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.delete(vaccination);
        tr.commit();
        ss.close();
        
        return "Data deleted succefully";
    
    }
      
      public List<Vaccination> allvaccination(){
      
          Session ss=HibernateUtil.getSessionFactory().openSession();
          List<Vaccination> vaccinationList= ss.createQuery("select vac from Vaccination vac").list();
          ss.close();
          return vaccinationList;
      }
      
      public Vaccination getVaccinationById(Vaccination vaccination){
      
          Session ss=HibernateUtil.getSessionFactory().openSession();
          Vaccination vac=(Vaccination)ss.get(Vaccination.class, vaccination.getId());
          ss.close();
          return vac;
      }
    
}
