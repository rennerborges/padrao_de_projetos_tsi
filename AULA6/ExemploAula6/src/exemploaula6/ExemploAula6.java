/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploaula6;

/**
 *
 * @author renner
 */
public class ExemploAula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IFactoryPessoa factory = new FactoryPessoa();
        
        String nome = "Jose";
        String sexo = "m";
      
        factory.getPessoa(nome, sexo);
        
        nome = "Maria";
        sexo = "f";
      
        factory.getPessoa(nome, sexo);
    }
    
}
