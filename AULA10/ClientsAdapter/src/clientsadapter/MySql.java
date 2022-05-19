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
public class MySql {
    private String nome = "MySql";
    private boolean isMultipleUsers = true;
    private boolean isMultipleTransactions = true;
    private ArrayList<String> users = new ArrayList<>();

    public MySql() {
        users.add("Renner");
        users.add("Washignton");
        users.add("Livia");
        users.add("Ana Clara");
        users.add("Gisele");        
    }
    
    public ArrayList<String> getUsers(){
        return users;
    }

    public String getNome() {
        return nome;
    }

    public boolean isMultipleUsers() {
        return isMultipleUsers;
    }

    public boolean isMultipleTransactions() {
        return isMultipleTransactions;
    }
    
}
