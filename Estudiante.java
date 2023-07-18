public class Estudiante {
    private String nombre;
    private int edad;
    private int[] calificaciones;

    public Estudiante (String nombre, int edad, int[] calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int[] getCalificaciones() {
        return calificaciones;
    }
    public double getPromedioCalificaciones() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }


    }
