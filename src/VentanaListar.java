import javax.swing.*;
import java.util.ArrayList;

public class VentanaListar extends JDialog {
    private JPanel pnlBase;
    private JLabel iblEstudiante;
    private JList lstEstudiantes;

    public VentanaListar(ArrayList<Alumno> listaAlumno){
        DefaultListModel listModel = new DefaultListModel();
        for(int i=0; i<listaAlumno.size(); i++) {
            listModel.add(i,listaAlumno.get(i));
        }
        lstEstudiantes.setModel(listModel);
        setTitle("Ventana Listar Alumnos");
        setContentPane(pnlBase);
        setBounds(100,100,700,700);
        setVisible(true);
    }

}
