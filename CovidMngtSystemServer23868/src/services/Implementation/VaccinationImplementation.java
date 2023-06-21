/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Implementation;

import dao.VaccinationDao;
import java.rmi.RemoteException;
import java.util.List;
import model.Vaccination;
import services.VaccinationSrvcInterface;

/**
 *
 * @author IT MODERN
 */
public class VaccinationImplementation implements VaccinationSrvcInterface{
 
     public  VaccinationDao dao= new VaccinationDao();
    @Override
    public String registerVaccination(Vaccination vaccination) throws RemoteException {
      return dao.registerVaccination(vaccination);
    }

    @Override
    public String updateVaccination(Vaccination vaccination) throws RemoteException {
       return dao.updateVaccination(vaccination);
    }

    @Override
    public String deleteVaccination(Vaccination vaccination) throws RemoteException {
      return dao.deleteVaccination(vaccination);
    }

    @Override
    public List<Vaccination> allvaccination() throws RemoteException {
       return dao.allvaccination();
     }

    @Override
    public Vaccination getVaccinationById(Vaccination vaccination) throws RemoteException {
       return dao.getVaccinationById(vaccination);
    }
    
    
}
