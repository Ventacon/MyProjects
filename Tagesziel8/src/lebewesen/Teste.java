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

		Tier tier = new Tier("Leo", 2, 5, "maennlich", "Europaeische Kurzhaar",
				"Mittelgroﬂ", "Braun", "Rosa");
		System.out.println(tier);
	
	}
}
