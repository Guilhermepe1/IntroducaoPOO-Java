package br.senai.sp;

import br.senai.sp.Model.Input;
import br.senai.sp.Model.Output;

public class Register {

    /** Instancia Professor */
    Professor objProfessor = new Professor();
    /** Instancia Aluno */
    Aluno objAluno = new Aluno();
    /** Instancia Output */
    Output outuput = new Output();
    /** Instancia Input */
    Input recebe = new Input();

    /** Funcao para registrar Professor e Aluno */
    public void Registra() {

        /** Cria variavel para laco de repeticao */
        Boolean repete = true;

        /** Laco de repeticao que permite escolha do usuario */
        while (repete) {
            /** Executa o menu */
            recebe.Menu();
            /** Define execucao de acordo com a escolha do usuario */
            switch (recebe.escolha) {
                case 1:
                    RegisterProf();
                    break;
                case 2:
                    RegisterAluno();
                    break;
                case 3:
                    RegisterProf();
                    RegisterAluno();
                    break;
                case 4:
                    repete = false;
            }
        }
    }

    /** Executa registro de professor */
    public void RegisterProf() {

        /** Coleta dados */
        recebe.ColetaProfessor(objProfessor);

        /** Imprime as informacoes */
        outuput.PrintProfessor(objProfessor);
    }

    /** Executa registro de aluno */
    public void RegisterAluno() {

        /** Coleta dados do aluno */
        recebe.ColetaAluno(objAluno);

        /** Imprime as informacoes do aluno */
        outuput.PrintAluno(objAluno);
    }
}
