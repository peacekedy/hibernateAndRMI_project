
package dao;

import java.util.List;
import model.Citizen;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author IT MODERN
 */
public class CitizenDao {
    
    public String registerCitizen(Citizen citizen){
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        citizen.setIs_vaccinated(false);
        ss.save(citizen);
        tr.commit();
        ss.close();
        
        return "Data saved succefully";
    
    }
    
     public String updateCitizen(Citizen citizen){
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.update(citizen);
        tr.commit();
        ss.close();
        
        return "Data updated succefully";
    
    }
    
      public String deleteCitizen(Citizen citizen){
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.delete(citizen);
        tr.commit();
        ss.close();
        
        return "Data deleted succefully";
    
    }
      
      public List<Citizen> allcitizen(){
      
          Session ss=HibernateUtil.getSessionFactory().openSession();
          List<Citizen> citizenList= ss.createQuery("select cit from Citizen cit").list();
          ss.close();
          return citizenList;
      }
      
      public Citizen getCitizenById(Citizen citizen){
      
          Session ss=HibernateUtil.getSessionFactory().openSession();
          Citizen cit=(Citizen)ss.get(Citizen.class, citizen.getCitizen_id());
          ss.close();
          return cit;
      }
}
