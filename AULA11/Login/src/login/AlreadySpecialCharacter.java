/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author renner
 */
public class AlreadySpecialCharacter extends PasswordChain {

    public AlreadySpecialCharacter(IDStagePassword id, String description) {
        super(id, description);
    }
    
    @Override
    public boolean isValidPassword(String password){
        return isSpecialCharacterPresent(password);
    }
    
    private boolean isSpecialCharacterPresent(String str)
    {
        
        String regex = "^(?=.*[@#$%&*]).+$";
 
        Pattern p = Pattern.compile(regex);
 
        if (str == null) {
            return false;
        }
 
        Matcher m = p.matcher(str);

        return m.matches();
    }
}
