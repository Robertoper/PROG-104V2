import java.util.Arrays;

public class Presencial extends Alumno{
    private double matriculaCurso=20;
    private int numeroConvocatoria=10;
    private double plusPorConvocatoria=15;

    public Presencial(String nombre, String dni, String nivelAcademico,String[] listaAsignaturas,int curso) {
        super(nombre, dni,nivelAcademico,listaAsignaturas,curso);
    }

    public double getMatriculaCurso() {
        return matriculaCurso;
    }

    public void setMatriculaCurso(double matriculaCurso) {
        this.matriculaCurso = matriculaCurso;
    }

    public int getNumeroConvocatoria() {
        return numeroConvocatoria;
    }

    public void setNumeroConvocatoria(int numeroConvocatoria) {
        this.numeroConvocatoria = numeroConvocatoria;
    }

    public double getPlusPorConvocatoria() {
        return plusPorConvocatoria;
    }

    public void setPlusPorConvocatoria(double plusPorConvocatoria) {
        this.plusPorConvocatoria = plusPorConvocatoria;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Presencial{" +
                "matriculaCurso=" + matriculaCurso +
                ", numeroConvocatoria=" + numeroConvocatoria +
                ", plusPorConvocatoria=" + plusPorConvocatoria +
                '}';
    }

    public double pagoMensual(){
        return matriculaCurso+numeroConvocatoria*plusPorConvocatoria/12;
    }
    public String mostrarAsignaturas(){
        return "El estudiante presencial"+getNombre()+ Arrays.toString(getListaAsignaturas());
    }
}
