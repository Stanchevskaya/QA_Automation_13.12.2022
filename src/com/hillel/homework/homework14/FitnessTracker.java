package com.hillel.homework.homework14;

import java.time.LocalDate;

    class FitnessTracker {
        private final String name;
        private final LocalDate birthdate;
        private final String email;
        private final String phone;
        private String surname;
        private double weight;
        private double bloodPressure;
        private int steps;
        private int age;

        public FitnessTracker(String name, LocalDate birthdate, String email, String phone, String surname, double weight, double bloodPressure, int steps) {
            this.name = name;
            this.birthdate = birthdate;
            this.email = email;
            this.phone = phone;
            this.surname = surname;
            this.weight = weight;
            this.bloodPressure = bloodPressure;
            this.steps = steps;
            this.age = LocalDate.now().getYear() - birthdate.getYear();
        }

        public String getName() {
            return name;
        }

        public LocalDate getBirthdate() {
            return birthdate;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getBloodPressure() {
            return bloodPressure;
        }

        public void setBloodPressure(double bloodPressure) {
            this.bloodPressure = bloodPressure;
        }

        public int getSteps() {
            return steps;
        }

        public void setSteps(int steps) {
            this.steps = steps;
        }

        public int getAge() {
            return age;
        }

        public void printAccountInfo() {
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Birthdate: " + birthdate);
            System.out.println("Age: " + age);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
            System.out.println("Weight: " + weight);
            System.out.println("Blood Pressure: " + bloodPressure);
            System.out.println("Steps: " + steps);
        }
    }

