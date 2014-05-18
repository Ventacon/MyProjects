package lebewesen;
/**
 * @author Bogachan
 * 
 */
public class Tier extends Lebewesen {

	private String rasse;
	// Eine ungefaehre groesse des Tieres
	private String tierGroesse;

	/**
	 * @param neuName
	 * @param neuAlter
	 * @param neuGewicht
	 * @param neuTiergroesse
	 * @param neuGeschlecht
	 * @param neuRasse
	 * @param neuHaarfarbe
	 * @param neuKoerperfarbe
	 */
	public Tier(String neuName, int neuAlter, int neuGewicht,
			String neuTiergroesse, String neuGeschlecht, String neuRasse,
			String neuHaarfarbe, String neuKoerperfarbe) {

		super(neuName, neuAlter, neuGewicht, neuGeschlecht, neuHaarfarbe,
				neuKoerperfarbe);
		this.rasse = neuRasse;
		this.tierGroesse = neuTiergroesse;
	}

	/**
	 * @return the rasse
	 */
	public String getRasse() {
		return rasse;
	}

	/**
	 * @param rasse
	 *            the rasse to set
	 */
	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	/**
	 * @return the tierGroesse
	 */
	public String getTierGroesse() {
		return tierGroesse;
	}

	/**
	 * @param tierGroesse
	 *            the tierGroesse to set
	 */
	public void setTierGroesse(String tierGroesse) {
		this.tierGroesse = tierGroesse;
	}

}
