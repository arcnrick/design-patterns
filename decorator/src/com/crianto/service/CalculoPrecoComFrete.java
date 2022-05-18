package com.crianto.service;

import com.crianto.dominio.Produto;

import java.math.BigDecimal;

public class CalculoPrecoComFrete implements CalculoPreco {

    private CalculoPreco calculo;

    // tem de ter um objeto da interface no construtor
    public CalculoPrecoComFrete(CalculoPreco calculo) {
        this.calculo = calculo;
    }

    @Override
    public BigDecimal valorFinal(Produto produto) {

        // tem de chamar esse método da interface, do contrário não faria sentido o uso do Decorator
        BigDecimal valorFinal = calculo.valorFinal(produto);

        BigDecimal frete;

        if (produto.getQuantidade() > 3) {
            frete = new BigDecimal("11.00");
            valorFinal = valorFinal.add(frete);

            return valorFinal;
        } else {
            frete = new BigDecimal("17.00");
            valorFinal = valorFinal.add(frete);

            return valorFinal;
        }
    }
}
