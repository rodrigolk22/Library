/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import Biblioteca.Interfaces.InterfaceServ;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;

/**
 *
 * @author Rodrigo e Jordan
 */
public class Cliente {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        
        InterfaceServ interfaceServ;
        
        try {
            // encontra a referencia da interface do servidor em seu serviço de nomes
            Registry referenciaServicoNomes = LocateRegistry.getRegistry(9000);
            interfaceServ = (InterfaceServ) referenciaServicoNomes.lookup("Servidor_Biblioteca");
            
            // instancia a implementação do cliente para enviar a sua referencia em chamadas remotas ao servidor
            CliImpl cliImpl = new CliImpl();
            
            // inicia a GUI
            // TODO: iniciar a GUI
            
        } catch (RemoteException | NotBoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
