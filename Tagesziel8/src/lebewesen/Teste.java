package lebewesen;

/**
 * @author Bogachan
 * 
 */
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mensch mensch = new Mensch("Bogachan Oenal", 22, 80, "maennlich",
				"Dunkelbraun", "Hell", 1.85);

		Mensch karl = new Mensch("Karl", 12, 50, "maennlich", "Braun",
				"dunkel", 1.50);
		System.out.println(karl.toString());

		Katze eKurzhaar = new Katze("Leo", 2, 5, "maennlich", "Braun", "Rosa",
				"Europa‰ische Kurzhaar", "Mittelgroﬂ");
		System.out.println(eKurzhaar.toString());
	}
}
