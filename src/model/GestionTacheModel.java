package model;

import java.util.ArrayList;
import java.util.List;

import exception.TacheNonPresenteException;

/**
 * Model permettant la gestion des taches de l'application
 */
public class GestionTacheModel {

	/**
	 * List actuel des taches présentes
	 */
	private List<Tache> taches;

	/**
	 * Constructeur par défaut
	 */
	public GestionTacheModel() {
		taches = new ArrayList<>();
	}
	
	/**
	 * Ajoute une tache sans priorite specifier (a BASSE par defaut)
	 * @param description
	 * @param titre
	 */
	public void ajouterTache(String description, String titre) {
		taches.add(new Tache(Priorite.BASSE, titre, description));	
	}
	
	/**
	 * Ajoute une tache avec une priorite specifier
	 * @param description
	 * @param titre
	 * @param priorite
	 */
    public void ajouterTache(String description, String titre, Priorite priorite) {
		taches.add(new Tache(priorite, titre, description));
	}
    
    /**
     * Suppression d'une tache
     * @param aSupprimer Tache a supprimer
     */
    public void supprimerTache(Tache aSupprimer) {
    	if(aSupprimer == null || !taches.contains(aSupprimer)) {
    		throw new TacheNonPresenteException("Cette tache n'existe pas.");
    	}
    	taches.remove(aSupprimer);
    }
	
}
