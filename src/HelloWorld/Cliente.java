/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jordan
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceServ interfaceServ = null;
        try {
            Registry referenciaServicoNomes = LocateRegistry.getRegistry(9000);
            
            interfaceServ = (InterfaceServ) referenciaServicoNomes.lookup("ServidorHelloWorld");
            
            CliImpl cliImpl = new CliImpl(interfaceServ);
            
            cliImpl.chamarServidor();
            
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
