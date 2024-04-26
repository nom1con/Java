package A2;
import java.time.*;

public class Geldanlagekonto extends Konto{

	LocalDate laufzeit = LocalDate.now();
	
	@Override
	public void print(){
		System.out.printf("GELDANLAGEKONTO\nKontonummer:\t%s\nKontoinhaber:\t%s\nZinssatz:\t%f", this.kontoNr, this.name, this.guthabenZinssatz);
		return;
	}
	
	public Geldanlagekonto() {
		super();
	}

	public Geldanlagekonto(String name, String kontoNr, double kontoStand, double guthabenZinssatz, LocalDate laufzeit) {
		super(name, kontoNr, kontoStand, guthabenZinssatz);
		this.laufzeit=laufzeit;
	}
	
	public LocalDate getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(LocalDate laufzeit) {
		this.laufzeit = laufzeit;
	}
	
	
}
