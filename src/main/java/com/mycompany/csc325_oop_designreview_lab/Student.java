/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{

    //private field for gpa
    private double gpa;
    //private field for credits
    private int credits;

    //constructor with 2 parameters
    public Student(String name, short age) {
        super(name, age);
    }

    //constructor with 3 parameters
    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    //address getter
    @Override
    public String getAddress() {
        return "";
    }

    //address setter
    @Override
    public void setAddress(String address) {
        //nothing to do here
    }

    //gpa getter
    public double getGpa() {
        return gpa;
    }

    //gpa setter
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //credits getter
    public int getCredits() {
        return this.credits;
    }

    //credits setter
    public void setCredits(int credits) {
        this.credits = credits;
    }

    //toString method
    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nGPA: " + this.getGpa() + "\nCredits: " + this.getCredits() + "\n";
    }

}
