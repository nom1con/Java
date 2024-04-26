package A1;

public class Auszubildender extends Mitarbeiter{

	private String ausbildungsberuf="";
	private int ausbildungsjahr=0;
	
	Auszubildender(){}
	
	Auszubildender(String name, String vorname,double gehalt, String beruf, int jahr){
		super(name, vorname, gehalt);
		this.ausbildungsberuf=beruf;
		this.ausbildungsjahr=jahr;
	}
	
	public void berechneBonus() {
		System.out.println("Gehalt um "+(this.getGehalt()*0.03)+"€ erhöht.");
		this.setGehalt(getGehalt()*1.03);
	}
	
	public String getAusbildungsberuf() {
		return this.ausbildungsberuf;
	}
	public void setAusbildungsberuf(String ausbildungsberuf) {
		this.ausbildungsberuf = ausbildungsberuf;
	}
	public int getAusbildungsjahr() {
		return this.ausbildungsjahr;
	}
	void setAusbildungsjahr(int jahr) {
		this.ausbildungsjahr = jahr;
	}
}
