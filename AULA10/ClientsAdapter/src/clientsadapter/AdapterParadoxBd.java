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
public class AdapterParadoxBd extends BancoDados {
    private Paradox paradox = new Paradox();

    public AdapterParadoxBd() {
        this.nome = paradox.getNome();
    }
    
    @Override
    public boolean isMultipleInstance(){
        return paradox.getQtdUser() == 1;
    }
    
    @Override
    public boolean isMultipleTransaction(){
        return paradox.getQtdTransaction() == 1;
    }
    
    @Override
    public ArrayList<String> getUsers(){
        ArrayList<String> users = new ArrayList<>();
        users.add(paradox.getUser());
        return users;
    }
}
