/*
 *
 * Classname: Rhombus
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

public class Rhombus extends Parallelogram {

    private int side;
    private double angle;

    public Rhombus() {

    }

    /*
     * Class constructor with parameters
     * @param side int, set the Rhombus side
     * @param angle int, set the Rhombus angle
     */
    public Rhombus(int side, double angle) {
        super(side, side, angle);
        this.side = side;
        this.angle = angle;
    }

    /*
     * Getter for field Rhombus side (implements from Parallelogram)
     * @return side of object Rhombus
     */
    @Override
    public int getSide() {
        return side;
    }

    /*
     * Setter for field Rhombus side (implements from Parallelogram)
     * @oaram side sets side of object Rhombus
     */
    @Override
    public void setSide(int side) {
        this.side = side;
    }

    /*
     * Getter for field Rhombus angle (implements from Parallelogram)
     * @return angle of object Rhombus
     */
    @Override
    public double getAngle() {
        return angle;
    }

    /*
     * Setter for field Rhombus angle (implements from Parallelogram)
     * @oaram angle sets angle of object Rhombus
     */
    @Override
    public void setAngle(double angle) {
        this.angle = angle;
    }

    // Method toString() for class Rhombus
    @Override
    public String toString() {
        return "Rhombus {" +
                "side=" + side +
                ", angle=" + angle +
                '}';
    }
}
