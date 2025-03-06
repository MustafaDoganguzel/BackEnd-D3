package org.example;

public class Person {
        String firstName;
        String lastName;
        int age;
        int weight;
        int length;
        String gender;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person(String firstName, String lastName, int age, int weight, int length) {
            this(firstName, lastName, age);
            this.weight = weight;
            this.length = length;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public boolean isTeen() {
            return age >= 13 && age <= 19;
        }
        public String toString(){
            return firstName + " " + lastName +" " + age;
        }

    }


