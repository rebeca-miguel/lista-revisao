package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        /*1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele.
        Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00.
        No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
*/
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite o nome do lanche:");
        String nomeLanch = sc.nextLine();

        System.out.println("Digite o valor do lanch:");
        double valorLanch = sc.nextDouble();

        if (valorLanch > 30) {
            valorLanch = valorLanch - 5;
        }
        System.out.printf("O lanche " + nomeLanch + " custa R$ %.2f/n ", valorLanch);


    }
}
