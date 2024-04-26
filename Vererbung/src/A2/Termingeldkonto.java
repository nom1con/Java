package A2;

import java.time.*;

public class Termingeldkonto extends Geldanlagekonto{

	double mindestanlageBetrag=0;
	
	@Override
	public void print(){
		System.out.printf("TERMINGELD-KONTO\nKontonummer:\t%s\nKontoinhaber:\t%s\nZinssatz:\t%f\nMindestbetrag:\t%f", this.kontoNr, this.name, this.guthabenZinssatz,this.mindestanlageBetrag);
		return;
	}
	
	public Termingeldkonto() {
		super();
	}

	public Termingeldkonto(String name, String kontoNr, double kontoStand, double guthabenZinssatz,
			LocalDate laufzeit, double mindestanlageBetrag) {
		super(name, kontoNr, kontoStand, guthabenZinssatz, laufzeit);
		this.mindestanlageBetrag = mindestanlageBetrag;

	}

	public double getMindestanlageBetrag() {
		return mindestanlageBetrag;
	}

	public void setMindestanlageBetrag(double mindestanlageBetrag) {
		this.mindestanlageBetrag = mindestanlageBetrag;
	}

	
	
}
