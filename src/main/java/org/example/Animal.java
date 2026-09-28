package org.example;

public class Animal {
    public static void main(String[] args) {

        /*4 - Crie uma classe chamada Pet.

Dê a ela três atributos: nome (String), raca (String) e peso (double).

Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).

Atribua valores para os atributos de cada um deles.

Imprima os dados dos dois pets concatenando textos e variáveis.*/

        Pet cachorro = new Pet();
        cachorro.nome = "Tobias";
        cachorro.raca = "Shih Tzu";
        cachorro.peso = 10.3;

        System.out.println("Nome do cachorro é " + cachorro.nome + ", da raça " + cachorro.raca + ", pesa " + cachorro.peso + "kg");

        System.out.println();

        Pet cachorro1 = new Pet();
        cachorro1.nome = "Kira";
        cachorro1.raca = "Golden";
        cachorro1.peso = 20.3;

        System.out.println("Nome do cachorro é " + cachorro1.nome + ", da raça " + cachorro1.raca + ", pesa " + cachorro1.peso + "kg");

    }
}
