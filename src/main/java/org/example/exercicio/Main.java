package org.example.exercicio;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Digite o nome do produto:");
            String nome = sc.nextLine();

            System.out.println("Digite o preço do produto:");
            double preco = sc.nextDouble();

            sc.nextLine();

            Produto produto = new Produto();

            produto.nome = nome;
            produto.preco = preco;

            if (produto.preco > 100) {
                System.out.println("Produto caro!");
            } else {
                System.out.println("Produto com preço acessível!");
            }
            System.out.printf("Produto:" + produto.nome + "| Preço: R$ %.2f%n", produto.preco);

            System.out.println();
        }
    }
}