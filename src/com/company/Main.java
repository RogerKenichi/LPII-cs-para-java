package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // PROGRAMA QUE MOSTRA A MÉDIA
        Scanner in = new Scanner(System.in);

        System.out.println("- Média de duas notas \n\n");

        float nota1 = validarNota(true);
        float nota2 = validarNota(false);

        float media = (nota1 + nota2) / 2;

        System.out.println("Medía: " + media);

        String end = in.nextLine();
    }

    private static float validarNota(boolean primeiraNota){
        float nota = 0;
        Scanner in = new Scanner(System.in);
        do {
            if (primeiraNota)
                System.out.println("Digite a primeira nota: ");
            else
                System.out.println("Digite a segunda nota: ");
            nota = Float.parseFloat(in.nextLine());

            if (nota < 0 || nota > 10)
                System.out.println("  Nota inválida. Deve ser um valor de 0 a 10.");
        }while (nota < 0 || nota > 10);

        return  nota;
    }
}
