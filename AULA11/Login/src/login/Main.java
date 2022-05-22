/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

import javax.swing.JOptionPane;

/**
 *
 * @author renner
 */
public class Main {
    public static final String ANSI_RED_BACKGROUND = "\u001B[31m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[32m";

    /**
     * @param args the command line arguments
     */   
    
    public static void main(String[] args) {
        // TODO code application logic here

        PasswordChain passwordChain = new IsLogin(IDStagePassword.STAGE1, "Verificar se o usuário está logado");
        passwordChain.setNext(new AlreadyCapitalCharacter(IDStagePassword.STAGE2, "Se a senha tem um caractere em maiúsculo"));
        passwordChain.setNext(new AlreadyLowerCharacter(IDStagePassword.STAGE3, "Se a senha possui um caractere em minúsculo"));
        passwordChain.setNext(new AlreadySpecialCharacter(IDStagePassword.STAGE4, "Se a senha possui pelo menos um dos caractere especial (Ex.: @, #, $, %, &, *)"));
        passwordChain.setNext(new AlreadyNumberCharacter(IDStagePassword.STAGE5, "Se a senha possui um número"));
        passwordChain.setNext(new AlreadySequenceOfNumbers(IDStagePassword.STAGE6, "Se a senha não possui 3 números consecutivos na sequencia (Ex: Ab123)"));
        passwordChain.setNext(new Already8Character(IDStagePassword.STAGE7, "Se a senha tem pelo menos 8 caracteres"));
        passwordChain.setNext(new AlreadyLess16Character(IDStagePassword.STAGE8, "Se a senha não tem mais de 16 caracteres"));

        try {
            String password = JOptionPane.showInputDialog("Informe a senha:");
            passwordChain.verifyPassword(password);
            System.out.println(ANSI_GREEN_BACKGROUND+"A senha é valida");
        } catch (Exception e) {
            System.out.println(ANSI_RED_BACKGROUND+"Erro: " + e.getMessage());
        }
    }

}
