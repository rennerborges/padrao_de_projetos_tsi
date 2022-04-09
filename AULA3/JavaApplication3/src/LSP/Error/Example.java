/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LSP.Error;

/**
 *
 * @author renner
 */
public class Example {
    A example1 = new A();
    B example2 = new B();
    
    public String imprimirNome(A object){
        return object.getNome();
    }
    
    public void run(){
        System.out.println(imprimirNome(example1));
        System.out.println(imprimirNome(example2));
    }
    
    
}
