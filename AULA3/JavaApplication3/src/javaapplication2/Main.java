/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

//import SRP.Error.User;
import ISP.Correct.Papagaio;
import ISP.Error.Pinguim;
import SRP.Correct.User;
import SRP.Correct.UserRepository;
import SRP.Correct.UserViewer;


//import OCP.Error.FolhaDePagamento;
//import OCP.Error.ContratoClt;
import OCP.Correct.FolhaDePagamento;
import OCP.Correct.ContratoClt;


//import LSP.Error.Example;
import LSP.Correct.Example;


/**
 *
 * @author renner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//  Inicio SRP
        
//        User user = new User();
//        
//        user.addUser();
//        user.load();
//        user.printUser();

        
        User user = new User();
        UserRepository userRepository = new UserRepository();
        UserViewer userViewer = new UserViewer();
        
        user.addUser();
        userRepository.load();
        userViewer.printUser();

//  FIM SRP

//  Inicio OCP
        FolhaDePagamento folha = new FolhaDePagamento();
        ContratoClt clt = new ContratoClt();
//        
        folha.calcular(clt);
//        
        System.out.println(folha.getSaldo());

//  FIM OCP

//  Inicio LSP
        Example example = new Example();
        example.run();

//  FIM LSP

//  Inicio ISP
        Papagaio papagaio = new Papagaio();
        Pinguim pinguim = new Pinguim();

//  FIM ISP

    }
    
}
