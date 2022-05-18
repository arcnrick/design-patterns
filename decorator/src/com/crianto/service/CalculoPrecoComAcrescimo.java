package com.crianto.service;

import com.crianto.dominio.Produto;

import java.math.BigDecimal;

public class CalculoPrecoComAcrescimo implements CalculoPreco {

    private CalculoPreco calculo;

    // tem de ter um objeto da interface no construtor
    public CalculoPrecoComAcrescimo(CalculoPreco calculo) {
        this.calculo = calculo;
    }

    @Override
    public BigDecimal valorFinal(Produto produto) {

        // tem de chamar esse método da interface, do contrário não faria sentido o uso do Decorator
        BigDecimal valorFinal = calculo.valorFinal(produto);

        BigDecimal acrescimo = new BigDecimal("20.00");

        valorFinal = valorFinal.add(acrescimo);

        return valorFinal;
    }
}
