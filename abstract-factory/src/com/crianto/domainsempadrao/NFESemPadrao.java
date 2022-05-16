package com.crianto.domainsempadrao;

public class NFESemPadrao {

    private String uf;

    public NFESemPadrao(String uf) {
        this.uf = uf;
    }

    public double calcularImposto() {

        if (uf.equalsIgnoreCase("MG")) {
            return 18;
        } else if (uf.equalsIgnoreCase("RJ")) {
            return 20;
        } else {
            return 12;
        }
    }
}