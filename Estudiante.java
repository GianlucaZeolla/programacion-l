public class Main {
    public static <Estudiante> void main(String[] args) {

        double [] calificacionesJose = {8.8,9.2,10.0};
        double [] calificacionesJuan = {5.2,6.0,7.5};
        double [] calificacionesMaria = {7.2,4.5,5.5}; //tabnine inteligencia artificial
        Estudiante[] estudiantes = new Estudiante[]{
                new Estudiante("Jose", 20, calificacionesJose),
                new Estudiante("Juan", 22, calificacionesJuan),
                new Estudiante("Maria", 20, calificacionesMaria)
        };

        for(Estudiante estudiante :estudiantes){
            System.out.println("++++++++++++");
            System.out.println("el Estudiante: " + estudiante.getNombre()
            + " edad : " + estudiante.getEdad()
                +    " tiene un promedio de : " + estudiante.calcularPromedio() );
            System.out.println("++++++++++++");


        }
    }
}
