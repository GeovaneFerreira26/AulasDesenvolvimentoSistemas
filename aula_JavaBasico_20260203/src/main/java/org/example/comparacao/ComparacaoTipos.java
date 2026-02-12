package org.example.comparacao;

import java.util.Scanner;

public class ComparacaoTipos {
    public static void main(String[] args) {
        // Declaração de Variáveis

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do Usuário: ");
        String nomeUsuario = entrada.nextLine();

        System.out.println("Informe a Senha do Usuário: ");
        int senha = entrada.nextInt();

        // Comparação de Strings e inteiros

        boolean resultadoNome = nomeUsuario.equals("Geovane");
        boolean resultadoSenha = (senha == 159);

        // Exibindo resultados
        System.out.println("O Nome do usuário esta correto? " + resultadoNome);
        System.out.println("A Senha está correta? " + resultadoSenha);
    }
}
