package com.crianto.domainsempadrao;

public class BoletoSemPadrao {

    private String banco;

    public BoletoSemPadrao(String banco) {
        this.banco = banco;
    }

    public void emitir(ProdutoSemPadrao produtoSemPadrao, double imposto) {

        if (banco.equalsIgnoreCase("brasil")) {
            brasil(produtoSemPadrao, imposto);
        } else if (banco.equalsIgnoreCase("bradesco")) {
            bradesco(produtoSemPadrao, imposto);
        } else if (banco.equalsIgnoreCase("bmg")) {
            bmg(produtoSemPadrao, imposto);
        } else {
            caixa(produtoSemPadrao, imposto);
        }
    }

    private void bradesco(ProdutoSemPadrao produtoSemPadrao, double imposto) {
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("BRADESCO");
        System.out.println("*****************************************************************");
        System.out.println("Descrição: " + produtoSemPadrao.getNome());
        System.out.println("Quantidade: " + produtoSemPadrao.getQuantidade());
        System.out.println("Valor: R$ " + produtoSemPadrao.getValorUnitario());
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Valor Total: R$ " + produtoSemPadrao.getValorTotal(imposto));
    }

    private void brasil(ProdutoSemPadrao produtoSemPadrao, double imposto) {
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("BRASIL");
        System.out.println("*****************************************************************");
        System.out.println("Descrição: " + produtoSemPadrao.getNome());
        System.out.println("Quantidade: " + produtoSemPadrao.getQuantidade());
        System.out.println("Valor: R$ " + produtoSemPadrao.getValorUnitario());
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Valor Total: R$ " + produtoSemPadrao.getValorTotal(imposto));
    }

    private void bmg(ProdutoSemPadrao produtoSemPadrao, double imposto) {
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("BMG");
        System.out.println("*****************************************************************");
        System.out.println("Descrição: " + produtoSemPadrao.getNome());
        System.out.println("Quantidade: " + produtoSemPadrao.getQuantidade());
        System.out.println("Valor: R$ " + produtoSemPadrao.getValorUnitario());
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Valor Total: R$ " + produtoSemPadrao.getValorTotal(imposto));
    }

    private void caixa(ProdutoSemPadrao produtoSemPadrao, double imposto) {
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("CAIXA ECONÔMICA FEDERAL");
        System.out.println("*****************************************************************");
        System.out.println("Descrição: " + produtoSemPadrao.getNome());
        System.out.println("Quantidade: " + produtoSemPadrao.getQuantidade());
        System.out.println("Valor: R$ " + produtoSemPadrao.getValorUnitario());
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Valor Total: R$ " + produtoSemPadrao.getValorTotal(imposto));
    }

}
