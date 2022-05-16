package com.crianto.domainsempadrao;

public class GerenciadorImpressao {

    private static GerenciadorImpressao gerenciadorImpressao;

//    public GerenciadorImpressao() {
//    }

    private GerenciadorImpressao() {
    }

    public static GerenciadorImpressao getInstance() {
        if (gerenciadorImpressao == null) {
            gerenciadorImpressao = new GerenciadorImpressao();
        }

        return gerenciadorImpressao;
    }
}
