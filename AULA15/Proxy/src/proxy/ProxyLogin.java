/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy;

/**
 *
 * @author renner
 */
public class ProxyLogin implements Login {

    private RealLogin realLogin;

    public ProxyLogin() {
    }

    @Override
    public boolean login(String usuario, String password) {
        RealLogin instance = getOrcreateRealLogin();

        return instance.login(usuario, password);
    }

    @Override
    public void logout() {
        RealLogin instance = getOrcreateRealLogin();

        instance.logout();

    }

    private RealLogin getOrcreateRealLogin() {
        if (this.realLogin == null) {
            this.realLogin = new RealLogin();
        }

        return this.realLogin;
    }
}
