package com.company.classes;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int idNumber;
    private String type;

    public Person() {
    }


    public Person(String name, String surname, int age, int idNumber, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.idNumber = idNumber;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", idNumber=" + idNumber +
                ", type='" + type + '\'' +
                '}';
    }
}
