package lebewesen;

import java.util.ArrayList;

/**
 * @author Bogachan
 * 
 */
public abstract class Lebewesen {

	// Alter in Jahren
	private int alter;
	private String name;
	// Gewicht in Kilogramm
	private int gewicht;
	private String geschlecht;
	private String haarfarbe;
	private String koerperfarbe;
	// Eine Collection von allen Objekten
	private static ArrayList<Lebewesen> lebewesenListe = new ArrayList<Lebewesen>();

	/**
	 * 
	 * @param neuName
	 * @param neuAlter
	 * @param neuGewicht
	 * @param neuGeschlecht
	 * @param neuHaarfarbe
	 * @param neuKoerperfarbe
	 */
	public Lebewesen(String neuName, int neuAlter, int neuGewicht,
			String neuGeschlecht, String neuHaarfarbe, String neuKoerperfarbe) {

		this.name = neuName;
		this.alter = neuAlter;
		this.gewicht = neuGewicht;
		this.geschlecht = neuGeschlecht;
		this.haarfarbe = neuHaarfarbe;
		this.koerperfarbe = neuKoerperfarbe;
		lebewesenListe.add(this);

	}

	/**
	 * @return
	 * 
	 */
	public String auflisten() {
		String lebewesen = null;
		for (Lebewesen lebewesen1 : getLebewesenListe()) {
			lebewesen = lebewesen1.toString();
		}

		return lebewesen;
	}

	/**
	 * Die Methode gibt die Daten der Lebewesen am Monitor aus.
	 */
	public String toString() {

		return String
				.format("Name: %s\nAlter: %s Jahre\nGewicht: %s Kg\nGeschlecht: %s\nHaarfarbe: %s\nKoerperfaarbe: %s\n",
						name, alter, gewicht, geschlecht, haarfarbe,
						koerperfarbe);
	}

	/**
	 * Fuegt ein Lebewesen in die Collection ein.
	 * 
	 * @param lebewesen
	 */
	public void erfasseLebewesen(Lebewesen lebewesen) {
		lebewesenListe.add(lebewesen);
	}

	/**
	 * @return the alter
	 */
	public int getAlter() {
		return alter;
	}

	/**
	 * @param alter
	 *            the alter to set
	 */
	public void setAlter(int alter) {
		this.alter = alter;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gewicht
	 */
	public int getGewicht() {
		return gewicht;
	}

	/**
	 * @param gewicht
	 *            the gewicht to set
	 */
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	/**
	 * @return the geschlecht
	 */
	public String getGeschlecht() {
		return geschlecht;
	}

	/**
	 * @param geschlecht
	 *            the geschlecht to set
	 */
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	/**
	 * @return the koerperfarbe
	 */
	public String getKoerperfarbe() {
		return koerperfarbe;
	}

	/**
	 * @param koerperfarbe
	 *            the koerperfarbe to set
	 */
	public void setKoerperfarbe(String koerperfarbe) {
		this.koerperfarbe = koerperfarbe;
	}

	/**
	 * @return the haarfarbe
	 */
	public String getHaarfarbe() {
		return haarfarbe;
	}

	/**
	 * @param haarfarbe
	 *            the haarfarbe to set
	 */
	public void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}

	/**
	 * @return the lebewesenListe
	 */
	public static ArrayList<Lebewesen> getLebewesenListe() {
		return lebewesenListe;
	}

	/**
	 * @param lebewesenListe
	 *            the lebewesenListe to set
	 */
	public static void setLebewesenListe(ArrayList<Lebewesen> lebewesenListe) {
		Lebewesen.lebewesenListe = lebewesenListe;
	}
}
