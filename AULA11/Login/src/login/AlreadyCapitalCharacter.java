/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;
import java.util.regex.*;
/**
 *
 * @author renner
 */

public class AlreadyCapitalCharacter extends PasswordChain {

    public AlreadyCapitalCharacter(IDStagePassword id, String description) {
        super(id, description);
    }
    
    @Override
    public boolean isValidPassword(String password){
        return isCapitalCharacterPresent(password);
    }
    
    private boolean isCapitalCharacterPresent(String str)
    {
        
        String regex = "^(?=.*[A-Z]).+$";
 
        Pattern p = Pattern.compile(regex);
 
        if (str == null) {
            return false;
        }
 
        Matcher m = p.matcher(str);

        return m.matches();
    }
}
