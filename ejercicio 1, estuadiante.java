import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese el numero de estudiantes ");
        int NumeroEstudiantes = scanner.nextInt();

        int[] calificaciones = new int[NumeroEstudiantes];

        for (int i = 0; i < NumeroEstudiantes; i++) {
            System.out.println("por favor ingrese las calificaciones del estudiantes: " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();

        }
        int suma = 0;
        for (int i = 0; i <NumeroEstudiantes; i++) {
            suma += calificaciones[i];
        }

        double promedio = (double) suma / NumeroEstudiantes;
        System.out.print("\nEl promedio de las calificaciones es: " + promedio);
        scanner.close();
    }
}
