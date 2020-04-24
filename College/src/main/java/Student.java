/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clint
 */
import java.util.Scanner;

public class Student 
extends Person{

private String majorFieldOfStudy;
private Double gpa;

public Double getGpa() {
return gpa;
}

public void setGpa(Double gpa) {
this.gpa = gpa;
}

public String getMajorFieldOfStudy() {
return majorFieldOfStudy;
}

public void setMajorFieldOfStudy(String majorFieldOfStudy) {
this.majorFieldOfStudy = majorFieldOfStudy;
}

public Student(String firstName, String lastName, String streetAddress, String postCode, String phoneNumber, String majorFieldOfStudy, Double gpa) {
super(firstName, lastName, streetAddress, postCode, phoneNumber);
this.majorFieldOfStudy = majorFieldOfStudy;
this.gpa = gpa;
}

public Student(String majorFieldOfStudy, Double gpa) {
this.majorFieldOfStudy = majorFieldOfStudy;
this.gpa = gpa;
}

@Override
public String getFirstName() {
return super.getFirstName();
}

@Override
public String getLastName() {
return super.getLastName();
}

@Override
public String getPhoneNumber() {
return super.getPhoneNumber();
}

@Override
public String getPostCode() {
return super.getPostCode();
}

@Override
public String getStreetAddress() {
return super.getStreetAddress();
}

@Override
public void setFirstName(String firstName) {
super.setFirstName(firstName);
}

@Override
public void setLastName(String lastName) {
super.setLastName(lastName);
}

@Override
public void setPhoneNumber(String phoneNumber) {
super.setPhoneNumber(phoneNumber);
}

@Override
public void setPostCode(String postCode) {
super.setPostCode(postCode);
}

@Override
public void setStreetAddress(String streetAddress) {
super.setStreetAddress(streetAddress);
}

@Override
public String toString() {
StringBuffer sb= new StringBuffer();
sb.append("\n Major Field Of Study : ").append(this.majorFieldOfStudy).append(", ");
sb.append("\nGPA :").append(this.gpa).append("\n ");
sb.append("Student details :").append("\n ");
sb.append(this.firstName).append(" ");
sb.append(this.lastName).append(", ");
sb.append(this.streetAddress).append("-");
sb.append(this.postCode).append(", ");
sb.append("Ph:").append(this.phoneNumber);
return sb.toString();
}


public void setStudentData(Scanner scan){

String next="";

System.out.println("Please enter Student Details:");
System.out.println("Please enter first name:");
next=scan.next();
this.setFirstName(next);
System.out.println("Please enter last name:");
next=scan.next();
this.setLastName(next);
System.out.println("Please enter street address:");
next=scan.next();
this.setStreetAddress(next);
System.out.println("Please enter postcode:");
next=scan.next();
this.setPostCode(next);
System.out.println("Please enter phone number:");
next=scan.next();
this.setPhoneNumber(next);
System.out.println("Please enter Student majorFieldOfStudy:");
next=scan.next();
this.setMajorFieldOfStudy(next);
System.out.println("Please enter Student GPA:");
this.setGpa(scan.nextDouble());

}

public Student() {
}

public Student(Scanner scan) {
setStudentData(scan);
}





}
