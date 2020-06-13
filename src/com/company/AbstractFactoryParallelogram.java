/*
 *
 * Classname: AbstractFactoryParallelogram
 *
 * Version 2.0
 *
 * 12 June 2020
 *
 * Copyright Zaichenko Vladyslav KNUTE
 *
 * Author Zaichenko Vladyslav
 *
 * Module 2 task 4
 *
 * Programming patterns. Factory, Builder.
 *
 * Develop for your class
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4. Create a builder for the class Student
 *
 */

package com.company;

public class AbstractFactoryParallelogram {

    /*
     * AbstractFactoryParallelogram with parameters
     * @param sideA int, set the Paralelogram or Rhombus side A
     * @param sideB int, set the Paralelogram side B
     * @param angle int, set the Paralelogram or Rhombus angle
     */
    public static Parallelogram create(int sideA, int sideB, double angle){
        if (sideA == sideB ) {return
                new Rhombus (sideA, angle);
        } else return
                new Parallelogram(sideA, sideB, angle);

    }
}