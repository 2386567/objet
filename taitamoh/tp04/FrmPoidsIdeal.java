package taitamoh.tp04;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.*;
import java.awt.event.*;
/**
 * Cette classe contiendra une fenetre
 * graphique qui permettra de calculer
 * et comparer le poids idéal d'une personne.
 * @author Mohamed Abdoulaye Taita
 */

public class FrmPoidsIdeal extends JFrame {

    private JTextField txtNom = new JTextField(10);
    private JTextField txtPoids= new JTextField(10);
    private JTextField txtTaille = new JTextField(10);
    private JRadioButton radioHomme = new JRadioButton("Homme");
    private JRadioButton radioFemme= new JRadioButton("Femme",true);
    private ButtonGroup grpSexe = new ButtonGroup();

    private JButton boutonCalculer = new JButton("Calculer");
    private JButton boutonEffacer = new JButton("Effacer");
    private JButton buttonComparer = new JButton("Comparer");
    
    private Personne p1;

    public FrmPoidsIdeal(){
        super("Poids idéal");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5,2,5,5));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        panel.add(new JLabel("Votre Nom: "));
        panel.add(txtNom);
        panel.add(new JLabel("Votre Poids Kg :"));
        panel.add(txtPoids);
        panel.add(new JLabel("Votre taille en cm :"));
        panel.add(txtTaille);

        panel.add(new JLabel("Vous êtes :"));
        JPanel panelSexe = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(panelSexe);
        grpSexe.add(radioHomme);
        grpSexe.add(radioFemme);
        panelSexe.add(radioHomme);
        panelSexe.add(radioFemme);
        
  
        JPanel panelBoutons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoutons.add(boutonCalculer);
        panelBoutons.add(boutonEffacer);
        panelBoutons.add(buttonComparer);

        ButtonListener listener = new ButtonListener();
        boutonCalculer.addActionListener(listener);
        boutonEffacer.addActionListener(listener);
        buttonComparer.addActionListener(listener);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        add(panelBoutons,BorderLayout.SOUTH);


        setVisible(true);
    }

        class ButtonListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e){
                Object source = e.getSource();

                if (source == boutonCalculer) {
                    try {
                        String nom = txtNom.getText();
                        double poids = Double.parseDouble(txtPoids.getText());
                        int taille = Integer.parseInt(txtTaille.getText());
                        if (radioHomme.isSelected()) {
                            p1 = new Homme(nom, taille, poids);
                        }else{
                            p1 = new Femme(nom, taille, poids);
                        }
                        double poidsIdeal =  p1.calculerPoidsIdeal();
                        JOptionPane.showMessageDialog(FrmPoidsIdeal.this, 
                        "Le poids idéal de " + nom + " est: " + String.format("%.2f", poidsIdeal) + " Kg",
                        "Votre poids idéal",
                        JOptionPane.INFORMATION_MESSAGE);
                        
                    
                       
                    } catch (NumberFormatException ex) {
                      JOptionPane.showMessageDialog(FrmPoidsIdeal.this,"Veuillez entrez des valeurs numériques valides.",
                      "Erreur de saisie",
                      JOptionPane.ERROR_MESSAGE);
                    }
                 }else if (source == buttonComparer) {
                    if (p1 != null) {
                        new FrmComparaison(p1);
                    }else{
                        JOptionPane.showMessageDialog(
                            FrmPoidsIdeal.this,
                            "Veuillez entrez des valeurs numériques valides.",
                      "Erreur de saisie",
                      JOptionPane.ERROR_MESSAGE);
                        
                    }
                 }
                
            }
        }
        
    

    
}

