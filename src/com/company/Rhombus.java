/*
 *
 * Classname: Rhombus
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

public class Rhombus extends Parallelogram {

    private int sideA;
    private double angle;

    public Rhombus() {
    }

    public Rhombus(int sideA, double angle) {
        super(sideA, sideA, angle);
        this.sideA = sideA;
        this.angle = angle;
    }

    @Override
    public int getSideA() {
        return sideA;
    }

    @Override
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getAngle() {
        return angle;
    }

    @Override
    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "sideA=" + sideA +
                ", angle=" + angle +
                '}';
    }
}
