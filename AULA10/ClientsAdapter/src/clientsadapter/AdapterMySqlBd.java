/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientsadapter;

import java.util.ArrayList;

/**
 *
 * @author renner
 */
public class AdapterMySqlBd extends BancoDados {
    private MySql mysql = new MySql();

    public AdapterMySqlBd() {
        this.nome = mysql.getNome();
    }
    
    @Override
    public boolean isMultipleUser(){
        return mysql.isMultipleUsers();
    }
    
    @Override
    public boolean isMultipleTransaction(){
        return mysql.isMultipleTransactions();
    }
    
    @Override
    public ArrayList<String> getUsers(){
        return mysql.getUsers();
    }
}
