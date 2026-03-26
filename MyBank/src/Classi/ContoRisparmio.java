package Classi;

public class ContoRisparmio extends ContoCorrente {
    private final double tassoInteresse;
    public ContoRisparmio(String nome, String numero, Double saldoIniziale, Double tasso) {
        super(nome, numero, saldoIniziale);
        this.tassoInteresse=tasso;
    }
    public void applicaInteressi(){
        Double interessi = getSaldo()*(tassoInteresse/100.0);
        versa(interessi);
        System.out.print("interessi applicati: " + interessi);
    }
}
