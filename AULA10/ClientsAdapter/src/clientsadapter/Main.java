/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientsadapter;

import javax.swing.JOptionPane;
import users.User;
import users.UserBasico;
import users.UserGratuito;
import users.UserUltimate;

/**
 *
 * @author renner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome = JOptionPane.showInputDialog("Informe o nome do usuário:");

        String typeUser = JOptionPane.showInputDialog("Informe o tipo de usuário: 1) Gratuito 2) Basico 3) Ultimate");
        
        User usuario;
        
        switch (typeUser) {
            case "1":
                usuario = new UserGratuito(nome);
                break;
            case "2":
                usuario = new UserBasico(nome);            
                break;
            case "3":
                usuario = new UserUltimate(nome);                
                break;
            default:
                throw new AssertionError();
        }
        
        BancoDados bancoDados = usuario.getBancoDados();
        
        System.out.println("Nome usuário: " + usuario.getNome());
        System.out.println("Tipo usuário: " + usuario.getTipo());
        
        System.out.println("\n--- Banco info ---: ");
        
        System.out.println("Tipo usuário: " + bancoDados.nome);
        System.out.println("Multiplos usuários: " + bancoDados.isMultipleUser());
        System.out.println("Multiplas transações: " + bancoDados.isMultipleTransaction());
        System.out.println("Usuários: " + bancoDados.getUsers());

    }
    
}
