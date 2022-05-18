package com.crianto;

import com.crianto.domainsempadrao.Mensagem;
import com.crianto.factory.MensagemFactory;

import javax.swing.*;

public class MainFactoryMethod {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null);
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(null));

/*
        if (tipo == 1) {
            Mensagem mensagem = new MensagemImplSMS();
        } else if (tipo == 2) {
            Mensagem mensagem = new MensagemImplEmail();
        } else {
            System.out.println("Escolha um tipo de envio válido");
        }
*/

        /*
         * Do jeito que fizemos acima, sempre que precisar incluir alguma regra p/ saber qual o tipo de mensagem que será enviado,
         * teremos de sair percorrendo o código para realizar a altearação e ainda por cima vai ter a necessidade de acoplamento
         * pesado, pois a cada novo tipo que vier de uma nova classe, teremos de fazer o import nessa classe aqui e nas outras que
         * utilizarão o recurso. Para resolver esse problema, criaremos uma factory que receberá além do texto, um parâmetro, que
         * pode ser um long, string, enum etc para indicar qual tipo de mensagem será utilizado na situação. Com isso, o acoplamento
         * que antes existia aqui com várias classes, passa a existir somente nessa factory criada.
         */

        Mensagem mensagem = MensagemFactory.getMessage(tipo);
        if (mensagem != null) {
            mensagem.enviar(texto);
        }
    }
}
