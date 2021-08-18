package application;

import entities.Cliente;

public class Program {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Maria", "Maria@gmail.com");
        Cliente c2 = new Cliente("Maria","Maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));// .equals compara objeto pelo conteúdo
        System.out.println(c1 == c2);//== compara objeto pela memoria

        String a = "Maria";
        String b = "Maria";
        System.out.println(a == b);//Neste caso  apesar dos objetos serem dferentes o compilador
        // trata a expressão literal de uma forma especial.

        //Porém se escrever da forma abaixo ele força a criação de um novo objeto
        String c =  new String("Letra C");
        String d = new String("Letra D");
        System.out.println(c == d);

    }
}
