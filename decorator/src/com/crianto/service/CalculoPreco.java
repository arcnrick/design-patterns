package com.crianto.service;

import com.crianto.dominio.Produto;

import java.math.BigDecimal;

public interface CalculoPreco {

    public BigDecimal valorFinal(Produto produto);
}
