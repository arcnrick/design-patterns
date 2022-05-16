package com.crianto.builder;

import com.crianto.domainsempadrao.Cliente;
import com.crianto.domainsempadrao.Pedido;
import com.crianto.domainsempadrao.Produto;
import com.crianto.domainsempadrao.Vendedor;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoBuilder {

    private Pedido instancia;

    public PedidoBuilder() {
        this.instancia = new Pedido();
    }

    public PedidoBuilder setPedido(String numero) {
        instancia.setNumeroPedido(numero);

        return this;
    }

    public PedidoBuilder setCliente(int codigo, String nome, String telefone) {
        Cliente cliente = new Cliente();
        cliente.setCodigo(codigo);
        cliente.setNome(nome);
        cliente.setTelefone(telefone);

        instancia.setCliente(cliente);

        return this;
    }

    public PedidoBuilder setVendedor(int codigo, String nome) {
        Vendedor vendedor = new Vendedor();
        vendedor.setCodigo(codigo);
        vendedor.setNome(nome);

        instancia.setVendedor(vendedor);

        return this;
    }

    public PedidoBuilder setProduto(String nome, int quantidade, BigDecimal valor) {

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setValor(valor);

        if (instancia.getProdutos() == null) {
            instancia.setProdutos(new ArrayList<>());
        }

        instancia.getProdutos().add(produto);

        return this;
    }

    public Pedido builder() {
        return instancia;
    }
}