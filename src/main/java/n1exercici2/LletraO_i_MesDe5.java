package n1exercici2;

import java.util.ArrayList;
import java.util.List;

public class LletraO_i_MesDe5 {
    public static void main(String[] args) {
        List<String> paraules = new ArrayList<String>();

        paraules.add("Holaa");
        paraules.add("Adeu");
        paraules.add("Java");
        paraules.add("JavaScript");
        paraules.add("PHP");
        paraules.add("Go");
        paraules.add("Python");
        paraules.add("Oscar");

        //Convertim la llista en un (stream) fluxe per procesar les dades duna manera mes efectiva
        System.out.println("Les paraules que contenen la o i tenen mes de 5 lletres son:");

        paraules.stream()
                .filter(TeLaO -> TeLaO.contains("o") || TeLaO.contains("O") && TeLaO.length() >= 5)
                .forEach(TeLaO -> System.out.println(TeLaO + "\n"));

    }
}
