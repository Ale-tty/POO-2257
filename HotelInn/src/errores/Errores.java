/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errores;

import java.util.Scanner;

/**
 *
 * @author Azu
 */
public class Errores {
    public static int respuesta(int min, int max){
        Scanner re = new Scanner(System.in);
        
        while(!re.hasNextInt()) {
            re.next();
            System.out.println("¿Acaso eres idiota? No ingresaste una "
                    + "opción válida");
            System.out.println("Fijate en lo que haces y vuelvelo a intentar");
        }
        int respuesta = re.nextInt();
        
        while(respuesta < min || respuesta > max) {
            System.out.println("¿Acaso eres idiota? No ingresaste una "
                    + "opción válida");
            System.out.println("Fijate en lo que haces y vuelvelo a intentar");
            
            while(!re.hasNextInt()) {
                re.hasNext();
                System.out.println("¿Acaso eres idiota? No ingresaste una "
                        + "opción válida");
                System.out.println("Fijate en lo que haces y vuelvelo a "
                        + "intentar");
            }
            respuesta = re.nextInt();
        }
        System.out.println("Tu respuesta fue:" + respuesta + "\n");
        return respuesta;
    }

}
