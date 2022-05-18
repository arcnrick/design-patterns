package com.crianto.factory;

import com.crianto.domainsempadrao.Mensagem;
import com.crianto.domainsempadrao.MensagemImplEmail;
import com.crianto.domainsempadrao.MensagemImplSMS;

public class MensagemFactory {

    public static Mensagem getMessage(int i) {
        if (i == 1) {
            return new MensagemImplSMS();
        } else if (i == 2) {
            return new MensagemImplEmail();
        } else {
            System.out.println("Escolha um tipo de envio válido");
            return null;
        }
    }
}
