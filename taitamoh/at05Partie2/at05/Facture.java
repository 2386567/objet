package taitamoh.at05Partie2.at05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Facture extends JFrame implements ActionListener {

    private JTextField txtNomClient = new JTextField(15);
    private JTextField txtPrixUnitaire = new JTextField(10);
    private JTextField txtNbItems = new JTextField(10);
    private JTextField txtMontantApresTaxes = new JTextField(10);
    private JButton btnCalculer = new JButton ("Calculer");
    private JButton btnEffacer = new JButton ("Effacer");


    private static final double TPS = 0.05;
    private static final double TVQ = 0.09975;

    public Facture() {
        super("Facture Client");
        setTitle("Facture client");
        setSize(400, 200);
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout());
        JPanel panelForm = new JPanel(new GridLayout(4, 2, 10, 10));
        panelForm.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txtMontantApresTaxes.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txtMontantApresTaxes.setEditable(false);

        panelForm.add(new JLabel("Nom du client: "));
        panelForm.add(txtNomClient);
        panelForm.add(new JLabel("Prix Unitaire: "));
        panelForm.add(txtPrixUnitaire);
        panelForm.add(new JLabel("Nombre d'items: "));
        panelForm.add(txtNbItems);
        panelForm.add(new JLabel("Montant après taxes: "));
        panelForm.add(txtMontantApresTaxes);
        
        JPanel panelB = new JPanel();
        panelB.add(btnCalculer);
        panelB.add(btnEffacer);

        
        add(panelForm, BorderLayout.CENTER);
        add(panelB, BorderLayout.SOUTH);

        
        btnCalculer.addActionListener(this);
        btnEffacer.addActionListener(this);

        
       
    }

    public void effacerChamps() {
        txtNomClient.setText("");
        txtPrixUnitaire.setText("");
        txtNbItems.setText("");
        txtMontantApresTaxes.setText("");
        txtNomClient.requestFocus();
    }
    public void calculerPrix() {
        try {
            double prixUnitaire = Double.parseDouble(txtPrixUnitaire.getText());
            int nbItems = Integer.parseInt(txtNbItems.getText());
            double montantAvantTaxes = prixUnitaire * nbItems;
            double montantApresTaxes = montantAvantTaxes * (1 + TPS + TVQ);
            txtMontantApresTaxes.setText(String.format("%.2f", montantApresTaxes));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Veuillez entrer des valeurs valides.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculer) {
            calculerPrix();
        } else if (e.getSource() == btnEffacer) {
            effacerChamps();
        }
    }

  
    
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                new Facture().setVisible(true);
            });
        }
}