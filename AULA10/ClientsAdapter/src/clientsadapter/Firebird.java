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
public class Firebird {
    private String nome = "Firebird";
    private boolean isMultipleUsers = true;
    private int qtdTransaction = 1;
    private ArrayList<String> users = new ArrayList<>();

    public Firebird() {
        users.add("Fernando");
        users.add("Daniel");
    }
    
    public ArrayList<String> getUsers(){
        return users;
    }

    public String getNome() {
        return nome;
    }

    public boolean multipleUsers() {
        return isMultipleUsers;
    }

    public int getQtdTransaction() {
        return qtdTransaction;
    }
    
}
