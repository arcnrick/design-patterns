package com.crianto.state;

public class SuperMario implements State {

    @Override
    public State pegarCogumelo() {
        System.out.println("Pegou um cogumelo: Mário ganhou 1000 pontos");
        return this;
    }

    @Override
    public State pegarEstrela() {
        System.out.println("Pegou uma estrela: tornou-se Mário invencível");
        return new StarMario();
    }

    @Override
    public State pegarFlorDeFogo() {
        System.out.println("Pegou uma flor: tornou-se Mário que atira fogo");
        return new FireMario();
    }

    @Override
    public State colidirComInimigo() {
        System.out.println("Colidiu com inimigo: Mário volta a ser o Mario baixinho");
        return new Mario();
    }

    @Override
    public String retornarTipo() {
        return "Super Mário";
    }
}
