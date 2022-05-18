package com.crianto.service;

import com.crianto.dominio.Produto;

import java.math.BigDecimal;

public class CalculoPrecoComum implements CalculoPreco {

    @Override
    public BigDecimal valorFinal(Produto produto) {

        BigDecimal imposto = new BigDecimal("0.10");
        BigDecimal valorFinalUnitario = produto.getValorUnitario().add(produto.getValorUnitario().multiply(imposto));
        BigDecimal valorTotal = valorFinalUnitario.multiply(BigDecimal.valueOf(produto.getQuantidade()));

        return valorTotal;
    }
}
