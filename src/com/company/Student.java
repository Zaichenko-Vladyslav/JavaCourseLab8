package com.company;

import java.time.LocalDate;

public class Student {

    private String firstName;
    private String lastName;
    private String patronymic;
    private String firstNameTeacher;
    private String lastNameTeacher;
    private String patronymicTeacher;
    private String university;
    private Speciality speciality;
    private boolean privilege;
    private int course;
    private boolean contract;
    private boolean fullTimeEducation;
    private boolean militaryDepartment;
    private boolean departmentOfSports;
    private boolean scientificWork;
    private boolean activist;
    private boolean driverLicense;
    private boolean chummery;
    private Gender gender;
    private String nationality;
    private String eyeColor;
    private String hairColor;
    private int weight;
    private int height;
    private int age;

    public Student(String firstName,
                   String lastName,
                   String patronymic,
                   String firstNameTeacher,
                   String lastNameTeacher,
                   String patronymicTeacher,
                   String university,
                   Speciality speciality,
                   boolean privilege,
                   int course,
                   boolean contract,
                   boolean fullTimeEducation,
                   boolean militaryDepartment,
                   boolean departmentOfSports,
                   boolean scientificWork,
                   boolean activist,
                   boolean driverLicense,
                   boolean chummery,
                   Gender gender,
                   String nationality,
                   String eyeColor,
                   String hairColor,
                   int weight,
                   int height,
                   int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.firstNameTeacher = firstNameTeacher;
        this.lastNameTeacher = lastNameTeacher;
        this.patronymicTeacher = patronymicTeacher;
        this.university = university;
        this.speciality = speciality;
        this.privilege = privilege;
        this.course = course;
        this.contract = contract;
        this.fullTimeEducation = fullTimeEducation;
        this.militaryDepartment = militaryDepartment;
        this.departmentOfSports = departmentOfSports;
        this.scientificWork = scientificWork;
        this.activist = activist;
        this.driverLicense = driverLicense;
        this.chummery = chummery;
        this.gender = gender;
        this.nationality = nationality;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFirstNameTeacher() {
        return firstNameTeacher;
    }

    public void setFirstNameTeacher(String firstNameTeacher) {
        this.firstNameTeacher = firstNameTeacher;
    }

    public String getLastNameTeacher() {
        return lastNameTeacher;
    }

    public void setLastNameTeacher(String lastNameTeacher) {
        this.lastNameTeacher = lastNameTeacher;
    }

    public String getPatronymicTeacher() {
        return patronymicTeacher;
    }

    public void setPatronymicTeacher(String patronymicTeacher) {
        this.patronymicTeacher = patronymicTeacher;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public boolean isPrivilege() {
        return privilege;
    }

    public void setPrivilege(boolean privilege) {
        this.privilege = privilege;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isContract() {
        return contract;
    }

    public void setContract(boolean contract) {
        this.contract = contract;
    }

    public boolean isFullTimeEducation() {
        return fullTimeEducation;
    }

    public void setFullTimeEducation(boolean fullTimeEducation) {
        this.fullTimeEducation = fullTimeEducation;
    }

    public boolean isMilitaryDepartment() {
        return militaryDepartment;
    }

    public void setMilitaryDepartment(boolean militaryDepartment) {
        this.militaryDepartment = militaryDepartment;
    }

    public boolean isDepartmentOfSports() {
        return departmentOfSports;
    }

    public void setDepartmentOfSports(boolean departmentOfSports) {
        this.departmentOfSports = departmentOfSports;
    }

    public boolean isScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(boolean scientificWork) {
        this.scientificWork = scientificWork;
    }

    public boolean isActivist() {
        return activist;
    }

    public void setActivist(boolean activist) {
        this.activist = activist;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public boolean isChummery() {
        return chummery;
    }

    public void setChummery(boolean chummery) {
        this.chummery = chummery;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "First Name - '" + firstName + '\'' + "\n" +
                "Last Name - '" + lastName + '\'' + "\n" +
                "Patronymic - '" + patronymic + '\'' + "\n" +
                "First name teacher - '" + firstNameTeacher + '\'' + "\n" +
                "Last name teacher - '" + lastNameTeacher + '\'' + "\n" +
                "Patronymic teacher - '" + patronymicTeacher + '\'' + "\n" +
                "University - '" + university + '\'' + "\n" +
                "Speciality - " + speciality + "\n" +
                "Privilege - " + privilege + "\n" +
                "Course - " + course + "\n" +
                "Contract - " + contract + "\n" +
                "Full Time Education - " + fullTimeEducation + "\n" +
                "Military Department - " + militaryDepartment + "\n" +
                "Department Of Sports - " + departmentOfSports + "\n" +
                "Scientific Work - " + scientificWork + "\n" +
                "Activist - " + activist + "\n" +
                "Driver License - " + driverLicense + "\n" +
                "Chummery - " + chummery + "\n" +
                "Gender - " + gender + "\n" +
                "Nationality - '" + nationality + '\'' + "\n" +
                "Eye Color - '" + eyeColor + '\'' + "\n" +
                "Hair Color - '" + hairColor + '\'' + "\n" +
                "Weight - " + weight + "\n" +
                "Height - " + height + "\n" +
                "Age - " + age +
                '}';
    }
}
