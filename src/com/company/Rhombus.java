/*
 *
 * Classname: Rhombus
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

public class Rhombus extends Parallelogram {

    private int sideA;
    private double angle;

    // default empty constructor
    public Rhombus() {
    }

    /*
     * Class constructor with parameters
     * @param sideA int, set the Rhombus side A
     * @param angle int, set the Rhombus angle
     */
    public Rhombus(int sideA, double angle) {
        super(sideA, sideA, angle);
        this.sideA = sideA;
        this.angle = angle;
    }

    /*
     * Getter for field Rhombus sideA (implements from Paralelogram)
     * @return sideA of object Rhombus
     */
    @Override
    public int getSideA() {
        return sideA;
    }

    /*
     * Setter for field Rhombus sideA (implements from Paralelogram)
     * @oaram sideA sets side A of object Rhombus
     */
    @Override
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    /*
     * Getter for field Rhombus angle (implements from Paralelogram)
     * @return angle of object Rhombus
     */
    @Override
    public double getAngle() {
        return angle;
    }

    /*
     * Setter for field Rhombus angle (implements from Paralelogram)
     * @oaram angle sets angle of object Rhombus
     */
    @Override
    public void setAngle(double angle) {
        this.angle = angle;
    }

    // Method toString() for class Rhombus
    @Override
    public String toString() {
        return "Rhombus{" +
                "sideA=" + sideA +
                ", angle=" + angle +
                '}';
    }
}
