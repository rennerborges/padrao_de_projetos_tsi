/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

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

        PasswordChain passwordChain = new IsLogin(IDStagePassword.STAGE1, "Verificar se o usuário está logado");
        passwordChain.setNext(new AlreadyCaracterMaiusculo(IDStagePassword.STAGE2, "Se a senha tem um caractere em maiúsculo"));
        passwordChain.setNext(new AlreadyCaracterMinusculo(IDStagePassword.STAGE3, "Se a senha possui um caractere em minúsculo"));

        try {
            passwordChain.verifyPassword("123");
        } catch (Exception e) {
            System.out.println("Erro: "  + e.getMessage());
        }
    }

}
