/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import clientsadapter.BancoDados;

/**
 *
 * @author renner
 */
public class User {
    private String nome;
    private String tipo;
    private BancoDados bancoDados;

    public User(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
   
    protected void setBancoDados(BancoDados banco){
        this.bancoDados = banco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public BancoDados getBancoDados(){
        return this.bancoDados;
    }
    
}
