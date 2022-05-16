package com.crianto;

import com.crianto.domainsempadrao.GerenciadorImpressao;

public class MainSingleton {

    public static void main(String[] args) {

/*
        GerenciadorImpressao g1 = new GerenciadorImpressao();
        GerenciadorImpressao g2 = new GerenciadorImpressao();
        GerenciadorImpressao g3 = new GerenciadorImpressao();
        GerenciadorImpressao g4 = new GerenciadorImpressao();
*/

        /*
         * No caso acima, a cada new GerenciadorImpressao() que é feito, é criada uma nova instancia da classe, daí trocamos para
         * que seja pega sempre a instancia já criada.. se entrar no getInstance(), verá que tem tratativa para ver se a propriedade
         * stática e privada "gerenciadorImpressao" já foi inicializada ou não... se ainda não foi, é instanciada somente uma vez.
         * Outra coisa é o método construtor da GerenciadorImpressao() que no caso do singleton, passa a ser privado.
         */

        GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g3 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g4 = GerenciadorImpressao.getInstance();

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
    }
}
