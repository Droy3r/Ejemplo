/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones.y.arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Clase
 */
public class FuncionesYArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int[] numeros = new int [5];
    Scanner dato= new Scanner(System.in);
        int n1=1,n2=0;
        int i;
    
    for(i=0;i<5;i++){
    System.out.println("ingrese numeros enteros(1-20):  " + "\n["+(i+1)+"]:");
        numeros[1]=dato.nextInt();
        if(numeros[i]<1||numeros[i]>20){
             System.out.println("el numero esta fuera de rango >:c");
             i--;
        }
    }
    
    System.out.println("la suma es:   " + suma(numeros));
    }
    
    public static int suma(int[] num,int n){
      int num=0;
      for(int i=0;i<5;i++){
          sum+=num[i];
      }
           return sum;
  }
