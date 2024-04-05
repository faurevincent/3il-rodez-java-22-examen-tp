package model;

/**
 * Une tache est représenter par un titre, une description, et un niveau de priorité
 */
public class Tache {

	/**
	 * Niveau de priorité de la tache
	 */
	private Priorite priorite;
	
	/**
	 * Titre de la tache
	 */
	private String titre;
	
	/**
	 * Description de la tache
	 */
	private String description;

	/**
	 * Construction d'une tache
	 * @param priorite Niveau de priorite
	 * @param titre Titre de la tache
	 * @param description Description de la tache
	 */
	public Tache(Priorite priorite, String titre, String description) {
		super();
		this.priorite = priorite;
		this.titre = titre;
		this.description = description;
	}

	public Priorite getPriorite() {
		return priorite;
	}

	public void setPriorite(Priorite priorite) {
		this.priorite = priorite;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass() != Tache.class) {
			return false;
		}
		Tache t = (Tache) obj;
		return this.titre == t.titre && this.description == t.description && this.priorite == t.priorite;
	}
}
