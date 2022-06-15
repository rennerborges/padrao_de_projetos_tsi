/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxy;

import javax.swing.JOptionPane;

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

        Login instance = new ProxyLogin();

        String usuario = JOptionPane.showInputDialog("Informe o usuário:");
        String password = JOptionPane.showInputDialog("Informe a senha:");
        
        if(instance.login(usuario, password)){
            System.out.println("Logado com sucesso!");
        }else{
            System.out.println("Usuário ou senha incorretos");
        }

    }

}
