/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author renner
 */
public class SistemaReservaAviao {

    public void horariosDisponiveis() {
        System.out.println("1- Gol 12:00h R$: 100");
        System.out.println("2- Latam 13:00h R$: 150");
        System.out.println("3- Azul 18:00h R$: 300");
        System.out.println("4- Gol 19:00h R$: 420");
    }

    public double getValor(int qtdPessoas, String horario) {
        double valor = 0;
        
        switch (horario) {
            case "1":
                valor = qtdPessoas * 100;
                break;
            case "2":
                valor = qtdPessoas * 150;
                break;
            case "3":
                valor = qtdPessoas * 300;
                break;
            case "4":
                valor = qtdPessoas * 420;
                break;
            default:
                throw new AssertionError();
        }
        
        return valor;
    }
}
