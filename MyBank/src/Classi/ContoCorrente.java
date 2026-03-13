package Classi;

public class ContoCorrente {
	// Attributi
	private final String nomeTitolare;
	private final String numeroConto;
	private Double saldo;

	// Costruttore con validazione
	public ContoCorrente(String nomeTitolare, String numeroConto) {
		// Validazione nomeTitolare
		if (nomeTitolare == null) {
			throw new IllegalArgumentException("Il nome del titolare non può essere nullo");
		}
		if (nomeTitolare.length() < 3 || nomeTitolare.length() > 40) {
			throw new IllegalArgumentException("Il nome del titolare deve avere tra 3 e 40 caratteri");
		}

		// Validazione numeroConto
		if (numeroConto == null) {
			throw new IllegalArgumentException("Il numero di conto non può essere nullo");
		}
		if (numeroConto.length() < 8 || numeroConto.length() > 20) {
			throw new IllegalArgumentException("Il numero di conto deve avere tra 8 e 20 caratteri");
		}
		if (!numeroConto.matches("[A-Z0-9]+")) {
			throw new IllegalArgumentException("Il numero di conto può contenere solo lettere maiuscole e cifre");
		}

		this.nomeTitolare = nomeTitolare;
		this.numeroConto = numeroConto;
		this.saldo = 0.0;
	}

	// Metodi getter (senza controlli, perché già validati)
	public String getNomeTitolare() {
		return nomeTitolare;
	}

	public String getNumeroConto() {
		return numeroConto;
	}

	public Double getSaldo() {
		return saldo;
	}

	// Metodi del conto corrente
	public void versa(Double importo) {
		if (importo > 0) {
			saldo += importo;
			System.out.println("Il versamento è andato a buon fine");
		} else {
			System.out.println("Il versamento non è andato a buon fine");
		}
	}

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

	public void mostraDati() {
		System.out.println("Nome Titolare conto: " + nomeTitolare + "\nsaldo Disponibile: " + saldo);
	}
}