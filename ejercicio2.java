public class Main {
    public static void main(String[] args) {
        String [] palabras = {"pepefdsfe","josedfsdf","carlosdfsd", "diegodfd", "mariaddye"};

        String palabraLarga = palabras [0];
        for (int i = 1; i < palabras.length; i++) {
            if (palabras[i].length()>palabraLarga.length()){
                palabraLarga = palabras[i];


            }
        }
        System.out.println("la palabra mas larga es: " + palabraLarga);
    }
}
