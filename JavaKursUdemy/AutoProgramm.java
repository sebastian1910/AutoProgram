
public class AutoProgramm {

	public static void main(String[] args) {
		
		Auto bmw = new Auto (100, "BMW");
		Auto audi = new Auto (150, "Audi");
		
		//Punkt-Notation
		bmw.tunen(25);
		
		/*
		 * TODO
		 * Wir müssen noch den Wert neueLeistung überprüfen!
		 * Falls er negativ ist -> Reagiere darauf!
		 */
		
		bmw.setHersteller("Mercedes");
		
		System.out.println(bmw.getLeistung () );
		System.out.println(audi.getLeistung() );
		System.out.println(bmw.getHersteller() );

	}

}
