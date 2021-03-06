package ru.innolearn.day02.comparables;

/**
 * Created by marina on 06.12.2016.
 *
 * Переопределяем equals() и hashCode()
 */
public class Main extends Object {
    public static void main(String[] args) {
        A a = new A();
        a.x = 1;

        A b = new A();
        b.x = 1;

        A c = new A();
        c.x = 100;

        System.out.println("T006.x : " + a.x);
        System.out.println("b.x : " + b.x);
        System.out.println("c.x : " + c.x);
        System.out.println("T006 == b : " + (a == b));
        System.out.println("T006.equals(b) : " + a.equals(b));
        System.out.println("T006.compareTo(b) : " + a.compareTo(b));
        System.out.println("T006.compareTo(c) : " + a.compareTo(c));
    }

}

