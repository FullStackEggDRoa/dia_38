/*
    EJERCICIO EXTRA 6:
    Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
    debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejercicio_extra_6;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_Extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el número de Personas a promediar:");
        int l = leer.nextInt();
        float[] estaturas= new float[l];
        int contador = 0;
        float sumatoria_160=0;
        int contador_160=0;
        
        // Ingreso de las Estaturas
        do{
            System.out.println("Ingrese la estatura de la Persona No."+(contador+1)+": ");
            estaturas[contador]=leer.nextFloat();
            contador++;        
        }while(contador<l);
        // Cálculo del promedio de estaturas menores a 1.60
        System.out.println("Calculando el Promedio Estaturas menores a 1.60 m ....");
        for(int i=0;i<estaturas.length;i++){
            
            if(estaturas[i]<1.60){
                sumatoria_160+=estaturas[i];
                contador_160++;
            }
            
        }
        //Mostrando Resultados5
       
        System.out.println("El promedio de Estaturas menores a 1.60m es:"+String.format("%.3g",(sumatoria_160/contador_160))+" m.");
    }
    
}
