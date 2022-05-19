/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import clientsadapter.AdapterFirebirdBd;
import clientsadapter.BancoDados;

/**
 *
 * @author renner
 */
public class UserBasico extends User {
    private  BancoDados bancoDados = new AdapterFirebirdBd();
    
    public UserBasico(String nome) {
       super(nome, "Básico");
       super.setBancoDados(bancoDados);
    }
    
}
