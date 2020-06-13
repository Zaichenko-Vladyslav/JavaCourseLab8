/*
 *
 * Classname: ParallelogramFactory
 *
 * 12 June 2020
 *
 * Copyright Zaichenko Vladyslav KNUTE
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

public class ParallelogramFactory {

        /*
         * ParallelogramFactory with parameters
         * @param sideA int, set the Paralelogram side A
         * @param sideB int, set the Paralelogram side B
         * @param angle int, set the Paralelogram angle
         */
        public static Parallelogram create(int sideA, int sideB, double angle){

            Parallelogram parellelogram = new Parallelogram(sideA,sideB,angle);

            return parellelogram;

        }
}
