package org.example.sistemaCadastroDeAlunas;

import java.util.Scanner;

public class Instancia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        int quantidadeAlunas = 0;

        while (opcao != 2) {
            System.out.println("Deseja iniciar?Precione " + "1  Continuar" + ", 2 para sair " + " 3 Quantidade Alunas");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    CadastroAlunas aluna = new CadastroAlunas();

                    do {
                        System.out.println("Nota 1:");
                        aluna.nota = sc.nextInt();

                        if (aluna.nota < 0 || aluna.nota > 10) {
                            System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");


                        }
                    } while (aluna.nota < 0 || aluna.nota > 10);

                    do {
                        System.out.println("Nota 2:");
                        aluna.nota2 = sc.nextInt();

                        if (aluna.nota2 < 0 || aluna.nota2 > 10) {
                            System.out.println("Nota inválida ! Difite uma nota entre 0 e 10.");
                        }


                    } while (aluna.nota2 < 0 || aluna.nota2 > 10);

                    aluna.media = (aluna.nota + aluna.nota2) / 2;


                    sc.nextLine();

                    System.out.println("Nome da Aluna:");
                    aluna.nome = sc.nextLine();

                    String situacao;

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                        situacao = "Aprovada";
                    } else {
                        aluna.passou = false;
                        situacao = "Reprovada";
                    }

                    quantidadeAlunas++;

                    System.out.printf(
                            "O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, e sua média final foi %.1f. Aluna: %s%n",
                            aluna.nome,
                            aluna.nota,
                            aluna.nota2,
                            aluna.media,
                            situacao
                            //aluna.passou
                    );

                    break;

                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;


                case 3:
                    System.out.println(
                            "Alunas Cadastradas: " + quantidadeAlunas
                    );
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        sc.close();
    }
}
