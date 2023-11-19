package application;
import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tamanho do Vetor: ");
        int n = sc.nextInt();

        Produto[] products = new Produto[n];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Digite o nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            products[i] = new Produto(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < products.length; i++) {
            soma += products[i].getPreco();
        }

        for (int i = 0; i < products.length; i++) {
            System.out.println("\n" + products[i]);
        }

        double avg = soma / n;
        System.out.printf("Preço médio: %.2f%n", avg );

        sc.close();
    }
}