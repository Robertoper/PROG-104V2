import java.util.Arrays;

public abstract class Alumno extends Persona{
    private int curso;
    private String nivelAcademico;
    private String[] listaAsignaturas;



    public Alumno(String nombre,String dni, String nivelAcademico,String[] listaAsignaturas,int curso) {
        super(nombre, dni);
        this.nivelAcademico=nivelAcademico;
        this.listaAsignaturas=listaAsignaturas;
        this.curso=curso;
    }

    public int getCurso() {
        return curso;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setListaAsignaturas(String[] listaAsignaturas) {
        this.listaAsignaturas=listaAsignaturas;
    }

    public String[] getListaAsignaturas() {
        return listaAsignaturas;
    }



    @Override
    public String toString() {
        return super.toString()+
                " Alumno{" +
                "curso=" + curso +
                ", nivelAcademico='" + nivelAcademico + '\'' +
                ", listaAsignaturas=" + Arrays.toString(listaAsignaturas) +
                '}';
    }

    public abstract double pagoMensual();

    public abstract String mostrarAsignaturas();
}
