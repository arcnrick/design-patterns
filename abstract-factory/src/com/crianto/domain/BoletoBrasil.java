package com.crianto.domain;

import com.crianto.interfaces.Boleto;

public class BoletoBrasil implements Boleto {

    @Override
    public void emitir(Produto produto, double imposto) {
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("BRASIL");
        System.out.println("*****************************************************************");
        System.out.println("Descrição: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor: R$ " + produto.getValorUnitario());
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Valor Total: R$ " + produto.getValorTotal(imposto));
    }
}
