import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcView {
    private JPanel mainPanel;
    private JFrame mainFrame;
    private JTextField ectsTextField;
    private JTextField notenTextField;
    private JButton calcButton;
    private JLabel durchschnitsNotenLabel;
    private JLabel notenTextLabel;
    private JLabel ectsLabel;
    private JLabel notenLabel;
    private JButton addButton;
    private JPanel notenPanel;
    private JPanel ectsPanel;

    private MainController mainController;

    public CalcView(MainController mainController){
        mainFrame = new JFrame();
        mainFrame.setContentPane(mainPanel);
        mainFrame.setSize(1200,700);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.mainController = mainController;
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                durchschnitsNotenLabel.setText(""+mainController.calcAvgMark());
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    mainController.addMarkToList(Double.parseDouble(notenTextField.getText()), Double.parseDouble(ectsTextField.getText()));
                    ectsTextField.setText("");
                    notenTextField.setText("");
                }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(null,"Bitte gib eine valide Kommazahl wie z.B. 1.0 ein!\n" +
                            "ACHTUNG: Ein valides Komma ist ein '.' und kein ','");
                }
            }
        });
    }
}
