/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_19;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int A [][]={{0,-2,4},{2,0,2},{-4,-2,0}};
        int B [][]=new int [3][3];
        
        System.out.println("Ingresando Valores Aleatorios de la Matriz A ...");
        //llenarMatrizAleatorio(A);
        System.out.println("Matriz A Generada:");
        mostrarMatriz(A);
        System.out.println("Metodo Comprobación Antisimetría A=-AT");
        System.out.println("Transponiendo Matriz A");
        transponerMatriz(A,B);
        System.out.println("Matriaz AT Generada:");
        mostrarMatriz(B);
        System.out.println("Validando si es Antisimétrica ...");
        esMatrizAntiSimétrica(A,B);
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
    
    public static void esMatrizAntiSimétrica(int[][] matriz1,int[][] matriz2){
        
        boolean validacion=true;
        
        for(int i=0;i<matriz1.length;i++){

            for (int j = 0; j < matriz1.length; j++) {
                if (matriz2[i][j] == -matriz1[i][j]) {
                    validacion = validacion && true;
                } else {
                    validacion = validacion && false;
                    break;
                }

            }
        }
        if(validacion==true){
            System.out.println("La Matriz es Antisimétrica");
        }else{
            System.out.println("La Matriz NO es Antisimétrica");
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