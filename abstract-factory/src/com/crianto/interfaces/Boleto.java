package com.crianto.interfaces;

import com.crianto.domain.Produto;

public interface Boleto {

    public void emitir(Produto produto, double imposto);
}
