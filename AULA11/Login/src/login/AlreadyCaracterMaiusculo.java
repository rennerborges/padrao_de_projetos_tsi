/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author renner
 */
public class AlreadyCaracterMaiusculo extends PasswordChain {

    public AlreadyCaracterMaiusculo(IDStagePassword id, String description) {
        super(id, description);
    }
    
    @Override
    public boolean isValidPassword(String password){
        return true;
    }
}
