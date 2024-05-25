public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Empleado construirEmpleado(String name,String asignacion,int edad){
        builder.buildName(name);
        builder.buildEdad(edad);
        builder.buildAsignacion(asignacion);
        return builder.build();
    }
}
