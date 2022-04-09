/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LSP.Error;

/**
 *
 * @author renner
 */
public class B extends A{
    
    @Override
    public String getNome(){
        if(randomInt(100) <= 50){
            throw new RuntimeException();
        }
        return null;
    };
    
    private int randomInt (int max){
        return 0 + (int)(Math.random() * ((max - 0) + 1));
    }
}
