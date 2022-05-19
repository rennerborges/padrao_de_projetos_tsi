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
public class AdapterFirebirdBd extends BancoDados {
    private Firebird firebird = new Firebird();

    public AdapterFirebirdBd() {
        this.nome = firebird.getNome();
    }
    
    @Override
    public boolean isMultipleUser(){
        return firebird.multipleUsers();
    }
    
    @Override
    public boolean isMultipleTransaction(){
        return firebird.getQtdTransaction() != 1;
    }
    
    @Override
    public ArrayList<String> getUsers(){
        return firebird.getUsers();
    }
}
