public class Empleado {
    private String name;
    private String Asignacion;
    private int edad;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsignacion() {
        return Asignacion;
    }

    public void setAsignacion(String asignacion) {
        Asignacion = asignacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String verEmpleado(){
        return "Nombre del empleado: " + getName() + "Edad del empleado: " + getEdad() + "Departamento al que pertenece: " + getAsignacion();
    }
}
