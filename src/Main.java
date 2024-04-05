import javax.swing.JFrame;

import controler.GestionTacheControler;
import model.GestionTacheModel;
import vue.GestionTacheVue;

/**
 * Application gestion des taches
 */
public class Main {

	public static void main(String[] args) {
		
		GestionTacheVue gestionTacheVue = new GestionTacheVue(new GestionTacheControler(new GestionTacheModel()));
		
		JFrame application = new JFrame();
		application.setSize(600, 400);
		
		application.add(gestionTacheVue);
		
		application.setVisible(true);
	}
}
