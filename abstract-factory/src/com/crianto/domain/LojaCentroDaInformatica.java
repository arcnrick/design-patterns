package com.crianto.domain;

import com.crianto.interfaces.Boleto;
import com.crianto.interfaces.NFE;
import com.crianto.interfaces.VendaFactory;

public class LojaCentroDaInformatica implements VendaFactory {

    @Override
    public NFE criarNFE() {
        NFE notaFiscal = new NFESaoPaulo();

        return notaFiscal;
    }

    @Override
    public Boleto criarBoleto() {
        Boleto boleto = new BoletoBrasil();

        return boleto;
    }
}
