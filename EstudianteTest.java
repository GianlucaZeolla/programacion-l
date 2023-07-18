public class EstudianteTest {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("pepe", 25, new int[]{3, 5, 1}),
                new Estudiante("juan", 18, new int[]{8, 2, 7}),
                new Estudiante("josefa", 25, new int[]{10, 9, 8}),
        };
        Estudiante estudianteConMejorCalificacion = estudiantes[0];
        for (Estudiante estudiante: estudiantes) {
            if (estudiante.getPromedioCalificaciones() > estudianteConMejorCalificacion.getPromedioCalificaciones()) {
                estudianteConMejorCalificacion = estudiante;
            }
        }

        System.out.println(" el estudiante con la clasificacion mas alta es : ");
        System.out.println("nombre: " + estudianteConMejorCalificacion.getNombre());
        System.out.println("edad:  " + estudianteConMejorCalificacion.getEdad() );
        System.out.println("calificaciones " + estudianteConMejorCalificacion.getCalificaciones());






    }
    }
