package main;
import Classi.ContoCorrente;

public class provaContoCorrente{
public static void main(String[] args) {
   ContoCorrente conto1; 
   conto1 = new ContoCorrente("Stefano Felicini", "0001");
   conto1.versa(500.0);
   conto1.preleva(0.0);
   conto1.mostraDati();
}
}