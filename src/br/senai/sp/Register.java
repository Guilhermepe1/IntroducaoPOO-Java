package br.senai.sp;

import br.senai.sp.Model.Output;

import java.util.Scanner;

public class Register {

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);
    /** Instancia Professor */
    Professor objProfessor = new Professor();
    /** Instancia Aluno */
    Aluno objAluno = new Aluno();
    /** Instancia Output */
    Output outuput = new Output();


    public void Registra() {

        /** Cria variavel para laco de repeticao */
        Boolean repete = true;

        /** Instancia Register */
        Register register = new Register();

        /** Laco de repeticao que permite escolha do usuario */
        while (repete) {
            System.out.println("\n-------------------------------------------------------");
            System.out.println("Escolha uma opção\n1 - Professor\n2 - Aluno\n3 - Ambos\n4 - Sair");
            System.out.println("Digite sua escolha: ");
            int escolha = teclado.nextInt();
            System.out.println("-------------------------------------------------------");

            switch (escolha) {
                case 1:
                    register.RegisterProf();
                    break;
                case 2:
                    register.RegisterAluno();
                    break;
                case 3:
                    register.RegisterProf();
                    register.RegisterAluno();
                    break;
                case 4:
                    repete = false;
            }
        }
    }

    public void RegisterProf() {

        /** Coleta dados */
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

        /** Imprime as informacoes */
        outuput.PrintProfessor(objProfessor);
    }

    public void RegisterAluno() {

        /** Coleta dados do aluno */
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

        /** Imprime as informacoes do aluno */
        outuput.PrintAluno(objAluno);
    }
}
