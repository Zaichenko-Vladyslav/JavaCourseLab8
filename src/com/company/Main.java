/*
 *
 * Classname: Main
 *
 * 09 June 2020
 *
 * Copyright Zaichenko Vladyslav KNUTE
 *
 * Module 2 task 3
 *
 * Programming patterns. Factory, Builder.
 *
 * Develop for your class
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4.  Create a builder for the class Student
 *
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        Parallelogram parallelogram1 = ParallelogramFactory.create(5,6,Math.PI / 3);
        System.out.println(parallelogram1);

        Parallelogram pr1 = AbstractFactoryParallelogram.create(4,4,Math.PI /4);
        System.out.println(pr1);

        Student student;
        student = new Student("Zaichenko",
                "Vladyslav",
                "Yurievich",
                "Roskladka",
                "Andriy",
                "Anatolievich",
                "KNUTE",
                Speciality.NETWORKS,
                false,
                5,
                false,
                true,
                false,
                true,
                true,
                true,
                true,
                true,
                Gender.MALE,
                "ukrainian",
                "blue",
                "white",
                85,
                190,
                21


                );
        System.out.println(student);

    }
}
