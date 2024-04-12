package interfaces_2;

import java.util.Arrays;

import interfaces_1.Socio;

public class MainFutbolista {

	public static void main(String[] args) {

		Futbolista[] futbolistas = new Futbolista[5];

		Futbolista futbolista1 = new Futbolista(10, "Cristiano Ronaldo", 34, 100);
		Futbolista futbolista2 = new Futbolista(7, "Robert Lewandowski", 36, 200);
		Futbolista futbolista3 = new Futbolista(10, "Cristiano Ronaldo", 29, 150);
		Futbolista futbolista4 = new Futbolista(9, "Lionel Messi", 33, 75);
		Futbolista futbolista5 = new Futbolista(20, "Kevin De Bruyne", 30, 125);
	
		futbolistas[0] = futbolista1;
		futbolistas[1] = futbolista2;
		futbolistas[2] = futbolista3;
		futbolistas[3] = futbolista4;
		futbolistas[4] = futbolista5;
	
		// Comparación de futbolistas
        int res;

        res = futbolista1.compareTo(futbolista2);
        System.out.println("Comparación entre futbolista1 y futbolista2: " + res);

        res = futbolista2.compareTo(futbolista3);
        System.out.println("Comparación entre futbolista2 y futbolista3: " + res);

        res = futbolista1.compareTo(futbolista3);
        System.out.println("Comparación entre futbolista2 y futbolista3: " + res + "\n");
        
        // Ordenación del array de futbolistas
        Arrays.sort(futbolistas);

        // Impresión de los futbolistas ordenados
        System.out.println("Futbolistas ordenados:");
        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista);
        }
    }
}