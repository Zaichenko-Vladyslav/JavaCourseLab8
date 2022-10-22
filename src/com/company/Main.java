/*
 *
 * Classname: Main
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

public class Main {

    public static void main(String[] args) {

        // Parallelogram Factory
        Parallelogram parallelogram1 = ParallelogramFactory.create(5,6,Math.PI / 3);
        System.out.println(parallelogram1);

        // Abstract Parallelogram Factory
        Parallelogram parallelogram2 = AbstractFactoryParallelogram.create(4,4,Math.PI /4);
        System.out.println(parallelogram2);

        // Student
        Student student = new Student("Zaichenko",
                "Vladyslav",
                "-",
                "-",
                "-",
                "-",
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
                21);

        System.out.println(student);

        // Student Artem Builder
        Student artem = new Student.Builder()
                .setFirstName("Artem")
                .setLastName("-")
                .setPatronymic("-")
                .setFirstNameTeacher("-")
                .setLastNameTeacher("Viktor")
                .setPatronymicTeacher("-")
                .setUniversity("KNUTE")
                .setSpeciality(Speciality.GUI)
                .setPrivilege(true)
                .setCourse(4)
                .setContract(false)
                .setFullTimeEducation(false)
                .setMilitaryDepartment(false)
                .setDepartmentOfSports(true)
                .setScientificWork(false)
                .setActivist(false)
                .setDriverLicense(true)
                .setChummery(false)
                .setGender(Gender.MALE)
                .setNationality("ukrainian")
                .setEyeColor("black")
                .setHairColor("black")
                .setHeight(176)
                .setWeight(90)
                .setAge(23)
                .build();

        System.out.println(artem);

        // Student Oleg is similar object to Artem except First Name and Last name
        Student Oleg = new Student.Builder()
                .setSimilarTo(artem)
                .setFirstName("Oleg")
                .setLastName("-")
                .build();

        System.out.println(Oleg);
    }
}
