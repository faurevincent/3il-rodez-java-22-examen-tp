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
	private List<Task> taches;

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
		taches.add(new Task(Priorite.BASSE, titre, description));	
	}
	
	/**
	 * Ajoute une tache avec une priorite specifier
	 * @param description
	 * @param titre
	 * @param priorite
	 */
    public void ajouterTache(String description, String titre, Priorite priorite) {
		taches.add(new Task(priorite, titre, description));
	}
    
    /**
     * Suppression d'une tache
     * @param aSupprimer Tache a supprimer
     */
    public void supprimerTache(Task aSupprimer) {
    	if(aSupprimer == null || !taches.contains(aSupprimer)) {
    		throw new TacheNonPresenteException("Cette tache n'existe pas.");
    	}
    	taches.remove(aSupprimer);
    }
    
    @Override
    public String toString() {
    	String aAfficher = "<html>";
    	
    	for(Task t : taches) {
    		aAfficher += "TITRE : " + t.getTitre() + "<br>DESCRIPTION : " + t.getDescription() + "<br>NIVEAU DE PRIORITE : " + t.getPriorite() + "<br><br>";
    	}
    	
    	return aAfficher + "</html>";
    }
	
    /**
     * Recuperation d'une tache
     * @param tache
     * @return la tache
     */
    public Task getTache(Task tache) {
    	for(Task t : taches) {
    		if(t.equals(tache)) {
    			return t;
    		}
    	}
    	return null;
    }
}
