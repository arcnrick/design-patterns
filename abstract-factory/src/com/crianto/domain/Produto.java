package com.crianto.domain;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private int quantidade;
    private BigDecimal valorUnitario;

    public double getValorTotal(double imposto) {

        BigDecimal valorTotal = valorUnitario.add(new BigDecimal(imposto));
        valorTotal = valorTotal.multiply(new BigDecimal(quantidade));

        return valorTotal.doubleValue();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
