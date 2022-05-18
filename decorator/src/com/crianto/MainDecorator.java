package com.crianto;

import com.crianto.dominio.Produto;
import com.crianto.service.CalculoPreco;
import com.crianto.service.CalculoPrecoComAcrescimo;
import com.crianto.service.CalculoPrecoComFrete;
import com.crianto.service.CalculoPrecoComum;

import java.math.BigDecimal;

public class MainDecorator {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("CD Legião Urbana");
        produto.setQuantidade(3);
        produto.setValorUnitario(new BigDecimal("40.00"));

//        CalculoPreco calculo = new CalculoPrecoComum();

        /*
         * Da forma que estava ali acima não está errada, porém se quiser usar o decorator, terá de utilizar uma classe
         * que implemente a mesma classe que a CalculoPrecoComum está implementando e fazer nessa nova classe, a alteração
         * desejada no método que foi implementado... dentro dessa classe nova, vai ver que o cálculo feito pela classe
         * CalculoPrecoComum, vai ser utilizado... isso poderia ser copiado por várias e várias vezes, tipo, uma classe
         * usando o cálculo da sua anterior até que a lógica e fluxo fossem completados.
         */

//        CalculoPreco calculo = new CalculoPrecoComFrete(new CalculoPrecoComum());
//        CalculoPreco calculo = new CalculoPrecoComAcrescimo(new CalculoPrecoComum());
        CalculoPreco calculo = new CalculoPrecoComAcrescimo(new CalculoPrecoComFrete(new CalculoPrecoComum()));

        BigDecimal preco = calculo.valorFinal(produto);

        System.out.println("Valor final: R$ " + preco.doubleValue());
    }
}
