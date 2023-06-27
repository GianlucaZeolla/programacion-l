public class Empleado {
     private String nombre;
     private double[] salario;
     private int antiguedad;

     public Empleado(String nombre, double[] salario, int antiguedad) {
         this.nombre = nombre;
         this.salario = salario;
         this.antiguedad = antiguedad;
     }
     public String getNombre() {
         return nombre;
     }
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
     public double[] getSalario() {
         return salario;
     }
     public void setSalario(double[] salario) {
         this.salario = salario;
     }
     public int getAntiguedad() {
         return antiguedad;
     }
     public void setAntiguedad(int antiguedad) {
         this.antiguedad = antiguedad;
     }
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", antiguedad=" + antiguedad + "}";
    }

    public void aplicarAumento() {
        if (antiguedad > 5) {
            for (int i = 0; i < salario.length; i++) {
                salario[i] += salario[i] * 0.1;
            }
        }
    }
}

