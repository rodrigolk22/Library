/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo e Jordan
 */
public class CliImpl extends UnicastRemoteObject implements InterfaceCli {
    
    InterfaceServ interfaceServ;
    public List consulta = null;

    public CliImpl(InterfaceServ interfaceServ) throws RemoteException {
        this.interfaceServ = interfaceServ;
    }
    
    public List consultarLivro(int id) throws RemoteException
    {
        
        consulta = interfaceServ.consultarLivro(1, this);
        System.out.println(consulta);
        return consulta;
    }
    
    public void exibir(int livroId) throws RemoteException {
        System.out.println(livroId);
    }
    
}
