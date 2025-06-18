package com.wahbene.cursobasicojava.exerciciosaula15;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, num3, maior = 0, menor = 0;
        String atencao;

        System.out.print("Digite o primeiro número: ");
        num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = ler.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = ler.nextInt();

        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
        } else if (num3 > num1 && num3 > num2){
            maior = num3;
        }

        if(num1 < num2 && num1 < num3){
            menor = num1;
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
        } else if (num3 < num1 && num3 < num2) {
            menor = num3;
        }


        System.out.print("O maior número é o " + maior + " e o menor número é o " + menor);


    }
}
