/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Vaccination;

/**
 *
 * @author IT MODERN
 */
public interface VaccinationSrvcInterface  extends Remote{
    
    public String registerVaccination(Vaccination vaccination) throws RemoteException;
    public String updateVaccination(Vaccination vaccination) throws RemoteException;
    public String deleteVaccination(Vaccination vaccination) throws RemoteException;
     public List<Vaccination> allvaccination() throws RemoteException;
     public Vaccination getVaccinationById(Vaccination vaccination) throws RemoteException;
}
