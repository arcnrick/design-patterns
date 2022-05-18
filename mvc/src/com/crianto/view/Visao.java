package com.crianto.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Visao extends JFrame {

    private JTextField numero1 = new JTextField(3);
    private JTextField numero2 = new JTextField(3);
    private JTextField resultado = new JTextField(6);

    private JButton botao = new JButton("Somar");

    public Visao() {

        JPanel painel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 100);

        painel.add(numero1);
        painel.add(numero2);
        painel.add(botao);
        painel.add(resultado);

        this.add(painel);
    }

    public int getPrimeiroNumero() {
        return Integer.parseInt(numero1.getText());
    }

    public int getSegundoNumero() {
        return Integer.parseInt(numero2.getText());
    }

    public int getResultado() {
        return Integer.parseInt(resultado.getText());
    }

    public void setResultado(int valor) {
        resultado.setText(Integer.toString(valor));
    }

    public void adicionaListener(ActionListener listener) {
        botao.addActionListener(listener);
    }

    public void mensagemErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}