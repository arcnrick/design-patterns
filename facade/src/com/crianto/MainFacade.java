package com.crianto;

import com.crianto.facade.ComputerFacade;

public class MainFacade {

    public static void main(String[] args) {

/*
        HD hd = new HD();
        hd.adicionarHD();

        CPU cpu = new CPU();
        cpu.adicionaProcessador();

        Memoria memoria = new Memoria();
        memoria.adicionarMemoria();

        Acessorios acessorios = new Acessorios();
        acessorios.adicionarMonitor();
        acessorios.adicionarMouse();
        acessorios.adicionarTeclado();

        SO so = new SO();
        so.instalarSO();
*/

        /*
         * Note que da forma que ficou ali acima, essa classe aqui está fazendo ligação com diversas outras classes pelo
         * sistema, o que além de ser um código feito, gera muito acoplamento e se precisar alterar uma dessas classes
         * que está sendo utilizado ali, tem de sair alterando em diversos locais do sistema que estiverm fazendo uso das
         * mesmas.
         * Veja abaixo que se fizer uso de uma facade, toda a responsabilidade de acoplamento e futuras alterações para
         * adaptar às novas classes quando alteradas, passa a ser da mesma... fora que essa classe aqui nem vai saber o
         * que está rolando por baixo dos panos ali da facade criada
         */

        ComputerFacade facade = new ComputerFacade();
        facade.montarComputador();
    }
}
