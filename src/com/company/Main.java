package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("INFORME A QUANTIDADE DE NOTAS: ");
        int avaliacoes = a.nextInt();
        double media = 0;
        for (int i = 1; i <= avaliacoes; i++) {
            System.out.println("INFORME A NOTA: " + 1);
            double nota = a.nextInt();
            media = media + nota;
        }
        media = media / avaliacoes;
        System.out.println("MÉDIA FINAL: " + media);

    }
}
