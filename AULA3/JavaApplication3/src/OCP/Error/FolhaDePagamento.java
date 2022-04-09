/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.Error;


/**
 *
 * @author renner
 */
public class FolhaDePagamento {
    private double saldo;
    
    public void calcular(Object funcionario){
        if(getObjectName(funcionario).equals("ContratoClt")){
            ContratoClt clt = (ContratoClt) funcionario;
            this.saldo = clt.salario();
        }
        
        if(getObjectName(funcionario).equals("Estagio")){
            Estagio est = (Estagio) funcionario;
            this.saldo = est.bolsaAuxilio();
        }
    }

    private String getObjectName(Object o){
        return o.getClass().getSimpleName(); 
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
