package n1exercici4;

import java.util.ArrayList;
import java.util.List;

public class MetodeReference {
    public static void main(String[] args) {

        List<String> mesosDeLany = new ArrayList<String>();

        mesosDeLany.add("Gener");
        mesosDeLany.add("Febrer");
        mesosDeLany.add("Març");
        mesosDeLany.add("Abril");
        mesosDeLany.add("Maig");
        mesosDeLany.add("Juny");
        mesosDeLany.add("Juliol");
        mesosDeLany.add("Agost");
        mesosDeLany.add("Setembre");
        mesosDeLany.add("Octubre");
        mesosDeLany.add("Novembre");
        mesosDeLany.add("Desembre");

        System.out.println("Impresio dels mesos amb metode reference:");

        mesosDeLany.forEach(System.out::println);


    }
}
