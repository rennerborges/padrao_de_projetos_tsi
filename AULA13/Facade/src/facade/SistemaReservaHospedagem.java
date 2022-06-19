/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author renner
 */
public class SistemaReservaHospedagem {

    public void diasDisponiveis() {
        System.out.println("1- Hotel Beira Lago R$: 200");
        System.out.println("2- Pousada instancia R$: 150");
        System.out.println("3- Hotel Pallace R$: 600");
        System.out.println("4- Hotel Hillary R$: 420");
    }

    public double getValor(int qtdPessoas, String horario) {
        double valor = 0;

        switch (horario) {
            case "1":
                valor = 200;
                break;
            case "2":
                valor = 150;
                break;
            case "3":
                valor = 600;
                break;
            case "4":
                valor = 420;
                break;
            default:
                throw new AssertionError();
        }

        return valor;
    }
}
