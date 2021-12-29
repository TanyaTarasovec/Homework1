package com.company;

import human.IHuman;
import human.Person;
import stadium.Chempion;
import stadium.Stadium;

public class Executor {

    public static void main(String[] args) {
        Stadium stadium = new Stadium();
        Chempion unit = stadium;

        Person person = new Person();
        IHuman unit1 = person;

        System.out.println("Play football");
        System.out.println("Run afr=ter the ball");
    }
}
