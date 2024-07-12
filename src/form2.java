import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 extends JFrame{
    private JPanel mainPanel;
    private JButton INGRESARButton;
    private JButton BUSCARButton;

    public form2() {
        setTitle("Buscar Datos");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 600));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        INGRESARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new form3();
                setVisible(false);
            }
        });
        BUSCARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new form4();
                setVisible(false);
            }
        });
    }
}
