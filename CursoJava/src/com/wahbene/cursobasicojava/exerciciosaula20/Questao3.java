package com.wahbene.cursobasicojava.exerciciosaula20;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[][] numeros = new int[3][3];
       int pares = 0, impares = 0;


       for(int i = 0; i < numeros.length; i++ ){
           for(int j = 0; j < numeros[i].length; j++ ){
               System.out.print("Digite um número: ");
               numeros[i][j] = scanner.nextInt();

               if (numeros[i][j] % 2 == 0) {
                   pares++;
               } else {
                   impares++;
               }
           }
       }

       for (int i = 0; i < numeros.length; i++) {
           System.out.println();
           for (int j = 0; j < numeros[i].length; j++){
               if (j == numeros[i].length - 1){
                   System.out.print(numeros[i][j]);
               } else {
                   System.out.print(numeros[i][j] + " - ");
               }
           }
       }

        System.out.println("\nNumeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
    }
}
