import java.util.Arrays;

public class Libre extends Alumno {
    private float PRECIO_HORA=10;
    private int numeroHorasDiarias;

    public Libre(String nombre, String dni,String nivelAcademico, int numeroHorasDiarias,String[] listaAsignaturas,int curso) {
        super(nombre, dni,nivelAcademico,listaAsignaturas,curso);
        this.numeroHorasDiarias=numeroHorasDiarias;
    }

    public float getPRECIO_HORA() {
        return PRECIO_HORA;
    }

    public void setPRECIO_HORA(float PRECIO_HORA) {
        this.PRECIO_HORA = PRECIO_HORA;
    }

    public int getNumeroHorasDiarias() {
        return numeroHorasDiarias;
    }

    public void setNumeroHorasDiarias(int numeroHorasDiarias) {
        this.numeroHorasDiarias = numeroHorasDiarias;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Libre{" +
                "PRECIO_HORA=" + PRECIO_HORA +
                ", numeroHorasDiarias=" + numeroHorasDiarias +
                '}';
    }

    public double pagoMensual(){
        return PRECIO_HORA*numeroHorasDiarias*30;
    }

    public String mostrarAsignaturas(){
        return "El estudiante libre "+getNombre()+" cursa "+ Arrays.toString(getListaAsignaturas());
    }
}
