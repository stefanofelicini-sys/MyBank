package main;

import Classi.ContoCorrente;
import Classi.ContoRisparmio;

public class Polimorfismo {
    public static void main(String[] args) {
        ContoCorrente[] conti = new ContoCorrente[5];
        conti[0] = new ContoCorrente("Mario Rossi", "EEE44606");
        conti[1] = new ContoCorrente("Roberto Verdi", "DDD55707");
        conti[2] = new ContoRisparmio("Andrea Dell'Acqua", "CCC66808",100.0,3.0);
        conti[3] = new ContoRisparmio("Luigi Verdi", "FFSSPP99007",200.0,7.0);
        conti[4] = new ContoCorrente("Massimo Greco", "AAA88190");

        if(conti[2] instanceof ContoRisparmio){
            ((ContoRisparmio)conti[2]).applicaInteressi();
        }

        for (int i = 0; i < conti.length; i++) {
            conti[i].mostraDati();
            System.out.println("Saldo totale: " + conti[i].getSaldo());
            System.out.println("------");
        }
    }
}
