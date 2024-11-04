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

    //private field for GPA
    private double gpa;

	//constructor
    public Student (String name, short age)
    {
        super(name, age); //calls the parent class constructor, which in this case is the Human class constructor.
    }

    //address getter
    @Override
    public String getAddress() {
        return "";
    }

    //address setter
    @Override
    public void setAddress(String address) {

    }

    //gpa getter
    public double getGpa(){
        return gpa;
    }


}
