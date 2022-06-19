/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import javax.swing.JOptionPane;

/**
 *
 * @author renner
 */
public class Facade {

    private double valor = 0;

    protected SistemaPagamento sistemaPagamento;
    protected SistemaReservaAviao sistemaReservaAviao;
    protected SistemaReservaCarro sistemaReservaCarro;
    protected SistemaReservaHospedagem sistemaReservaHospedagem;

    public Facade() {
        this.sistemaPagamento = new SistemaPagamento();
        this.sistemaReservaAviao = new SistemaReservaAviao();
        this.sistemaReservaCarro = new SistemaReservaCarro();
        this.sistemaReservaHospedagem = new SistemaReservaHospedagem();
    }

    public void gerenciarReservaHospedagem() {
        sistemaReservaHospedagem.diasDisponiveis();

        String hospedagem = JOptionPane.showInputDialog("Informe a hospedagem:");
        String qtdPessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");

        valor += sistemaReservaHospedagem.getValor(Integer.parseInt(qtdPessoas), hospedagem);
    }

    public void gerenciarReservaAviao() {
        sistemaReservaAviao.horariosDisponiveis();

        String horario = JOptionPane.showInputDialog("Informe o horário:");
        String qtdPessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");

        valor += sistemaReservaAviao.getValor(Integer.parseInt(qtdPessoas), horario);
    }

    public void gerenciarReservaCarro() {
        sistemaReservaCarro.carrosDisponiveis();

        String carro = JOptionPane.showInputDialog("Informe o carro:");

        valor += sistemaReservaCarro.getValor(carro);

    }

    public void gerenciarPagamento() {
        sistemaReservaCarro.carrosDisponiveis();

        String formaPagamento = JOptionPane.showInputDialog("Informe o a forma de pagamento: 1- Cartão, 2- Dinheiro e 3 - Pix");

        switch (formaPagamento) {
            case "1":
                String cartao = JOptionPane.showInputDialog("Informe o cartão:");
                String cvv = JOptionPane.showInputDialog("Informe o CVV:");
                String parcelas = JOptionPane.showInputDialog("Informe as quantidade de parcelas:");

                sistemaPagamento.realizarPagamentoCartao(valor, cartao, cvv, Integer.parseInt(parcelas));
                break;
            case "2":
                sistemaPagamento.realizarPagamentoDinheiro(valor);
                break;
            case "3":
                sistemaPagamento.realizarPagamentoPix(valor, "00.619.535/0001-45");

                break;
            default:
                throw new AssertionError();
        }

    }
}
