/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author renner
 */
public class SistemaPagamento {

    public void realizarPagamentoCartao(double valor, String cartao, String cvv, int parcelas) {
        System.out.println("Pagamento de R$:" + valor + " realizado com o cartão de crédito " + cartao + " em " + parcelas + "x parcelas"
        );
    }

    public void realizarPagamentoDinheiro(double valor) {
        System.out.println("Pagamento de R$:" + valor + " realizado no dinheiro");
    }

    public void realizarPagamentoPix(double valor, String chave) {
        System.out.println("Pagamento de R$:" + valor + " realizado pela chave pix " + chave);
    }
}
