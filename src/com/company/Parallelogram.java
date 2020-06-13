/*
 *
 * Classname: Parallelogram
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

public class Parallelogram {

    private int sideA;
    private int sideB;
    private double angle;

    // default empty constructor
    public Parallelogram() {
    }

    /*
    * Class constructor with parameters
    * @param sideA int, set the Paralelogram side A
    * @param sideB int, set the Paralelogram side B
    * @param angle int, set the Paralelogram angle
    */
    public Parallelogram(int sideA, int sideB, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    /*
     * Getter for field Paralelogram sideA
     * @return sideA of object Paralelogram
     */
    public int getSideA() {
        return sideA;
    }

    /*
     * Setter for field Paralelogram sideA
     * @oaram sideA sets side A of object Paralelogram
     */
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    /*
     * Getter for field Paralelogram sideB
     * @return sideB of object Paralelogram
     */
    public int getSideB() {
        return sideB;
    }

    /*
     * Setter for field Paralelogram sideB
     * @oaram sideB sets side B of object Paralelogram
     */
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    /*
     * Getter for field Paralelogram angle
     * @return angle of object Paralelogram
     */
    public double getAngle() {
        return angle;
    }

    /*
     * Setter for field Paralelogram angle
     * @oaram angle sets angle of object Paralelogram
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }


    // Method toString() for class Paralelogram
    @Override
    public String toString() {
        return "Parallelogram{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", angle=" + angle +
                '}';
    }
}