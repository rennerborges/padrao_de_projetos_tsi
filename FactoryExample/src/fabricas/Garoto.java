/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;

import produtos.Baton;
import produtos.Crocante;
import produtos.OvoPascoa;
import produtos.Talento;

/**
 *
 * @author renner
 */
public class Garoto implements IFabricaOvosPascoa {
    @Override
    public OvoPascoa criarOvo(String cod){
        switch (cod) {
            case Crocante.COD:
                return new Crocante();
            case Talento.COD:
                return new Talento();
            case Baton.COD:
                return new Baton();
            default:
                throw new RuntimeException("Nenhum ovo da Garoto encontrado com o código: " + cod);
        }
    }
}
