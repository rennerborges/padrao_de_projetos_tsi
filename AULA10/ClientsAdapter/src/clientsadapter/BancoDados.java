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
public abstract class BancoDados {
    protected String nome;
    
    public abstract boolean isMultipleInstance();
    public abstract boolean isMultipleTransaction();
    
//    public abstract ArrayList<String> getUsers();
//    public abstract ArrayList<String> getCompanies();

}
