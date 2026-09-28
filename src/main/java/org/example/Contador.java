package org.example;

public class Contador {
    public static void main(String[] args) {


        /*2 - Faça um programa que use um laço for para contar de 1 até 15. Dentro do for,
        coloque um if para verificar se o número atual é par ou ímpar (dica:
        use o operador de resto da divisão % 2 == 0).
Imprima na tela o número e a palavra correspondente.
Exemplo de saída:
"1 é Ímpar"
"2 é Par"*/

        for (int contador = 1; contador <= 15; contador++) {

            if (contador % 2 ==0) {
                System.out.println("É par " + contador);

            } else {
                System.out.println("É impar " + contador);
            }

        }
    }
}
