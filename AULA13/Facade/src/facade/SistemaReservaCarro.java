/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author renner
 */
public class SistemaReservaCarro {

    public void carrosDisponiveis() {
        System.out.println("\n1- Polo R$: 600");
        System.out.println("2- Kwid R$: 450");
        System.out.println("3- Jetta R$: 1200");
        System.out.println("4- Pajero R$: 1500");
    }

    public double getValor(String carro) {
        double valor = 0;

        switch (carro) {
            case "1":
                valor = 600;
                break;
            case "2":
                valor = 450;
                break;
            case "3":
                valor = 1200;
                break;
            case "4":
                valor = 1500;
                break;
            default:
                throw new AssertionError();
        }

        return valor;
    }
}
