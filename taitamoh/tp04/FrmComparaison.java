package taitamoh.tp04;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
/**
 * Cette classe contiendra une fenetre
 * graphique qui permettra de calculer
 * et comparer le poids idéal entre 2 personnes.
 * @author Mohamed Abdoulaye Taita
 */
public class FrmComparaison extends JFrame {
    
private JTextField txtNom = new JTextField(10);
private JTextField txtPoids = new JTextField(10);
private JTextField txtTaille = new JTextField(10);
private JRadioButton radioHomme = new JRadioButton("Homme");
private JRadioButton radioFemme = new JRadioButton("Femme",true);
private ButtonGroup grpSexe = new ButtonGroup();

private JButton boutonComparer = new JButton("Comparer");

private Personne p1;

public FrmComparaison(Personne p1){
    super("Comparer poids idéal");
    this.p1 = p1;

    setSize(350,220);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);

    JPanel panel = new JPanel(new GridLayout(5,2,5,5));

    panel.add(new JLabel("Nom :"));
    panel.add(txtNom);
    panel.add(new JLabel("Poids en Kgs:"));
    panel.add(txtPoids);
    panel.add(new JLabel("Taille en cm:"));
    panel.add(txtTaille);

    panel.add(new JLabel("Taille en cm:"));
    JPanel panelSexe = new JPanel(new FlowLayout(FlowLayout.LEFT));
    grpSexe.add(radioHomme);
    grpSexe.add(radioFemme);
    panelSexe.add(radioHomme);
    panelSexe.add(radioFemme);
    panel.add(panelSexe);

    JPanel panelBoutton = new JPanel (new FlowLayout(FlowLayout.CENTER));
    panelBoutton.add(boutonComparer);

    boutonComparer.addActionListener(new ComparerListener());
    setLayout(new BorderLayout());
    add(panel,BorderLayout.CENTER);
    add(panelBoutton, BorderLayout.SOUTH);
    setVisible(true);

}

class ComparerListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
       try {

        String nom2 = txtNom.getText();
        double poids2 = Double.parseDouble(txtPoids.getText());
        int taille2 = Integer.parseInt(txtTaille.getText());

        Personne p2;

        if (radioHomme.isSelected()) {
            p2 = new Homme(nom2, taille2, poids2);
        }else{
            p2 = new Femme(nom2, taille2, poids2);
        }

        int result = p1.compareTo(p2);

        String message;

        if (result > 0) {
            message = p1.getNom() + " est plus proche de son poids idéal.";
        }else if (result < 0) {
            message = p2.getNom() + " est plus proche de son poids idéal.";
        }else{
            message = "Les deux personnes sont aussi proches de leur poids idéal";
        }
        JOptionPane.showMessageDialog(FrmComparaison.this, message,
        "Résultat de la comparaison", JOptionPane.INFORMATION_MESSAGE);

        
       } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(FrmComparaison.this,
        "Veuillez entrer des valeurs numériques valides.",
        "Erreur de saisie",JOptionPane.ERROR_MESSAGE);
       }


    }
}

}
