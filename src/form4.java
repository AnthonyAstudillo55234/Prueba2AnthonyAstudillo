import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class form4 extends JFrame{
    private JPanel mainPanel;
    private JTextField buscar;
    private JButton buscarBtn;
    private JLabel cedula;
    private JLabel hist;
    private JLabel nombre;
    private JLabel apelllido;
    private JLabel edad;
    private JLabel descripcion;
    private JLabel telefono;
    private JButton regresarButton;


    public form4() {
        setTitle("Inicio de sesion");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400,600));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        buscarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/sistema_hospitalario";
                String user = "root";
                String password = "123456";
                String query = "select * from paciente where cedula='" + buscar.getText() + "'";
                try(Connection con = DriverManager.getConnection(url, user, password)){
                    PreparedStatement ps = con.prepareStatement(query);
                    ResultSet rs = ps.executeQuery();
                    if(rs.next()){
                        cedula.setText(rs.getString("cedula"));
                        hist.setText(rs.getString("n_historial_clinico"));
                        nombre.setText(rs.getString("nombre"));
                        apelllido.setText(rs.getString("apellido"));
                        telefono.setText(rs.getString("telefono"));
                        edad.setText(rs.getString("edad"));
                        descripcion.setText(rs.getString("descripcion_enfermedad"));
                    }
                }catch (SQLException e1){
                    e1.printStackTrace();
                }
            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new form2();
                setVisible(false);
            }
        });
    }
}
