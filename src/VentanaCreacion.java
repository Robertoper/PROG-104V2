import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class VentanaCreacion extends JDialog{
    private JPanel pnlBase;
    private JLabel iblEstudiante;
    private JLabel iblDni;
    private JLabel iblNombre;
    private JLabel Curso;
    private JLabel iblAsignatura;
    private JLabel iblAlumno;
    private JComboBox cmbTipoAlumno;
    private JComboBox cmbCurso;
    private JTextField txtNombre;
    private JTextField txtDni;
    private JList lstAsignaturas;
    private JButton btnAceptar;
    private JLabel iblNivel;
    private JComboBox cmbNivel;
    private String alumno;
    private String dni;
    private int curso;
    private String tipoAlumno;
    private String nivel;
    private String[] asignaturas;

    public VentanaCreacion(ArrayList<Alumno> listaAlumno) {
        setTitle("Ventana Creacion Personajes");
        setContentPane(pnlBase);
        setBounds(100,100,700,700);
        setVisible(true);
        Alumno nuevoAlumno=new Alumno(alumno,dni,nivel,asignaturas,curso) {
            @Override
            public double pagoMensual() {
                return 0;
            }

            @Override
            public String mostrarAsignaturas() {
                return null;
            }
        };
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


                nuevoAlumno.setDni(txtDni.getText());
                nuevoAlumno.setNombre(txtNombre.getText());
                nuevoAlumno.setCurso(cmbCurso.getItemCount());
                nuevoAlumno.setNivelAcademico(cmbNivel.getSelectedItem().toString());
                nuevoAlumno.setListaAsignaturas();
                listaAlumno.add(nuevoAlumno);
                JOptionPane.showMessageDialog(null,"Alumno creado perfectamente");
            }
        });
    }
}


