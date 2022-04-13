/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;

import produtos.AoLeite;
import produtos.Oreo;
import produtos.OvoPascoa;
import produtos.SonhoValsa;

/**
 *
 * @author renner
 */
public class Lacta implements IFabricaOvosPascoa{

    @Override
    public OvoPascoa criarOvo(String cod){
        switch (cod) {
            case AoLeite.COD:
                return new AoLeite();
            case Oreo.COD:
                return new Oreo();
            case SonhoValsa.COD:
                return new SonhoValsa();
            default:
                throw new RuntimeException("Nenhum ovo da Lacta encontrado com o código: " + cod);
        }
    }
}
