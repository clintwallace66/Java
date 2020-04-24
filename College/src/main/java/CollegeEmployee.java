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

public class CollegeEmployee 
extends Person {

protected String staffId;
protected double annualSalary;
protected String departmentName;

public double getAnnualSalary() {
return annualSalary;
}

public void setAnnualSalary(double annualSalary) {
this.annualSalary = annualSalary;
}

public String getDepartmentName() {
return departmentName;
}

public void setDepartmentName(String departmentName) {
this.departmentName = departmentName;
}

public String getStaffId() {
return staffId;
}

public void setStaffId(String staffId) {
this.staffId = staffId;
}

public CollegeEmployee(String firstName, String lastName, String streetAddress, String postCode, String phoneNumber, String staffId, double annualSalary, String departmentName) {
super(firstName, lastName, streetAddress, postCode, phoneNumber);
this.staffId = staffId;
this.annualSalary = annualSalary;
this.departmentName = departmentName;
}

public CollegeEmployee(String staffId, double annualSalary, String departmentName) {
this.staffId = staffId;
this.annualSalary = annualSalary;
this.departmentName = departmentName;
}

@Override
public String toString() {
StringBuffer sb= new StringBuffer();
sb.append("Staff ID:").append(this.staffId);
sb.append("\n");
sb.append("Department:").append( this.departmentName);
sb.append("\n");
sb.append("Anual Salary:").append( this.annualSalary );
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

public CollegeEmployee() {

}
public CollegeEmployee(Scanner scan) {
setCollegeEmployeeData( scan);
}

public void setCollegeEmployeeData(Scanner scan){

String next="";
System.out.println("Please enter employee id:");
next=scan.next();
this.setStaffId(next);
System.out.println("Please enter employee department:");
next=scan.next();
this.setDepartmentName(next);
System.out.println("Please enter employee anual salary:");
this.setAnnualSalary(scan.nextDouble());
System.out.println("Please enter employee Details:");
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