package com.hillel.homework;

public class Homework11 {
    public static void main(String[] args) {

    class Person {
        public String personInfo(String name, String surname, String city, String phone) {
            return "Зателефонувати громадянину " + name + " " + surname + " із міста " + city + " можна за номером " + phone;
        }
    }
            Person person1 = new Person();
            Person person2 = new Person();
            Person person3 = new Person();
            System.out.println(person1.personInfo("Will", "Smith", "New York", "2936729462846"));
            System.out.println(person2.personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
            System.out.println(person3.personInfo("Sherlock", "Holmes", "London", "37742123513"));
        }
    }