package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class LlistaDeStrings {
    public static void main(String[] args) {

        List<String> paraules = new ArrayList<String>();

        paraules.add("Hola");
        paraules.add("Adeu");
        paraules.add("Java");
        paraules.add("JavaScript");
        paraules.add("PHP");
        paraules.add("Go");
        paraules.add("Python");

        //Convertim la llista en un fluxe per procesar les dades duna manera mes efectiva
        System.out.println("Les paraules que contenen la o son:");

        paraules.stream().filter(TeLaO -> TeLaO.contains("o") || TeLaO.contains("O")).forEach(TeLaO -> System.out.println(TeLaO + "\n"));

    }
}
