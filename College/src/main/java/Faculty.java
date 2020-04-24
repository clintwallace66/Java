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

public class Faculty 
extends CollegeEmployee {

protected boolean isTenured;

public Faculty(boolean isTenured) {
this.isTenured = isTenured;
}

public Faculty(Scanner scan) {
setFacultyData(scan);
}

public Faculty() {
}

public Faculty(String staffId, double annualSalary, String departmentName, boolean isTenured) {
super(staffId, annualSalary, departmentName);
this.isTenured = isTenured;
}

public Faculty(String firstName, String lastName, String streetAddress, String postCode, String phoneNumber, String staffId, double annualSalary, String departmentName, boolean isTenured) {
super(firstName, lastName, streetAddress, postCode, phoneNumber, staffId, annualSalary, departmentName);
this.isTenured = isTenured;
}

public boolean isTenured() {
return isTenured;
}

public void setTenured(boolean isTenured) {
this.isTenured = isTenured;
}


@Override
public double getAnnualSalary() {
return super.getAnnualSalary();
}

@Override
public String getDepartmentName() {
return super.getDepartmentName();
}



@Override
public void setAnnualSalary(double annualSalary) {
super.setAnnualSalary(annualSalary);
}

@Override
public void setDepartmentName(String departmentName) {
super.setDepartmentName(departmentName);
}



@Override
public String toString() {
StringBuffer sb= new StringBuffer();
sb.append("Staff ID:").append(super.staffId);
sb.append("\n");
sb.append("Department:").append( super.departmentName);
sb.append("\n");
sb.append("Anual Salary:").append( super.annualSalary );
sb.append("\n");
sb.append("Is Tenured : ").append((isTenured() ? "Yes" : "NO"));
sb.append("\n");
sb.append("Employee details:");
sb.append("\n");
sb.append(super.firstName).append(" ");
sb.append(super.lastName).append(", ");
sb.append(super.streetAddress).append("-");
sb.append(super.postCode).append(", ");
sb.append("Ph:").append(super.phoneNumber);
return sb.toString();
}

public void setFacultyData(Scanner scan){

String next="";
System.out.println("Please enter employee id:");
next=scan.next();
this.setStaffId(next);
System.out.println("Please enter employee department:");
next=scan.next();
this.setDepartmentName(next);
System.out.println(" is employee tenured (y/n):");
next=scan.next();
if("yes".equalsIgnoreCase(next) ||"y".equalsIgnoreCase(next) ){
this.setTenured(true);
}else{
this.setTenured(false);
}

System.out.println("Please enter Faculty anual salary:");
this.setAnnualSalary(scan.nextDouble());
System.out.println("Please enter Faculty Details:");
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

