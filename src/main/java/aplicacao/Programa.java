package aplicacao;

import dominio.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@dasilva.com.br");
        Pessoa p2 = new Pessoa(2, "Joaquim Torres", "joaquim@torres.com.br");
        Pessoa p3 = new Pessoa(3, "Ana Maria", "ana@maria.com.br");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
