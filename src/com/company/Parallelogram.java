/*
 *
 * Classname: Parallelogram
 *
 * @version 12.06.2020
 * @author Vladyslav Zaichenko

 * Module 2 task 4
 *
 * Programming patterns. Factory, Builder.
 *
 * Develop for your class
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student - 25 fields.
 * 4. Create a builder for the class Student
 *
 */

package com.company;

public class Parallelogram {

    private int sideA;
    private int sideB;
    private double angle;

    public Parallelogram() {

    }

    /*
    * Class constructor with parameters
    * @param sideA int, set the Parallelogram side A
    * @param sideB int, set the Parallelogram side B
    * @param angle int, set the Parallelogram angle
    */
    public Parallelogram(int sideA, int sideB, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    /*
     * Getter for field Parallelogram sideA
     * @return sideA of object Parallelogram
     */
    public int getSide() {
        return sideA;
    }

    /*
     * Setter for field Parallelogram sideA
     * @oaram sideA sets side A of object Parallelogram
     */
    public void setSide(int side) {
        this.sideA = side;
    }

    /*
     * Getter for field Parallelogram sideB
     * @return sideB of object Parallelogram
     */
    public int getSideB() {
        return sideB;
    }

    /*
     * Setter for field Parallelogram sideB
     * @oaram sideB sets side B of object Parallelogram
     */
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    /*
     * Getter for field Parallelogram angle
     * @return angle of object Parallelogram
     */
    public double getAngle() {
        return angle;
    }

    /*
     * Setter for field Parallelogram angle
     * @oaram angle sets angle of object Parallelogram
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    // Method toString() for class Parallelogram
    @Override
    public String toString() {
        return "Parallelogram {" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", angle=" + angle +
                '}';
    }
}