/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonlogin;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author renner
 */
public class Login {
    
    private static Login instance;
    private static boolean isLogin = false;
    
    private Login(){}
    
    public static synchronized Login getInstance(){
        if(instance == null){
            instance = new Login();
        }
        
        return instance;
    }
    
    public void logar(){
        
        if(isLogin){
            throw new RuntimeException("Já existe um login ativo no momento");

        }
        
        String user = JOptionPane.showInputDialog("Informe o usuário:");

        String password = JOptionPane.showInputDialog("Informe a senha:");
        
        if(!user.equals("renner") || !password.equals("12345678")){
            throw new RuntimeException("Usuário/Senha inválidos");
        }
        
        String captha;
        String useCaptha;
        
        do {
            captha = this.generateCaptha();
            useCaptha = JOptionPane.showInputDialog("Escreva o captha: " + captha);
        }while(!captha.equals(useCaptha));
        
        System.out.println("Logado com sucesso!");
        isLogin = true;
        
    }
    
    public static boolean getStatus(){
        return isLogin;
    }
    
    public static void deslogar(){
        isLogin = false;
    }
    
    private String generateCaptha(){
        Random random = new Random();
        
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@!#$%&+=";
        
        String captha = "";
        
        for(int i = 0; i < 6; i++){
            captha += String.valueOf(caracteres.charAt(random.nextInt(caracteres.length())));        
        }
        
        return captha;
    }
}
