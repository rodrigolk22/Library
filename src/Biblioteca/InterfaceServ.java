/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Rodrigo e Jordan
 */
public interface InterfaceServ extends Remote {
     public List consultarLivro(int livroId, InterfaceCli interfaceCli) throws RemoteException;
}
