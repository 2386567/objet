package taitamoh.at05Partie2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LocAutos extends JFrame implements ActionListener {
    private JTextField txtNomClient = new JTextField(15);
    private JTextField txtPDureLoc = new JTextField(10);
    private JTextField txtTypeVehicule = new JTextField(10);
    private JRadioButton radioAuto = new JRadioButton("Automobile");
    private JRadioButton radioCamion = new JRadioButton("Camion");
    private JRadioButton radioFourgon = new JRadioButton("Fourgon");
    private JTextField txtMontantTotal = new JTextField(15);
    private JTextField txtMontantRabais= new JTextField(15);
    private ButtonGroup groupe = new ButtonGroup();
    private JButton btnCalculer = new JButton ("Calculer");
    private JButton btnEffacer = new JButton ("Effacer");

    
    private JPanel panel =  new JPanel();

    public LocAutos(){
        super("LocAutos");
        setTitle("LocAutos");
        setSize(400, 200);
        setLayout(new BorderLayout());
        txtMontantTotal.setEditable(false);
        txtMontantRabais.setEditable(false);
        JPanel panelForm = new JPanel(new GridLayout(4, 2, 10, 10));
        panelForm.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelForm.add(new JLabel("Nom du client: "));
        panelForm.add(txtNomClient);

        panelForm.add(new JLabel("Durée de location: "));
        panelForm.add(txtPDureLoc);

        panelForm.add(new JLabel("Type de véhicule"));
        panelForm.add(txtTypeVehicule);
       
        radioAuto.setMnemonic(KeyEvent.VK_R);
        radioCamion.setMnemonic(KeyEvent.VK_V);
        radioFourgon.setMnemonic(KeyEvent.VK_B);


        radioAuto.setSelected(true);

        panelForm.add(radioAuto);
        panelForm.add(radioCamion);
        panelForm.add(radioFourgon);
        

        panel.add(radioAuto);
        panel.add(radioCamion);
        panel.add(radioFourgon); 

        add(panel);

        JPanel panelB = new JPanel();
        panelB.add(btnCalculer);
        panelB.add(btnEffacer);

        add(panelForm, BorderLayout.CENTER);
        add(panelB, BorderLayout.SOUTH);

        
        btnCalculer.addActionListener(this);
        btnEffacer.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculer) {
        String nomClientTxt = txtNomClient.getText();
        String messageErreur = "Entrez un nom valide valide";    
        String dureLocTxt= txtPDureLoc.getText();
        messageErreur = "Entrez une durée valide";
        String typeVehiculeTxt = txtTypeVehicule.getText();
        messageErreur = "Entrez une durée valide";

        try{
            txtPDureLoc.setText(String.valueOf(txtPDureLoc));
            txtPDureLoc.setText(String.format("%.2f$", txtPDureLoc));
            txtPDureLoc.requestFocus(); 
            txtPDureLoc.selectAll();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(LocAutos.this, messageErreur);
           txtPDureLoc.requestFocus();
            }
            } else {
            txtPDureLoc.setText("");
            txtPDureLoc.setText("");
            txtPDureLoc.requestFocus();
            }

            if (rootPaneCheckingEnabled) {
                
            
        try{

        }catch(NumberFormatException ex){

        }

    }

        
    }

}
