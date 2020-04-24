# Java College Information Project
The program develops a set of classes for a college to use in various student service and personnel applications. Classes that are designed include the following:

1.Person—A Person contains a first name, last name, street address, zip code, and phone number. The class also includes a method that sets each data field, using a series of dialog boxes and a display method that displays all of a Person’s information on a single line at the command line on the screen.

2.CollegeEmployee—CollegeEmployee descends from Person. A CollegeEmployee also includes a Social Security number, an annual salary, and a department name, as well as methods that override the Person methods to accept and display all CollegeEmployee data.

3.Faculty—Faculty descends from CollegeEmployee. This class also includes a Boolean field that indicates whether the Faculty member is tenured, as well as methods that override the CollegeEmployee methods to accept and display this additional piece of information.

4.Student—Student descends from Person. In addition to the fields available in Person, a Student contains a major field of study and a grade point average as well as methods that override the Person methods to accept and display these additional facts.

The main class CollegeList declares an array of four “regular” CollegeEmployees, three Faculty, and seven Students. It Prompts the user to specify which type of person’s data will be entered (C, F, or S), or allow the user to quit (Q). While the user chooses to continue (that is, does not quit), accept data entry for the appropriate type of Person. If the user attempts to enter data for more than four CollegeEmployees, three Faculty, or seven Students, it will display an error message. When the user quits, it will display a report on the screen listing each group of Persons under the appropriate heading of “College Employees,” “Faculty,” or “Students.” If the user has not entered data for one or more types of Persons during a session, it displays a message under the appropriate heading. 
