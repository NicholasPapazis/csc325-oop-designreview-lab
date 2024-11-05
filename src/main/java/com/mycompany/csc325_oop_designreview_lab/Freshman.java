package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{


    //constructor
    public Freshman(String name, short age, int credits) {
        super(name, age, credits); //calls constructor of parent class

    }

    //toString method
    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nGPA: " + this.getGpa() + "\nCredits: " + this.getCredits() + "\n";
    }



}
