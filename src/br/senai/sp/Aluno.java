package br.senai.sp;

public class Aluno {
    /** Declara variaveis */
    public String nome;
    public int idade, frequencia;
    public float nota1, nota2 = 0;
    public float media;

    /** Calcula media */
    public void Media(){
        media = (nota1+nota2)/2;
    }
}
