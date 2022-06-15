/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);

        System.out.println("Sua assinatura foi realizada com sucesso!");
        
        Assinatura assinaturaBase = new AssinaturaBase();
        
        Assinatura assinatura = assinaturaBase;
        boolean stopWhile = false;

        do {
            System.out.println("----------------------------");
            System.out.println("1- " + Pacote1.DESCRICAO);
            System.out.println("2- " + Pacote2.DESCRICAO);
            System.out.println("3- " + Pacote3.DESCRICAO);
            System.out.println("4- " + Pacote4.DESCRICAO);
            System.out.println("5- " + Pacote5.DESCRICAO);
            System.out.println("6- Nenhum pacote");
            System.out.println("Escolha o pacote (OPCIONAL):");
            String pacote = scan.nextLine().toLowerCase();

            switch (pacote) {
                case "1":
                    assinatura = new Pacote1(assinatura);
                    break;
                case "2":
                    assinatura = new Pacote2(assinatura);
                    break;
                case "3":
                    assinatura = new Pacote3(assinatura);
                    break;
                case "4":
                    assinatura = new Pacote4(assinatura);
                    break;
                case "5":
                    assinatura = new Pacote5(assinatura);
                    break;
                default:
                    stopWhile = true;
            }
            
            System.out.println("\n");

        } while (!stopWhile);
        
        System.out.println("Sua compra:");
        assinatura.montar();
        
    }

}
