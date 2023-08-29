package br.senai.sp.Model;

import br.senai.sp.Aluno;
import br.senai.sp.Professor;

public class Output {

    public void PrintProfessor(Professor prof){

        /** Imprime as informacoes */
        System.out.println("-------------------------------------------------------");
        System.out.println("Bem-vindo Prof° " + prof.nome);
        System.out.printf("Você tem %d anos. Seu telefone é o %d.", prof.idade, prof.telefone);
        System.out.printf("\nSua especialidade é %s e você aplica a disciplina de %s", prof.especialidade, prof.disciplina);
        System.out.println("\n-------------------------------------------------------");

    }

    public void PrintAluno(Aluno objAluno){

        /** Imprime as informacoes do aluno */
        System.out.println("-------------------------------------------------------");
        System.out.printf("Nome: %s     Idade: %d\nFrequencia: %d\nNota 1: %.1f       Nota 2: %.1f", objAluno.nome, objAluno.idade, objAluno.frequencia, objAluno.nota1, objAluno.nota2);
        objAluno.media = (objAluno.nota1+ objAluno.nota2)/2;
        System.out.printf("\nA média dele foi: %.1f", objAluno.media);

    }
}
