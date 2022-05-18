package com.crianto.state;

public interface State {

    public State pegarCogumelo();

    public State pegarEstrela();

    public State pegarFlorDeFogo();

    public State colidirComInimigo();

    public String retornarTipo();
}
