package com.crianto.state;

public class Mario implements State {

    @Override
    public State pegarCogumelo() {
        System.out.println("Pegou um cogumelo: tornou-se Super Mário");
        return new SuperMario();
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
        System.out.println("Colidiu com inimigo: Mário morreu");
        return new MarioMorto();
    }

    @Override
    public String retornarTipo() {
        return "Mário comum";
    }
}
