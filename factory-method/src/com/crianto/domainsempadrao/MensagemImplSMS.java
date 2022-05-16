package com.crianto.domainsempadrao;

import javax.swing.*;

public class MensagemImplSMS implements Mensagem {

    @Override
    public void enviar(String texto) {
        JOptionPane.showMessageDialog(null, "SMS: " + texto);
    }
}
