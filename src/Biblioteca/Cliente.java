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
            
            /** -----------------------------------------------------
             * teste dos métodos remotos (TODO: remover depois)
             ------------------------------------------------------*/            
            
            // consultar todos os livros
            System.out.println(interfaceServ.consultarTodosLivros());
            
            // consultar um livro
            System.out.println(interfaceServ.consultarLivro(2));
            
            // realizar empréstimo
            //System.out.println(interfaceServ.emprestarLivro(1, "carlinhos99"));
            System.out.println(interfaceServ.emprestarLivro(3, "carlinhos99"));
            System.out.println(interfaceServ.emprestarLivro(3, "carlinhos99"));
            System.out.println(interfaceServ.emprestarLivro(5, "carlinhos99"));
            // realizar reserva
            System.out.println(interfaceServ.reservarLivro(5, "mustafa", cliImpl, 5));
            // realizar devolução
            System.out.println(interfaceServ.devolverLivro(5));
            
            
            
            // inicia a GUI
            // TODO: iniciar a GUI
            
        } catch (RemoteException | NotBoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
