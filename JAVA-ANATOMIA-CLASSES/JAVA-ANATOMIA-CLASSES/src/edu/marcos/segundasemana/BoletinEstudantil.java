package edu.marcos.segundasemana;

public class BoletinEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 8;
        if (mediaFinal < 6 ) {
            System.out.println("\n Reprovado");
        } else if(mediaFinal == 6){
            System.out.println("\n Prova de Minerva");
        } else {
            System.out.println("\n Aprovado");

        }
    }
}
