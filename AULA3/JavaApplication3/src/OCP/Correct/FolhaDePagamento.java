/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.Correct;

/**
 *
 * @author renner
 */
public class FolhaDePagamento {
    private double saldo;
    
    public void calcular(Remuneravel funcionario){
        this.saldo = funcionario.remuneracao();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
