import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("palabra1");
        palabras.add("palabra2");
        palabras.add("palabra3");

        String resultado = ConcatenarPalabras(palabras);
        System.out.println(resultado);
    }

    public static String ConcatenarPalabras(ArrayList<String> palabras) {
        StringBuilder sb = new StringBuilder();
        for (String palabra : palabras) {
            sb.append(palabra).append(" ");
        }

      return sb.toString().trim();

    }
}
