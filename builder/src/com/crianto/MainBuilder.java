package com.crianto;

import com.crianto.builder.PedidoBuilder;
import com.crianto.domainsempadrao.Pedido;

import java.math.BigDecimal;

public class MainBuilder {

    public static void main(String[] args) {

/*
        Cliente cliente = new Cliente();
        cliente.setCodigo(100);
        cliente.setNome("Carlos");
        cliente.setTelefone("(16)99874-5632");

        Vendedor vendedor = new Vendedor();
        vendedor.setCodigo(1);
        vendedor.setNome("Pedro");

        Produto produto1 = new Produto();
        produto1.setNome("Caderno");
        produto1.setQuantidade(1);
        produto1.setValor(new BigDecimal("10.00"));

        Produto produto2 = new Produto();
        produto2.setNome("Lápis");
        produto2.setQuantidade(2);
        produto2.setValor(new BigDecimal("2.00"));

        Produto produto3 = new Produto();
        produto3.setNome("Borracha");
        produto3.setQuantidade(4);
        produto3.setValor(new BigDecimal("1.00"));

        Pedido pedido = new Pedido();
        pedido.setNumeroPedido("0001");
        pedido.setCliente(cliente);
        pedido.setVendedor(vendedor);
        pedido.setProdutos(new ArrayList<>());
        pedido.getProdutos().add(produto1);
        pedido.getProdutos().add(produto2);
        pedido.getProdutos().add(produto3);

        pedido.informacoes();
*/

        /*
         * O Builder vai nos ajudar na criação de objetos complexos.. no exemplo acima, ficou muito sujo o código, houve
         * muito acoplamento e ainda se eu quiser adicionar mais um produto, teria de repetir mais uma vez a criação do
         * produto e a adição do mesmo no pedido.
         * Depois de refatorado e utilizado o padrão Builder, note que aléd do acoplamento que existia dentro dessa classe
         * passar a existir dentro do Builder e não mais nessa, o código ficou também mais limpo e enxuto.
         */

        Pedido pedido = new PedidoBuilder()
                .setPedido("0002")
                .setCliente(13, "Carlos Alberto", "(16)99563-5478")
                .setVendedor(4, "Paulo")
                .setProduto("Caderno", 1, new BigDecimal("10.00"))
                .setProduto("Lápis", 6, new BigDecimal("2.10"))
                .setProduto("Borracha", 3, new BigDecimal("1.50"))
                .builder();

        pedido.informacoes();
    }
}
