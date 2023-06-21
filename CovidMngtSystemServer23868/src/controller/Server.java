/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.Implementation.CitizenImplementation;

/**
 *
 * @author IT MODERN
 */
public class Server{
    
    private CitizenImplementation citimpl;
    
    public Server() throws RemoteException{
     this.citimpl= new CitizenImplementation();
    }
    
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry registry= LocateRegistry.createRegistry(8000);
            registry.rebind("citizen",  new Server().citimpl);
            System.out.println("the server is running on the port 8000");
        } catch (RemoteException ex) {
           ex.printStackTrace();
        }
    }
    
}
