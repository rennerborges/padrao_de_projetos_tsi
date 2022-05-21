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
        passwordChain.setNext(new AlreadyCapitalCharacter(IDStagePassword.STAGE2, "Se a senha tem um caractere em maiúsculo"));
        passwordChain.setNext(new AlreadyLowerCharacter(IDStagePassword.STAGE3, "Se a senha possui um caractere em minúsculo"));
        passwordChain.setNext(new AlreadySpecialCharacter(IDStagePassword.STAGE4, "Se a senha possui pelo menos um dos caractere especial (Ex.: @, #, $, %, &, *)"));
        passwordChain.setNext(new AlreadyNumberCharacter(IDStagePassword.STAGE5, "Se a senha possui um número"));

        try {
            passwordChain.verifyPassword("123mR*");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
