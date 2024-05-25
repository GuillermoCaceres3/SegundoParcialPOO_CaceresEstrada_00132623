//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empresa empresa = Empresa.getInstance();
        Director director = new Director(empresa);
        Empleado empleado = director.construirEmpleado("Guille","Dep. Principal",19);
        System.out.println(empleado.verEmpleado());

        }
    }
