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
public class AlreadyLowerCharacter extends PasswordChain {

    public AlreadyLowerCharacter(IDStagePassword id, String description) {
        super(id, description);
    }
    
    @Override
    public boolean isValidPassword(String password){
        return isLowerCharacterPresent(password);
    }
    
    private boolean isLowerCharacterPresent(String str)
    {
        
        String regex = "^(?=.*[a-z]).+$";
 
        Pattern p = Pattern.compile(regex);
 
        if (str == null) {
            return false;
        }
 
        Matcher m = p.matcher(str);

        return m.matches();
    }
}
