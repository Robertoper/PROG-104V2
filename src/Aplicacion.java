import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Aplicacion {
    private JPanel pnlBase;
    private JComboBox cmbElegir;
    private JButton btnEliminar;
    private JButton btnListar;
    private JButton btnBuscar;
    private JButton btnCrear;
    private JLabel iblMenu;

    private JDialog comunicacion;

    private ArrayList<Alumno> listaAlumno=new ArrayList<>();

    public Aplicacion(){
            btnCrear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    comunicacion =new VentanaCreacion(listaAlumno);
                }
            });

        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comunicacion=new VentanaListar(listaAlumno);
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion");
        frame.setContentPane(new Aplicacion().pnlBase);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
