package edu.pedro.segundasemana;
import java.sql.Struct;

public class MinhaClasse {
    

    public static void main (String [] args) {
       // System.out.print("Olá turma, sejam bem-vindos");

       //Uma variável que não pode ter seu valor alterado precisa do "final" antes.
       // Dizemos também o tipo da variável, se é string, inteiro, booleano...

      // final String BR = "Brasil";

      // Sempre que eu for me referir a uma variável será assim, a variável primeiro, antes do código:

    //  String meuNome = "Pedro";

    //  int anoFabricacao = 2022;

    //  boolean verdadeira = true;

    //  anoFabricacao = 2018;

    // Todos os métodos na linguagem java costumam ser no infinitivo


    // Abaixo, vamos definir duas variáveis

    String primeiroNome = "Pedro";
    String segundoNome = "Ricardo";

    // Agora vamos criar uma variável que junte as variáveis anteriores

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    // Essa variável deverá ser impressa:

    System.out.println(nomeCompleto);
    }


    // Abaixo, vamos criar o método de unir as variáveis primeiroNome e segundoNome
    // Unimos os dois argumentos dentro de parênteses


    public static String nomeCompleto (String primeiroNome, String segundoNome) {
      return "Resultado do método " + primeiroNome.concat("  ").concat(segundoNome);
    }

   }
