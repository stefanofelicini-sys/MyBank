package main;

import Classi.ContoCorrente;

public class Archivio {
    public static void main(String[] args) {
        ContoCorrente[] conti = new ContoCorrente[5];
        conti[0] = new ContoCorrente("Mario Rossi", "EEE44606");
        conti[1] = new ContoCorrente("Roberto Verdi", "DDD55707");
        conti[2] = new ContoCorrente("Andrea Dell'Acqua", "CCC66808");
        conti[3] = new ContoCorrente("Luigi Suigo", "BBB77909");
        conti[4] = new ContoCorrente("Massimo Greco", "AAA88190");
        for (int i = 0; i < conti.length; i++) {
            conti[i].mostraDati();
            System.out.println("Saldo totale: " + conti[i].getSaldo());
        }
    }
}
