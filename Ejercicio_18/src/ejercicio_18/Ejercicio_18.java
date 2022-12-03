/*
    Ejercicio 18:
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
    cambiando sus filas por columnas (o viceversa).
 */
package ejercicio_18;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int A [][]=new int [4][4];
        int B [][]=new int [4][4];
        
        System.out.println("Ingresando Valores Aleatorios de la Matriz A ...");
        llenarMatrizAleatorio(A);
        System.out.println("Matriaz A Generada:");
        mostrarMatriz(A);
        System.out.println("Transponiendo Matriz A en B");
        transponerMatriz(A,B);
        System.out.println("Matriaz B Generada:");
        mostrarMatriz(B);
    }
    public static void llenarMatrizAleatorio(int[][] matriz){
        
        Scanner leer = new Scanner (System.in);
        for (int i=0;i<matriz.length;i++) {   
            for (int j=0;j<matriz.length;j++){
                    matriz[i][j]=(int)(Math.random()*9)+1;   
            }
            
        }
        
    }
    
    public static void transponerMatriz(int[][] matriz1,int[][] matriz2){
        
        
        for(int i=0;i<matriz1.length;i++){
            
            for(int j=0;j<matriz1.length;j++){
                matriz2[j][i]=matriz1[i][j];
                 
            }
            
        }
       
    }
    
    public static void mostrarMatriz(int[][] matriz){
        String aux="";
        
        for(int[] fila : matriz){
            aux="";
            for(int elemento: fila){
                aux += "\t" + elemento;
                 
            }
            System.out.println(aux);
        }
        //System.out.println("Matriz: {"+aux+" }");
    }
    
}
