package n1exercici3;


import java.util.ArrayList;
import java.util.List;

public class MesosDelAny {
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

        System.out.println("Impresio dels mesos amb lambda:");

//        mesosDeLany.stream().forEach(mesos -> {
//            System.out.println(mesos + "\n");
//        }); //el stream no es necesari en aquest programa, ja que no requereix de cap operacio sobre la llista mes que imprimir.

        mesosDeLany.forEach(mes -> System.out.println(mes + "\n"));

    }
}
