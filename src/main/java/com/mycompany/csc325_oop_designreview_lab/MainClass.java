/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {

	 	//create new Student instance
		Student std1= new Student("James", (short)20); //cast age parameter to short data type so that it matches the Student constructor

		//create new Freshman instance
		Student std2= new Freshman("Jim", (short)20, 12); // name, age, credits

	 	//create new Senior instance
	    Student std3 = new Senior("John", (short)30, 90); // name, age, credits

		//create new instance of Scanner
	    Scanner scanner = new Scanner(System.in);

		//alert user to input gpa
	 	System.out.println("Enter gpa for the student named " + std1.getName() + ":");
		 std1.setGpa(scanner.nextDouble()); //set the gpa of std1 to the value of the input

		 //alert user to input gpa
	 	System.out.println("Enter gpa for the student named " + std2.getName() + ":");
	 	std2.setGpa(scanner.nextDouble()); //set the gpa of std2 to the value of the input

	    //alert user to input gpa
	    System.out.println("Enter gpa for the student named " + std3.getName() + ":");
	    std3.setGpa(scanner.nextDouble()); //set the gpa of std3 to the value of the input

	 	//print out students data
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);



	}

}

