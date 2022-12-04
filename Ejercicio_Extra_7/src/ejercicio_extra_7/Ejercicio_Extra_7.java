/*
    EJERCICIO EXTRA 7
    Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
    de n números (n>0). El valor de n se solicitará al principio del programa y los números
    serán introducidos por el usuario. Realice dos versiones del programa, una usando el
    bucle “while” y otra con el bucle “do - while”.
 */
package ejercicio_extra_7;

import java.util.Scanner;

/**
 *
 * @author droa
 * Versión con WHILE
 */
public class Ejercicio_Extra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de número a ingresar:");
        int n=leer.nextInt();
        int n_max=0;
        int n_min=0;
        int n_sumatoria=0;
        int num=0;
        int n_cont=0;
        boolean primerloop=true;
        while(n_cont<n){
            System.out.println("Ingresa el número "+(n_cont+1)+" (n>0): ");
            num=leer.nextInt();
            while(num<0){
                System.out.println("Ingresa nuevamente el número "+(n_cont+1)+" (n>0): ");
                num=leer.nextInt();
            }
            
            //Sumatoria al promedio
            n_sumatoria+=num;
            //validación maximo
            if(num>n_max){
                n_max=num;
            }
            //validación mínimo
            if(primerloop==true){
                n_min=num;
                primerloop=false;
            }else{
                if(num<n_min){
                n_min=num;
                }
            }
            n_cont++;
        }
        System.out.println("El Valor Máximo ingresado es: "+n_max);
        System.out.println("El Valor Mínimo ingresado es: "+n_min);
        System.out.println("El Valor Promedio de los números ingresados es: "+String.format("%.3g",((float)n_sumatoria/(float)n)));
    }
    
}
