package br.senai.sp.Model;

import br.senai.sp.Aluno;
import br.senai.sp.Professor;

import java.util.Scanner;

public class Output {

    /** Imprime as informacoes do professor */
    public void PrintProfessor(Professor prof){

        System.out.println("-------------------------------------------------------");
        System.out.println("Bem-vindo Prof° " + prof.nome);
        System.out.printf("Você tem %d anos. Seu telefone é o %d.", prof.idade, prof.telefone);
        System.out.printf("\nSua especialidade é %s e você aplica a disciplina de %s", prof.especialidade, prof.disciplina);
        System.out.println("\n-------------------------------------------------------");

    }

    /** Imprime as informacoes do aluno */
    public void PrintAluno(Aluno objAluno){

        System.out.println("-------------------------------------------------------");
        System.out.printf("Nome: %s     Idade: %d\nFrequencia: %d\nNota 1: %.1f       Nota 2: %.1f", objAluno.nome, objAluno.idade, objAluno.frequencia, objAluno.nota1, objAluno.nota2);
        objAluno.Media();
        System.out.printf("\nA média dele foi: %.1f", objAluno.media);

    }
}
