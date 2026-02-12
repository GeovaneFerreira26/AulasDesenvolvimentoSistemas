package org.example.exercicio3;

import java.util.Scanner;

public class AtividadeTres {
    public static void main(String[] args) {
        // Declaração de Variáveis

        Scanner entrada = new Scanner(System.in);
        String loginSalvo = "Geovane";
        String senhaSalva = "159";
        String nomeUsuario;
        String senha;



    do {
        System.out.println("Informe o nome do Usuário: ");
        nomeUsuario = entrada.nextLine();

        System.out.println("Informe a Senha do Usuário: ");
        senha = entrada.nextLine();

        // Comparação de Strings e inteiros

            // nomeUsuario.equals(loginSalvo) = faz comparação dos dados do campo "loginSalvo" com o campo "login"
        if(nomeUsuario.equals(loginSalvo) && senha.equals(senhaSalva)){
            System.out.println("Bem-Vindo, Usuário Logado ✅");
        }else{
            System.out.println("Nome de usuário ou senha inválidos ❌");
        }
    }while (!nomeUsuario.equals(loginSalvo) || !senha.equals(senhaSalva));

    }
}

