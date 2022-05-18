package com.crianto;

import com.crianto.state.Mario;
import com.crianto.state.State;

public class MainState {

    public static void main(String[] args) {

        State mario = new Mario();

        mario = mario.pegarCogumelo();
        mario = mario.pegarFlorDeFogo();
        mario = mario.pegarCogumelo();

        mario = mario.colidirComInimigo();
        mario = mario.colidirComInimigo();
        mario = mario.colidirComInimigo();

        System.out.println("Estado: " + mario.retornarTipo());
    }
}