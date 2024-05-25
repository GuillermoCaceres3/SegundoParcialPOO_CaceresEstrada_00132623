public class Empresa implements Builder{

    private static Empresa instance;
    private Empleado empleado = new Empleado();

    private Empresa(){

    }

    public static Empresa getInstance(){
        if (instance == null){
            instance = new Empresa();
        }
        return instance;
    }


    @Override
    public void buildAsignacion(String asignacion) {
        empleado.setAsignacion(asignacion);
    }

    @Override
    public void buildEdad(int edad) {
        empleado.setEdad(edad);
    }

    @Override
    public void buildName(String name) {
        empleado.setName(name);
    }

    @Override
    public Empleado build() {
        return empleado;
    }

}
