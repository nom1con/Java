package A1;


public class Getraenkemarkt {

	public static void main(String[] args) {
		
		//ArrayList<Mitarbeiter> ..
		Mitarbeiter[] mArray = new Mitarbeiter[4];
		mArray[0]= new Mitarbeiter("Walser", "Frank", 1600);
		mArray[1]= new Mitarbeiter("Flink", "Eva", 1650);
		mArray[2]= new Mitarbeiter("Boss", "Hans", 4000);
		mArray[3]= new Auszubildender("Vogel", "Sven", 450, "FIA", 2024);

		
		mArray[2].gehaltsErhoehung(1000);
		
		for(Mitarbeiter mitarbeiter : mArray) {
			System.out.println(mitarbeiter.getGehalt());
			System.out.println(mitarbeiter.getName());
			System.out.println(mitarbeiter.getVorname());
			if (mitarbeiter instanceof Auszubildender) {
				System.out.println(((Auszubildender)mitarbeiter).getAusbildungsberuf());
			  }
			System.out.println();
		}
		
	}


}

