/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jordan
 */
public class CliImpl extends UnicastRemoteObject implements InterfaceCli {
    
    InterfaceServ interfaceServ;

    public CliImpl(InterfaceServ interfaceServ) throws RemoteException {
        this.interfaceServ = interfaceServ;
    }
    
    public void chamarServidor()
    {
        try {
            interfaceServ.chamar("Teste", this);
        } catch (RemoteException ex) {
            System.err.println(ex.toString());
            Logger.getLogger(CliImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void echo(String str) throws RemoteException{
        System.out.println(str);
    }
    
}
