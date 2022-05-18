package com.crianto.adapter;

public class CotacaoAdapter extends Cotacao {

    @Override
    public double getValor() {
        return (super.getValor() * 3.00);
    }

    @Override
    public void setValor(double valor) {
        super.setValor(valor / 3.00);
    }

    public double getValorDolar() {
        return super.getValor();
    }
}
