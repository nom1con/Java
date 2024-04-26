package A2;

public class Girokonto extends Konto{

	double kreditLimit=0, ueberziehungsZinssatz = 0;

	@Override
	public void print(){
		System.out.printf("GIROKONTO\nKontonummer:\t%s\nKontoinhaber:\t%s\nZinssatz:\t%f\nKreditlimit:\t%f", this.kontoNr, this.name, this.guthabenZinssatz,this.kreditLimit);
		return;
	}
	
	public Girokonto() {
		super();
	}

	public Girokonto(String name, String kontoNr, double kontoStand, double guthabenZinssatz, double kreditLimit, double ueberziehungsZinssatz) {
		super(name, kontoNr, kontoStand, guthabenZinssatz);
		this.kreditLimit= kreditLimit;
		this.ueberziehungsZinssatz = ueberziehungsZinssatz;
	}

	public double getKreditLimit() {
		return kreditLimit;
	}

	public void setKreditLimit(double kreditLimit) {
		this.kreditLimit = kreditLimit;
	}

	public double getUeberziehungsZinssatz() {
		return ueberziehungsZinssatz;
	}

	public void setUeberziehungsZinssatz(double ueberziehungsZinssatz) {
		this.ueberziehungsZinssatz = ueberziehungsZinssatz;
	}
	
	
	
}
