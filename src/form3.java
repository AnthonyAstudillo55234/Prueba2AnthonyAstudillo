import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class form3 extends JFrame {
    private JPanel mainPanel;
    private JTextField cedula;
    private JTextField historial;
    private JTextField nombre;
    private JTextField apellido;
    private JTextField telefono;
    private JTextField edad;
    private JTextField descripcion;
    private JButton INGRESARButton;
    private JLabel resultado;
    private JButton regresarButton;


    public form3() {
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
                int his = Integer.parseInt(historial.getText());
                int ed = Integer.parseInt(edad.getText());
                usuarioH usuario = new usuarioH(cedula.getText(), his, nombre.getText(), apellido.getText(), telefono.getText(), ed, descripcion.getText());
                String url = "jdbc:mysql://localhost:3306/sistema_hospitalario";
                String user = "root";
                String password = "123456";
                String query = "insert into paciente (cedula, n_historial_clinico, nombre, apellido, telefono, edad, descripcion_enfermedad) values(?,?,?,?,?,?,?)";
                try(Connection con = DriverManager.getConnection(url, user, password)){
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, cedula.getText());
                    ps.setString(2, historial.getText());
                    ps.setString(3, nombre.getText());
                    ps.setString(4, apellido.getText());
                    ps.setString(5, telefono.getText());
                    ps.setString(6, edad.getText());
                    ps.setString(7, descripcion.getText());
                    resultado.setText("Datos Registrados");
                    ps.executeUpdate();
                }catch (SQLException e1){
                    e1.printStackTrace();
                    resultado.setText("Datos no Registrados");
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