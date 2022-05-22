/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author renner
 */

public class Already8Character extends PasswordChain {

    public Already8Character(IDStagePassword id, String description) {
        super(id, description);
    }

    @Override
    public boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}
