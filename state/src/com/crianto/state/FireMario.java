package com.crianto.state;

public class FireMario implements State {

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
        System.out.println("Pegou uma flor: continua com poderes de atirar fogo");
        return this;
    }

    @Override
    public State colidirComInimigo() {
        System.out.println("Colidiu com inimigo: perdeu os poderes de atirar fogo");
        return new SuperMario();
    }

    @Override
    public String retornarTipo() {
        return "Fire Mário";
    }
}
