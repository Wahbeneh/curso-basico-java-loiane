package com.wahbene.cursobasicojava.exerciciosaula16e17;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b;

        System.out.print("Digite o número de a: ");
        a = ler.nextInt();

        System.out.print("Digite o número de b: ");
        b = ler.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++){
                System.out.print(i + " ");
            }
        } else {
            for (int i = b; i <= a; i++){
                System.out.print(i + " ");
            }
        }


    }
}
