public class Main {

    public static void main(String[] args) {
        String[] palabras = {"pepe", "jose", "carlos", "diego", "maria"};

    char caracter = 'm';

        int contadorPalabras = 0;
        for (String palabra : palabras) {
            if (palabra.charAt(0) == caracter) {
                contadorPalabras++;
            }
        }
            System.out.println("la cantidad de palabras que comienzan con la letra es : " + contadorPalabras);
        }
    }
