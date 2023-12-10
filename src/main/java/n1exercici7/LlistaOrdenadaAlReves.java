package n1exercici7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LlistaOrdenadaAlReves {
    public static void main(String[] args) {
        List<String> paraules = new ArrayList<String>();

        paraules.add("Bon");
        paraules.add("Dia");
        paraules.add("Ningu");
        paraules.add("Ho");
        paraules.add("Ha");
        paraules.add("Demanat");
        paraules.add("Pero");
        paraules.add("Fa");
        paraules.add("Fred");

        System.out.println("Imprimim la llista per ordenada de MES lletres a menys");

        paraules.sort(Comparator.comparing(String::length).reversed());

        paraules.forEach(System.out::println);
    }
}
