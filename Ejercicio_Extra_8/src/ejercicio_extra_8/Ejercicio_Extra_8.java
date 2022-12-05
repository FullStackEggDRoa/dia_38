/*
    EJERCICIO_EXTRA_8
    Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
   detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
   la cantidad de números impares. Al igual que en el ejercicio anterior los números
   negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejercicio_extra_8;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_Extra_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int n_pares=0;
        int n_impares=0;
        int n_sumatoria=0;
        int num=0;
        int n_cont=0;
        boolean loopwhile=true;
        
        do{
            do{
                if(num<0)
                {
                    System.out.println("Ingresa nuvamente el número "+(n_cont+1)+" (n>0): ");
                    num=leer.nextInt();
                }else{
                    System.out.println("Ingresa el número "+(n_cont+1)+" (n>0): ");
                    num=leer.nextInt();
                }
            }while(num<0);
            
            //Sumatoria al promedio
            n_sumatoria+=num;
            //validación numero par
            if(num%2==0){
                n_pares++;
            }else{
                n_impares++;
            }
            //validación multiple de 5
            if(num%5==0){
                break;  // Este break psse a que esta dentro de un condicionales, interrumpe directamente el loop while.
                //loopwhile=false; // Conla línea anterior esta linea no es necesaria, es por tal motivo se la comenta.
            }else{
                loopwhile=true;
            }
            n_cont++;
        }while(loopwhile);
        System.out.println("La Cantidad de Números leidos es:"+(n_cont+1));
        System.out.println("La Cantidad de Número Pares es: "+n_pares);
        System.out.println("La Cantidad de Número Impares es: "+n_impares);
        
    }
    
}
