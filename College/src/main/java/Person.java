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

public class Person {

protected String firstName;
protected String lastName;
protected String streetAddress;
protected String postCode;
protected String phoneNumber;

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getPhoneNumber() {
return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

public String getPostCode() {
return postCode;
}

public void setPostCode(String postCode) {
this.postCode = postCode;
}

public String getStreetAddress() {
return streetAddress;
}

public void setStreetAddress(String streetAddress) {
this.streetAddress = streetAddress;
}

public Person() {
}

public Person(Scanner scan) {
setPersonData(scan);
}

public Person(String firstName, String lastName, String streetAddress, String postCode, String phoneNumber) {
this.firstName = firstName;
this.lastName = lastName;
this.streetAddress = streetAddress;
this.postCode = postCode;
this.phoneNumber = phoneNumber;
}


public String toString() {

StringBuffer sb= new StringBuffer();
sb.append(this.firstName).append(", ");
sb.append(this.lastName).append(", ");
sb.append(this.streetAddress).append("-");
sb.append(this.postCode).append(", ");
sb.append("Ph:").append(this.phoneNumber);
return sb.toString();
}

public void setPersonData(Scanner scan){

String next="";
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
}


}
