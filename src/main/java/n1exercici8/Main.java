package n1exercici8;

public class Main {
    public static void main(String[] args) {

        //Creem una instancia de la interficie creada amb lambdas,
        // i el cos de la lambda implementara el metode reverse()
       FunctionalInterface reverser = (paraula) -> {

           //convertim la paraula en un array de char
           char[] lletres = paraula.toCharArray();

           //iterem larray de chars
           for (int i = 0; i < lletres.length / 2; i++){

               //creem una variable temporal per asignarli les lletres
               char temporal = lletres[i];

               lletres[i] = lletres[lletres.length -1 -i];
               lletres[lletres.length -1 -i] = temporal;
           }
           return  new String(lletres);
       };

       String paraula = "Banana";
       String paraulaAlReves = reverser.reverse(paraula);

        System.out.println("Paraula en sentit normal: " + paraula);
        System.out.println("Paraula al reves: " + paraulaAlReves);

    }
}
