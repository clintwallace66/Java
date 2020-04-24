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

public class CollegeList {

private CollegeEmployee collegeEmployee[];
private Faculty faculty[];
private Student student[];

private int noOfStudents;
private int noOfEmployes;
private int noOffaculty;

private final int MAX_NO_OF_STUDENTS = 7 ;
private final int MAX_NO_OF_EMPLOYES = 4;
private final int MAX_NO_OF_FACULTY = 3;

public CollegeList(CollegeEmployee[] collegeEmployee, Faculty[] faculty, Student[] student) {

this.collegeEmployee = new CollegeEmployee[MAX_NO_OF_EMPLOYES];
this.faculty = new Faculty[MAX_NO_OF_FACULTY];
this.student = new Student[MAX_NO_OF_STUDENTS];

this.collegeEmployee = collegeEmployee;
this.faculty = faculty;
this.student = student;
this.noOfEmployes = collegeEmployee.length;
this.noOfStudents = student.length;
this.noOffaculty = faculty.length;
}

public int getNoOfEmployes() {
return noOfEmployes;
}

public void setNoOfEmployes(int noOfEmployes) {
this.noOfEmployes = noOfEmployes;
}

public int getNoOfStudents() {
return noOfStudents;
}

public void setNoOfStudents(int noOfStudents) {
this.noOfStudents = noOfStudents;
}

public int getNoOffaculty() {
return noOffaculty;
}

public void setNoOffaculty(int noOffaculty) {
this.noOffaculty = noOffaculty;
}

public CollegeList() {
this.collegeEmployee = new CollegeEmployee[MAX_NO_OF_EMPLOYES];
this.faculty = new Faculty[MAX_NO_OF_FACULTY];
this.student = new Student[MAX_NO_OF_STUDENTS];
this.noOfEmployes = 0;
this.noOfStudents = 0;
this.noOffaculty = 0;

}

public CollegeEmployee[] getCollegeEmployee() {
return collegeEmployee;
}

public void setCollegeEmployee(CollegeEmployee[] collegeEmployee) {
this.collegeEmployee = collegeEmployee;
}

public Faculty[] getFaculty() {
return faculty;
}

public void setFaculty(Faculty[] faculty) {
this.faculty = faculty;
}

public Student[] getStudent() {
return student;
}

public void setStudent(Student[] student) {
this.student = student;
}

public void addFaculty(Faculty faculty){

if(noOffaculty<MAX_NO_OF_FACULTY){
this.faculty[noOffaculty] = faculty;
noOffaculty++;
}else{
System.out.println("REACHED MAX NO OF FACULTY");
}
}

public void addCollegeEmployee(CollegeEmployee collegeEmployee){

if(noOfEmployes<MAX_NO_OF_EMPLOYES){
this.collegeEmployee[noOfEmployes] = collegeEmployee;
noOfEmployes++;
}else{
System.out.println("REACHED MAX NO OF EMPLOYES");
}
}
public void addStudent(Student student){
if(noOfStudents<MAX_NO_OF_STUDENTS){
this.student[noOfStudents] = student;
noOfStudents++;
}else{
System.out.println("REACHED MAX NO OF STUDENTS");
}
}

public static void VIEWGUI(){

System.out.println("Please select a option from below:");

System.out.println("C: VIEW Employee");
System.out.println("F : VIEW Faculty.");
System.out.println("S : VIEW Student");
System.out.println("B : To BACK");
System.out.println("Q : To Quit");

}

public static void INSERTGUI(){

System.out.println("Please select a option from below:");

System.out.println("C: Add Employee");
System.out.println("F : Add Faculty.");
System.out.println("S : Add Student");
System.out.println("B : To BACK");
System.out.println("Q : To Quit");

}

public static void GUI(){

System.out.println("Please select a option from below:");
System.out.println("I: Insert data");
System.out.println("D : Delete data");
System.out.println("V : View data");
System.out.println("Q : To Quit");


}


public static void main(String[] args){

CollegeList collegeList = new CollegeList();
Scanner scan = new Scanner(System.in);
String input = "";
do{

GUI();
input =scan.next();
if( "V".equalsIgnoreCase(input)){

VIEWGUI();
input =scan.next();
if( "F".equalsIgnoreCase(input)){
Faculty[] faculty = collegeList.getFaculty();
if(faculty.length==0){
System.out.println("No Faculy Available\n");
}
for(int i=0;i<collegeList.getNoOffaculty();i++){
System.out.println("\n");
faculty[i].toString();
System.out.println("\n\n");

}
}
if( "C".equalsIgnoreCase(input)){
CollegeEmployee[] emps = collegeList.getCollegeEmployee();

if(emps.length==0){
System.out.println("No Employee Available\n");
}
for(int i=0;i<collegeList.getNoOfEmployes();i++){
System.out.println("\n");
emps[i].toString();
System.out.println("\n\n");
}
}
if( "S".equalsIgnoreCase(input)){

Student[] students = collegeList.getStudent();
if(students.length==0){
System.out.println("No Students Available\n");
}
for(int i=0;i<collegeList.getNoOfStudents();i++){
System.out.println("\n");
students[i].toString();
System.out.println("\n\n");
}
}

}else if( ! "I".equalsIgnoreCase(input) && ! "Q".equalsIgnoreCase(input)){
System.out.println("THIS OPTION NOT YET IMPLEMENTED");
System.out.println("PLEASE SELECT I TO INSERT DATA");
}else{

INSERTGUI();
input =scan.next();
if("F".equalsIgnoreCase(input)){
collegeList.addStudent(new Student(scan));
}else if("C".equalsIgnoreCase(input)){
collegeList.addCollegeEmployee(new CollegeEmployee(scan));
}else if("S".equalsIgnoreCase(input)){
collegeList.addFaculty(new Faculty(scan));
}else if(!"Q".equalsIgnoreCase(input)){
System.out.println("IN valid Option Selected . Select vaid Action");
}
}
}while(!"Q".equalsIgnoreCase(input));

}



}

        