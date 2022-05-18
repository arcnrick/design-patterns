package com.crianto;

import com.crianto.controller.Controlador;
import com.crianto.model.Modelo;
import com.crianto.view.Visao;

public class MainMVC {

    public static void main(String[] args) {

        /*
         * No exemplo abaixo de MVC conseguimos notar que toda parte de cálculo que é feita pela camada com.crianto.model, não pode
         * ser vista pela camada com.crianto.view e o inverso também ocorre, ou seja, tudo que é feito na camada com.crianto.view, não pode ser
         * visto pela com.crianto.model... quem faz o envio e recebimento entre as informações que trafegam nessas duas camadas, é a
         * camada com.crianto.controller.
         * Esse modelo é amplamente conhecido como um separador de responsabilidades e também de um facilitador na
         * montagem dos pacotes.
         */

        Visao visao = new Visao();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(visao, modelo);

        visao.setVisible(true);
    }
}
