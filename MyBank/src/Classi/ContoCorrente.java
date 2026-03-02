package Classi;

public class ContoCorrente {
/*La classe ContoCorrente è una classe che rappresenta un conto corrente di un individo. 
 *La Classe possiede gli attributi: nomeTitolare, numeroConto e saldo.
 *nomeTitolare contiene il nome e il cognome del proprietario del conto ed è una Stringa di massimo 40 caratteri e minimo 3.
 *numeroConto contiene un codice alfa numerico che identifica il conto e accetta solo lettere maiuscole o numeri come caratteri.
 *saldo contiene il valore numerico decimale del saldo disponibile sul conto.
 *
 *La classe poi prevede dei metodi get per il nometTitolare e per numeroConto con dei controlli che facciano rispettare i vincoli sopracitati.
 *La classe prevede un metodo costruttore che va a prendere il nome titolare, il numero del conto e va ad assegnare il valore al saldo a 0.0 nel momento in cui crei il conto.
 *La classe prevede 3 metodi: versa, preleva, mostraDati.
 *versa inserice un importo che deve essere maggiore di 0 e diverso da null al saldo del conto.
 *preleva va a sottrarre al saldo del conto un importo che deve essere diverso da null, maggiore di 0 e deve avere valore inferiore o uguale al saldo del conto.
 *mostraDati va a stampare a schermo il nome del titolare del conto e il saldo disponibile*/
	// Attributi
	private String nomeTitolare;
	private String numeroConto;
	private Double saldo;

	// Metodi get
	public String getnomeTitolare() {
		if (nomeTitolare == null) {
			throw new IllegalArgumentException("Il nome del titolare non può essere nullo o vuoto");
		}
		if (nomeTitolare.length() < 3 || nomeTitolare.length() > 40) {
			throw new IllegalArgumentException("Il nome del titolare non può superare i 40 caratteri");
		}
		return nomeTitolare;
	}

	public String getnumeroConto() {
		if (numeroConto == null) {
			throw new IllegalArgumentException("Il numero di conto non può essere nullo o vuoto");
		}
		if (numeroConto.length() < 8 || numeroConto.length() > 20) {
			throw new IllegalArgumentException("Il numero di conto deve avere tra 8 e 20 caratteri");
		}
		if (!numeroConto.matches("[A-Z0-9]+")) {
			throw new IllegalArgumentException("Il numero di conto può contenere solo lettere maiuscole e cifre");
		}
		return numeroConto;
	}

	// Costruttore
	public ContoCorrente(String nomeTitolare, String numeroConto) {
		this.nomeTitolare = nomeTitolare;
		this.numeroConto = numeroConto;
		this.saldo = 0.0;
	}

	// Metodi Del Conto corrente

	/*
	 * Il metodo versa aumenta il saldo del conto pari ad un importo maggiore di 0.
	 * In caso di successo stampa un messaggio di conferma, in caso contrario
	 * stamper un messaggio di errore.
	 */
	public void versa(Double importo) {
		if (importo > 0) {
			saldo += importo;
			System.out.println("Il versamento è andato a buon fine");
		} else {
			System.out.println("Il versamento non è andato a buon fine");
		}
	}

	/*
	 * Il metodo preleva va a togliere dal saldo del conto una somma pari
	 * all'importo inserito che dovrà essere maggiore di 0 e minore del totale del
	 * saldo. In caso di successo stampa un messaggio di conferma, in caso contrario
	 * stampa un messaggio di errore.
	 */
	public void preleva(Double importo) {
		if (importo > 0) {
			if (saldo >= importo) {
				saldo -= importo;
				System.out.println("prelievo avvenuto con successo");
			} else {
				System.out.println("Il prelievo non è andato a buon fine");
			}
		} else {
			System.out.println("Il prelievo non è andato a buon fine");
		}
	}

	/* Il metodo mostraDati stampa a video il nomeTitolare e il saldo del conto. */
	public void mostraDati() {
		System.out.println("Nome Titolare conto: " + nomeTitolare + "\nsaldo Disponibile: " + saldo);
	}
}
