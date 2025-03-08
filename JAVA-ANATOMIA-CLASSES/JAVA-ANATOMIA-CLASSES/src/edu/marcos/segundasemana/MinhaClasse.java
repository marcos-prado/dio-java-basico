package edu.marcos.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Joao";
        String segundoNome = "Silva";
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto (String primeiroNome,String segundoNome){
        return primeiroNome + " " + segundoNome;
    }
}
