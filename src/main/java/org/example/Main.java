package org.example;

public class Main {

//    public static class Person {
//        String firstName;
//        String lastName;
//        int age;
//        int weight;
//        int length;
//        String gender;
//
//        public Person(String firstName, String lastName, int age) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.age = age;
//        }
//
//        public Person(String firstName, String lastName, int age, int weight, int length) {
//            this(firstName, lastName, age);
//            this.weight = weight;
//            this.length = length;
//        }
//
//        public String getFirstName() {
//            return firstName;
//        }
//
//        public String getLastName() {
//            return lastName;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public boolean isTeen() {
//            return age > 13 && age < 19;
//        }
//        public String toString(){
//            return firstName + " " + lastName +" " + age;
//        }
//
//    }

//    public static class Wall {
//        double width;
//        double height;
//
//        public Wall(double width, double height){
//        this.width= width;
//        this.height = height;
//        }
//        public double getWidth (){
//            return width;
//        }
//        public double getHeight (){
//            return height;
//        }
//
//        public double setWidth (double width){
//            if(width < 0){
//               return this.width=0;
//            }else return this.width=width;
//
//        }
//        public double setHeight (double height){
//            if(height < 0){
//                return this.height=0;
//            }else return this.height=height;
//        }
//        public double getArea(){
//            return this.width*this.height;
//        }
//}


    public static void main(String[] args) {
       Person person = new Person("John", "Doe", 20);
        System.out.println(person);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("Age: " + person.getAge());
        System.out.println("*************************");
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}
