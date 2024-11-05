package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{



    //constructor with three parameters
    public Senior(String name, short age, int credits) {
        super(name, age, credits);
        //checks if credits are less than 85
        if(credits < 85)
        {
            throw new IllegalArgumentException("seniors should have a minimum of 85 credits"); //throws exception if credits are less than 85
        }
    }

    //toString method
    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nGPA: " + this.getGpa() + "\nCredits: " + this.getCredits() + "\n";
    }


}
