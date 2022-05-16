package com.crianto.domainsempadrao;

public class VendaSemPadrao {

    public VendaSemPadrao(ProdutoSemPadrao produtoSemPadrao, BoletoSemPadrao boletoSemPadrao, NFESemPadrao notaFiscal) {
        System.out.println("Criou a venda com base nos parâmetros informados: produto, boleto e notafiscal");
    }

    public void realizarVenda() {
        System.out.println("Realizou a venda e emitiu a nota fiscal...");
    }
}
