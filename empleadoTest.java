public class Empleado {
    public static void main(String[] args) {

        Empleado[] empleados ={
                new Empleado("Jose",10, salarioJose, 8),
                new Empleado("Juan", 5, salarioJuan,6),
                new Empleado("Maria",20,salarioMaria,7)
        };
        for (Empleado empleado :empleados) {
            empleado.aplicarAumento();
            System.out.println("------------------------");

            System.out.println("Empleado : " + empleado.getNombre()
            + "Salario Actual: $" + empleado.getSalario());

        }


    }
}
