/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.rmi.server.UnicastRemoteObject;
import Biblioteca.Interfaces.InterfaceCli;
import java.rmi.RemoteException;

/**
 * Implementação dos métodos remotos do cliente.
 * @author Rodrigo e Jordan
 */
public class CliImpl extends UnicastRemoteObject implements InterfaceCli {
    
    public CliImpl () throws RemoteException {}
    
    @Override
    public void exibir(int livroId) throws RemoteException {
        System.out.println(livroId);
    }
    
}
