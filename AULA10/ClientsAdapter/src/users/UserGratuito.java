/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import clientsadapter.AdapterParadoxBd;
import clientsadapter.BancoDados;

/**
 *
 * @author renner
 */
public class UserGratuito extends User {
    private  BancoDados bancoDados = new AdapterParadoxBd();
    
    public UserGratuito(String nome) {
       super(nome, "Gratuito");
       super.setBancoDados(bancoDados);
    }
    
}
