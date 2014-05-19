package lebewesen;

/**
 * 
 * @author Bogachan
 * 
 */
public class Mensch extends Lebewesen {

	// Staatsangehoerigkeit
	private String herkunft;
	// Groesse eines Menschen in Meter
	private double groesse;

	/**
	 * @param neuName
	 * @param neuAlter
	 * @param neuGewicht
	 * @param neuGeschlecht
	 * @param neuHaarfarbe
	 * @param neuKoerperfarbe
	 * @param neuGroesse
	 */
	public Mensch(String neuName, int neuAlter, int neuGewicht,
			String neuGeschlecht, String neuHaarfarbe, String neuKoerperfarbe,
			double neuGroesse) {

		super(neuName, neuAlter, neuGewicht, neuGeschlecht, neuHaarfarbe,
				neuKoerperfarbe);
		this.groesse = neuGroesse;
	}

	/**
	 * Die Methode gibt die Daten des Menschen am Monitor aus.
	 */
	public String toString() {

		return super.toString() + String.format("Groesse: %s m\n", groesse);
	}

	/**
	 * @return the herkunft
	 */
	public String getHerkunft() {
		return herkunft;
	}

	/**
	 * @param herkunft
	 *            the herkunft to set
	 */
	public void setHerkunft(String herkunft) {
		this.herkunft = herkunft;
	}

	/**
	 * @return the groesse
	 */
	public double getGroesse() {
		return groesse;
	}

	/**
	 * @param groesse
	 *            the groesse to set
	 */
	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

}
