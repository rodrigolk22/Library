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
    public Livro consulta = null;
    public List consultaLista = null;
    public String mensagem = null;
    public List mensagens = null;

    public CliImpl(InterfaceServ interfaceServ) throws RemoteException {
        this.interfaceServ = interfaceServ;
    }
    
    public List consultarTodosLivros() throws RemoteException
    {
        
        consultaLista = interfaceServ.consultarTodosLivros();
        System.out.println(consultaLista);
        return consultaLista;
    }
    
    public Livro consultarLivro(int id) throws RemoteException
    {
        
        consulta = interfaceServ.consultarLivro(1);
        System.out.println(consulta);
        return consulta;
    }
    public void emprestarLivro(int id, String nome) throws RemoteException{
        mensagem = interfaceServ.emprestarLivro(id, nome);
        System.out.println(mensagem);
    }
            
            
    public void notificacao(String mensagem) throws RemoteException {
        mensagens.add(mensagem);
        System.out.println(mensagem);
    }
    
}
