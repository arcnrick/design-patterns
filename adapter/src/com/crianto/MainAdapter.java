package com.crianto;

import com.crianto.adapter.CotacaoAdapter;

public class MainAdapter {

    public static void main(String[] args) {

        CotacaoAdapter cotacaoAdapter = new CotacaoAdapter();
        cotacaoAdapter.setValor(15.00);

        System.out.println("R$ " + cotacaoAdapter.getValor());
        System.out.println(" $ " + cotacaoAdapter.getValorDolar());
    }
}
