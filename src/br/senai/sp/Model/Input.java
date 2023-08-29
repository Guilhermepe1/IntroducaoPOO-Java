package br.senai.sp.Model;

import br.senai.sp.Aluno;
import br.senai.sp.Professor;

import java.util.Scanner;

public class Input {
    /** Declara variavel de escolha do menu */
    public int escolha;

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Coleta dados do menu */
    public void Menu(){
        System.out.println("\n-------------------------------------------------------");
        System.out.println("Escolha uma opção\n1 - Professor\n2 - Aluno\n3 - Ambos\n4 - Sair");
        System.out.println("Digite sua escolha: ");
        escolha = teclado.nextInt();
        System.out.println("-------------------------------------------------------");
    }

    /** Coleta dados do professor */
    public void ColetaProfessor(Professor objProfessor){

        System.out.println("Olá Prof°, qual o seu nome: ");
        objProfessor.nome = teclado.next();
        System.out.println("Sua idade: ");
        objProfessor.idade = teclado.nextInt();
        System.out.println("Seu telefone: ");
        objProfessor.telefone = teclado.nextLong();
        System.out.println("Sua especialidade: ");
        objProfessor.especialidade = teclado.next();
        System.out.println("Sua disciplina: ");
        objProfessor.disciplina = teclado.next();
    }

    /** Coleta dados do aluno */
    public void ColetaAluno(Aluno objAluno){

        System.out.println("Insira o nome do aluno: ");
        objAluno.nome = teclado.next();
        System.out.println("Idade: ");
        objAluno.idade = teclado.nextInt();
        System.out.println("Frequencia: ");
        objAluno.frequencia = teclado.nextInt();
        System.out.println("Nota 1: ");
        objAluno.nota1 = teclado.nextFloat();
        System.out.println("Nota 2: ");
        objAluno.nota2 = teclado.nextFloat();
    }

}
