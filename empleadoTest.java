public class EmpleadoTest {
    public static void main(String[] args) {

        Empleado[] empleados = {
                new Empleado("Jose", new double[]{1000}, 5),
                new Empleado("Juan", new double[]{15}, 10),
                new Empleado("Maria", new double[]{0.1}, 4)
        };
        for (Empleado empleado : empleados) {
            empleado.aplicarAumento();
            System.out.println("-------------------");

            System.out.println("Empleado: " + empleado.getNombre()
                    + " - Salario Actual: $" + empleado.getSalario());
        }

    }

}
