package A2;

public class Konto {

	String name="", kontoNr="";
	double kontoStand=0, guthabenZinssatz=0;
	
	public void print(){
		System.out.printf("KONTO\nKontonummer:\t%s\nKontoinhaber:\t%s\nZinssatz:\t%f", this.kontoNr, this.name, this.guthabenZinssatz);
		return;
	}
	
	Konto(){}
	
	Konto(String name, String kontoNr, double kontoStand, double guthabenZinssatz){
		this.name = name;
		this.kontoNr = kontoNr;
		this.kontoStand = kontoStand;
		this.guthabenZinssatz = guthabenZinssatz;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKontoNr() {
		return kontoNr;
	}

	public void setKontoNr(String kontoNr) {
		this.kontoNr = kontoNr;
	}

	public double getKontoStand() {
		return kontoStand;
	}

	public void setKontoStand(double kontoStand) {
		this.kontoStand = kontoStand;
	}

	public double getGuthabenZinssatz() {
		return guthabenZinssatz;
	}

	public void setGuthabenZinssatz(double guthabenZinssatz) {
		this.guthabenZinssatz = guthabenZinssatz;
	}
	
}
