package view;

import controller.ThreadLinuxPing;

public class Executar {
    public static void main(String[] args) {
        //COMMITAR FALANDO QUE FUNCIONA EM WINDOWS
        //DEPOIS ATUALIZAR PARA LINUX (COMO O EXERC�CIO PEDE DE FATO)

        Thread[] pings = new ThreadLinuxPing[3];

        pings[0] = new ThreadLinuxPing("www.google.com.br");
        pings[1] = new ThreadLinuxPing("www.uol.com.br");
        pings[2] = new ThreadLinuxPing("www.terra.com.br");

        for (Thread ping : pings) {
            ping.start();
        }
    }
}
