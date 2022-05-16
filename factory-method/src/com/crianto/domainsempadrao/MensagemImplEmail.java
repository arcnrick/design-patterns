package com.crianto.domainsempadrao;

import javax.swing.*;

public class MensagemImplEmail implements Mensagem {

    @Override
    public void enviar(String texto) {
        JOptionPane.showMessageDialog(null, "Email: " + texto);
    }
}
