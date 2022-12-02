/*
    EJERCICIO EXTRA 5:
    Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
    los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.
 */
package ejercicio_extra_5;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_Extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la Clase del Socio (A,B o C):");
        char clase_socio=leer.next().charAt(0);
        System.out.println("Ingrese el Costo del Tratamiento:");
        float costo_tratamiento=leer.nextFloat();
        
        System.out.println("Calculando Importe a Pagar:");
        switch(clase_socio){
            case 'A' -> System.out.println("Valor a Pagar por el Socio:"+costo_tratamiento*(1-0.50f));
            case 'B' -> System.out.println("Valor a Pagar por el Socio:"+costo_tratamiento*(1-0.35f));
            case 'C' -> System.out.println("Valor a Pagar por el Socio:"+costo_tratamiento);
        }
        
        
    }
    
}
