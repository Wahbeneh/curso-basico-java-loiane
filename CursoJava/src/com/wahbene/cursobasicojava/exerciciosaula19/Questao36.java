package com.wahbene.cursobasicojava.exerciciosaula19;

public class Questao36 {
    public static void main(String[] args) {
        int[] a = new int[11];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.pow(2,i);
            System.out.println(a[i]);
        }
    }
}
