package com.crianto;

import com.crianto.domain.LojaCentroDaInformatica;
import com.crianto.domain.Produto;
import com.crianto.domain.Venda;
import com.crianto.interfaces.VendaFactory;

import java.math.BigDecimal;

public class MainAbstractFactory {

    public static void main(String[] args) {
/*
        ProdutoSemPadrao produtoSemPadrao = new ProdutoSemPadrao();
        produtoSemPadrao.setNome("Smartphone Moto X");
        produtoSemPadrao.setQuantidade(1);
        produtoSemPadrao.setValorUnitario(new BigDecimal(1000));

        NFESemPadrao notaFiscal = new NFESemPadrao("MG");
        BoletoSemPadrao boletoSemPadrao = new BoletoSemPadrao("brasil");

        double imposto = notaFiscal.calcularImposto();

        VendaSemPadrao vendaSemPadrao = new VendaSemPadrao(produtoSemPadrao, boletoSemPadrao, notaFiscal);

        vendaSemPadrao.realizarVenda();

        boletoSemPadrao.emitir(produtoSemPadrao, imposto);
*/

        /*
         * Da forma que foi feito acima, além de criar uma série de acoplamentos, também tenho de instanciar os objetos
         * já especificando-os como objetos de Produto, NFE, Boleto e Venda, passando seus parâmetros para a criação dos
         * cálculos, regras etc.
         * Da forma abaixo, eu me preocupo em criar o objeto de produto e em seguida criar uma LojaCentroDaInformatica
         * que por dentro, implementa uma factory genérica... essa factory genérica por sua vez, faz uso de outras duas
         * interfaces que podem ser chamadas a qualquer momento sem ter de destacar a sua real implementação.
         * Note que a passagem de qual boleto utilizar e qual estado será usado para calcular o imposto está incluído
         * internamente na classe que for implementar a VendaFactory (que no caso é a LojaCentroDaInformatica).
         */

        Produto produto = new Produto();
        produto.setNome("Smartphone Moto X");
        produto.setQuantidade(1);
        produto.setValorUnitario(new BigDecimal(1000));

        VendaFactory factory = new LojaCentroDaInformatica();
        Venda venda = new Venda(factory);

        venda.realizarVenda(produto);
    }
}