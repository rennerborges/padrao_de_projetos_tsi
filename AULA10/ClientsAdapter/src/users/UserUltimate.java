/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import clientsadapter.AdapterMySqlBd;
import clientsadapter.BancoDados;

/**
 *
 * @author renner
 */
public class UserUltimate extends User {
    private  BancoDados bancoDados = new AdapterMySqlBd();
    
    public UserUltimate(String nome) {
       super(nome, "Ultimate");
       super.setBancoDados(bancoDados);
    }
    
}
