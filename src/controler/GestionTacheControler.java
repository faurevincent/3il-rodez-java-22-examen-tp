package controler;

import exception.TacheNonPresenteException;
import model.GestionTacheModel;
import model.Priorite;
import model.Tache;
import vue.GestionTacheVue;

/**
 * Controler de l'application Gestion tache
 */
public class GestionTacheControler {

	private GestionTacheModel gestionTacheModel;
	
	/**
	 * Creation d'une instance du controler
	 * @param gestionTacheModel
	 */
	public GestionTacheControler(GestionTacheModel gestionTacheModel) {
		this.gestionTacheModel = gestionTacheModel;
	}

	/**
	 * Ajouter une tache
	 * @param titre
	 * @param description
	 * @param priorite
	 */
	public void ajouter(String titre, String description, Priorite priorite) {
		if(priorite == null) {
			gestionTacheModel.ajouterTache(description, titre);
		}else {
			gestionTacheModel.ajouterTache(description, titre, priorite);
		}
	}
	
	/**
	 * Suppression d'un tache
	 * @param tache
	 */
	public void supprimer(Tache tache) throws TacheNonPresenteException {
		gestionTacheModel.supprimerTache(tache);
	}
	
	/**
	 * Modification du titre d'une tache
	 * @param aModifier
	 * @param titre
	 */
	public void modifierTitre(Tache aModifier, String titre) {
		gestionTacheModel.getTache(aModifier).setTitre(titre);
	}
	
	/**
	 * Modification de la description d'une tache
	 * @param aModifier
	 * @param description
	 */
    public void modifierDescription(Tache aModifier, String description) {
    	gestionTacheModel.getTache(aModifier).setDescription(description);
	}

    /**
     * Modification de la priorite d'une tache
     * @param aModifier
     * @param priorite
     */
    public void modifierPriorite(Tache aModifier, Priorite priorite) {
    	gestionTacheModel.getTache(aModifier).setPriorite(priorite);
    }
    
    /**
     * Utiliser pour afficher les taches
     * @return Les taches a afficher en string
     */
    public String getTaches() {
    	return gestionTacheModel.toString();
    }
}
