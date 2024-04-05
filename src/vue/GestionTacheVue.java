package vue;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListModel;

import controler.GestionTacheControler;
import model.Priorite;

/**
 * Vue de la gestion de taches
 */
public class GestionTacheVue extends JPanel {

	private GestionTacheControler gestionTacheControler;
	
	private JTextField zoneTitre;
	
	private JTextField zoneDescription;
	
	private JList listPriorite;
	
	private JButton boutonAjout;
	
	private JLabel tache;

	public GestionTacheVue(GestionTacheControler gestionTacheControler) {
		this.gestionTacheControler = gestionTacheControler;
		
		zoneTitre = new JTextField();
		zoneTitre.setSize(50,10);
		zoneDescription = new JTextField();
		zoneDescription.setSize(50,10);
		boutonAjout = new JButton("Ajouter");
		tache = new JLabel();
		listPriorite = new JList<Priorite>(new Priorite[] {Priorite.BASSE, Priorite.MOYENNE, Priorite.HAUTE});
		
		boutonAjout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gestionTacheControler.ajouter(zoneTitre.getText(), zoneDescription.getText(), (Priorite)listPriorite.getSelectedValue());
				tache.setText(gestionTacheControler.getTaches());
			}
		});
		
		tache.setText(gestionTacheControler.getTaches());
		this.add(zoneTitre);
		this.add(zoneDescription);
		this.add(listPriorite);
		this.add(boutonAjout);
		this.add(tache);
	}
	
}
