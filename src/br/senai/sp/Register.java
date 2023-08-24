package br.senai.sp;

import java.util.Scanner;

public class Register {

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Professor */
    Professor objProfessor = new Professor();

    /** Instancia Aluno */
    Aluno objAluno = new Aluno();


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
        System.out.println("-------------------------------------------------------");
        System.out.println("Bem-vindo Prof° " + objProfessor.nome);
        System.out.printf("Você tem %d anos. Seu telefone é o %d.", objProfessor.idade, objProfessor.telefone);
        System.out.printf("\nSua especialidade é %s e você aplica a disciplina de %s", objProfessor.especialidade, objProfessor.disciplina);
        System.out.println("\n-------------------------------------------------------");
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
        System.out.println("-------------------------------------------------------");
        System.out.printf("Nome: %s     Idade: %d\nFrequencia: %d\nNota 1: %.1f       Nota 2: %.1f", objAluno.nome, objAluno.idade, objAluno.frequencia, objAluno.nota1, objAluno.nota2);
        objAluno.media = (objAluno.nota1+ objAluno.nota2)/2;
        System.out.printf("\nA média dele foi: %.1f", objAluno.media);

    }
}
