/*
 *
 * Classname: Main
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

public class Main {

    public static void main(String[] args) {

    // Paralelogram Factory

        Parallelogram parallelogram1 = ParallelogramFactory.create(5,6,Math.PI / 3);
        System.out.println(parallelogram1);

    // Abstract Paralelogram Factory

        Parallelogram pr1 = AbstractFactoryParallelogram.create(4,4,Math.PI /4);
        System.out.println(pr1);

    // Student

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
                21);

        System.out.println(student);

    // Student Artem Builder

        Student Artem = new Student.Builder()
                .setFirstName("Artem")
                .setLastName("Ushenko")
                .setPatronymic("Bohdanovich")
                .setFirstNameTeacher("Posupevskiy")
                .setLastNameTeacher("Viktor")
                .setPatronymicTeacher("Ihorovich")
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

        System.out.println(Artem);

    // Student Oleg is similar to Artem except the First Name and Last name

        Student Oleg = new Student.Builder()
                .setSimilarTo(Artem)
                .setFirstName("Oleg")
                .setLastName("Boyko")
                .build();

        System.out.println(Oleg);

    }
}
