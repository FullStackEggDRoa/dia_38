/*
    EJERCICIO EXTRA 9:
        Simular la división usando solamente restas. Dados dos números enteros mayores que
       uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
       Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
       resultado es el residuo, y el número de restas realizadas es el cociente.
       Por ejemplo: 50 / 13:
       50 – 13 = 37 una resta realizada
       37 – 13 = 24 dos restas realizadas
       24 – 13 = 11 tres restas realizadas
       dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
       ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package ejercicio_extra_9;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_Extra_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("División por Restas Suscesivas");
        System.out.println("Ingrese el número 1:");
        int num1=leer.nextInt();
        System.out.println("Ingrese el número 2:");
        int num2=leer.nextInt();
        System.out.println("Relizando División:");
        
        int diferencia=num1;
        int cociente=0; // contador
        do{
            diferencia-=num2;
            cociente++;
        }while(diferencia>num2);
        System.out.println("Resultado:");
        System.out.println("La división del Número 1: "+num1+" y Número 2: "+num2);
        System.out.println("Residuo: "+diferencia);
        System.out.println("Cociente: "+cociente);
    }
    
}
