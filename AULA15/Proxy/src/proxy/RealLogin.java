/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy;

/**
 *
 * @author renner
 */
public class RealLogin implements Login {

    private boolean isAuth;

    public RealLogin() {
        this.isAuth = false;
    }

    @Override
    public boolean login(String usuario, String password) {
        boolean isLogin = usuario.equals("Renner") && password.equals("12345678");

        this.isAuth = isLogin;
        
        return isLogin;
    }

    @Override
    public void logout() {
        this.isAuth = false;
    }
}
