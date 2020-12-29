public class Auto {
	
	//Instanz-Variablen (Attribute, Member)
	//<Datentyp> <name> [<Zuweisung>];
	private int leistung; //PS
	private String hersteller;
	
	//Instanz-Methoden
	//<Rückgabedatentyp> <name> ([<Parameterliste>]) { Rumpf (Logik) }
	public void tunen(int tuneWert) {
		leistung = leistung + tuneWert;
	}
	
	//Getter:
	public int getLeistung() {
		return leistung;
	}
	
	public String getHersteller() {
		return hersteller;
	}
	
	//Setter:
	public void setLeistung(int neueLeistung) {
		leistung = neueLeistung;
	}
	
	public void setHersteller(String neuerHersteller) {
		hersteller = neuerHersteller;
	}
	
	//KOnstruktoren
	//<KlassenName> (<ParameterListe>) { Rumpf (Logik)  }
	public Auto(int dieLeistung, String derHersteller) {
		leistung = dieLeistung;
		hersteller = derHersteller;
	}

}
