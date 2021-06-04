public class Profesor extends Persona{
    private String asignatura;

    public Profesor(String nombre, String dni,String asignatura) {
        super(nombre,dni);
        this.asignatura = asignatura;
    }


    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString()+
                "asignatura='" + asignatura + '\'' ;
    }
}
