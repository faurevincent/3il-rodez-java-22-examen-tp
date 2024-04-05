package model;

/**
 * Enumération représentant le type de priorite d'une tache
 */
public enum Priorite {
	
	HAUTE("Haute"),
	MOYENNE("Moyenne"),
	BASSE("Basse");

	/**
	 * Nom de la priorite
	 */
	private String nom;
	
	Priorite(String nom) {
		this.nom = nom;
	}

	/**
	 * Get nom de la priorite
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
}
