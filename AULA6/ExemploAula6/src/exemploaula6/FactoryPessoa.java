/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploaula6;

/**
 *
 * @author renner
 */
public class FactoryPessoa implements IFactoryPessoa{
    @Override
    public Pessoa getPessoa(String nome, String sexo){
        if(sexo.equals("m")){
            return new Homem(nome);
        }else
            return new Mulher(nome);
    }
}
