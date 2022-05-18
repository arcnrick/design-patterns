package com.crianto.facade;

import com.crianto.componentes.CPU;
import com.crianto.componentes.HD;
import com.crianto.componentes.Memoria;
import com.crianto.componentes.SO;
import com.crianto.factory.Acessorios;

public class ComputerFacade {

    private HD hd;
    private CPU cpu;
    private Memoria memoria;
    private Acessorios acessorios;
    private SO so;

    public ComputerFacade() {
        this.hd = new HD();
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.acessorios = new Acessorios();
        this.so = new SO();
    }

    public void montarComputador() {
        System.out.println("Iniciando montagem\n");

        hd.adicionarHD();
        cpu.adicionaProcessador();
        memoria.adicionarMemoria();
        acessorios.adicionarMonitor();
        acessorios.adicionarMouse();
        acessorios.adicionarTeclado();
        so.instalarSO();

        System.out.println("\nMontagem finalizada");
    }
}
