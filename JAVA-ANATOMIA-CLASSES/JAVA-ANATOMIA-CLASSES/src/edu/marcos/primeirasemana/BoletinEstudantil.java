package edu.marcos.primeirasemana;

public class BoletinEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6 ) {
            System.out.println("Reprovado");
        } else if(mediaFinal == 6){
            System.out.println("Prova de Minerva");
        } else {
            System.out.println("Aprovado");

        }
    }
}
