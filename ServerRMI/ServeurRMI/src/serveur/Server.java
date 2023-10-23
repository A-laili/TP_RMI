/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import dao.IDao;
import Entities.Machine;
import Entities.Salle;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import service.SalleService;

/**
 *
 * @author Asmaa
 */
public class Server {
    public static void main(String[] args) {
        try {
            IDao<Machine> dao = new MachineService();
            LocateRegistry.createRegistry(1000);
            Naming.bind("rmi://localhost:1000/dao", dao);
            
            IDao<Salle> dao2 = new SalleService();
            Naming.bind("rmi://localhost:1000/dao2", dao2);
            
            System.out.println("en attente des clients");
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

