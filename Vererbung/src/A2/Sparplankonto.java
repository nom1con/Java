package A2;

import java.time.*;

public class Sparplankonto extends Geldanlagekonto{

	double mtlSparrate=0;
	
	@Override
	public void print(){
		//anzahl der übrigen monate der laufzeit
		Period period = Period.between(LocalDate.now(), laufzeit);
		int monate = period.getMonths()+(period.getYears()*12);
		System.out.printf("SPARPLAN-KONTO\nKontonummer:\t%s\nKontoinhaber:\t%s\nZinssatz:\t%f\nLaufzeit:\t%d\nSparrate:\t%f", this.kontoNr, this.name, this.guthabenZinssatz,monate, this.mtlSparrate);
		return;
	}
		
	public Sparplankonto() {
		super();
	}

	public Sparplankonto(String name, String kontoNr, double kontoStand, double guthabenZinssatz,
			LocalDate laufzeit, double mtlSparrate) {
		super(name, kontoNr, kontoStand, guthabenZinssatz, laufzeit);
		this.mtlSparrate = mtlSparrate;
	}

	public double getMtlSparrate() {
		return mtlSparrate;
	}

	public void setMtlSparrate(double mtlSparrate) {
		this.mtlSparrate = mtlSparrate;
	}
	
	
	
}
