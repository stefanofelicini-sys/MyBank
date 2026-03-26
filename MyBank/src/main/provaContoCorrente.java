package main;
import Classi.ContoCorrente;
import Classi.ContoRisparmio;

public class provaContoCorrente {
   public static void main(String[] args) {
      ContoCorrente conto1;
      conto1 = new ContoCorrente("Stefano Felicini", "ABC12345678");

      // Ho aggiunto il nome variabile 'conto2' e i valori per saldo (0.0) e tasso (1.5)
      ContoRisparmio conto2 = new ContoRisparmio("Stefano Felicini", "XYZ12345678", 0.0, 1.5);

      conto1.versa(500.0);
      conto1.preleva(0.0);
      conto1.mostraDati();

      // Adesso puoi usare anche conto2 se vuoi
      conto2.mostraDati();
   }
}