package org.example;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        /*3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
1 - Ver camisas
2 - Ver calças
3 - Sair
Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha.
Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado)
quando a pessoa digitar 3.*/

      Scanner sc = new Scanner(System.in);

      int opcao;

      do {
          System.out.println("\n--- Menu ---" + "\n1 - Ver camisas" + "\n2 - Ver valças" + "\n3 - Sair" + "\nDigite uma opção:");

          opcao = sc.nextInt();

          switch (opcao) {

              case 1:
                  System.out.println("Você escolheu ver camisa.");
                  break;

              case 2:
                  System.out.println("Você escolheu ver calças.");
                  break;

              case 3:
                  System.out.println("Saindo do sistema...");
                  break;

                  default:
                  System.out.println("Opção inválida.");
          }
      } while (opcao != 3);

    }
}
