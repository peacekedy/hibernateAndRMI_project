/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Implementation;

import dao.CitizenDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Citizen;
import services.CitizenSrvcInterface;

/**
 *
 * @author IT MODERN
 */
public class CitizenImplementation extends UnicastRemoteObject implements CitizenSrvcInterface{
 
    public CitizenImplementation() throws RemoteException{
      super();
    }
      public CitizenDao dao=new CitizenDao();
    @Override
    public String registerCitizen(Citizen citizen) throws RuntimeException {
        return dao.registerCitizen(citizen);
    }

    @Override
    public String updateCitizen(Citizen citizen) throws RemoteException {
        return dao.updateCitizen(citizen);
    }

    @Override
    public String deleteCitizen(Citizen citizen) throws RemoteException {
     return dao.deleteCitizen(citizen);
    }

    @Override
    public List<Citizen> allcitizen() throws RemoteException {
    
        return dao.allcitizen();
        }

    @Override
    public Citizen getCitizenById(Citizen citizen) throws RemoteException {
       
      return dao.getCitizenById(citizen);
    }
    
    
}
