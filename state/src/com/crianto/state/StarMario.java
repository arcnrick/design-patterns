package com.crianto.state;

public class StarMario implements State {

    @Override
    public State pegarCogumelo() {
        System.out.println("Pegou um cogumelo: Mário ganhou 1000 pontos e continua invencível");
        return this;
    }

    @Override
    public State pegarEstrela() {
        System.out.println("Pegou uma estrela: tornou-se Mário continua invencível");
        return this;
    }

    @Override
    public State pegarFlorDeFogo() {
        System.out.println("Pegou uma flor: continua invencível");
        return this;
    }

    @Override
    public State colidirComInimigo() {
        System.out.println("Colidiu com inimigo: o inimigo morreu");
        return this;
    }

    @Override
    public String retornarTipo() {
        return "Mário Invencível";
    }
}
