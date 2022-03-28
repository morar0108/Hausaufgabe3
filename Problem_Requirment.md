# Hausaufgabe3

A university needs a small application where students can register for a particular course. 
Each course has a name, an teacher, a maximum number of students, a list of enrolled students, and the number of credits. 
Each student is a person who also has a student ID, a number of credits enrolled, and a list of courses enrolled.
Create an application that lets you add, delete, modify, and retrieve information about the course and students.

1.The application allows students to register for a specific course. 
If there are no seats available for the course, the student receives a warning message and must select another course from the list of available ones.

2.the application allows you to view the courses that have available seats and their number

3.The application allows you to view students who have enrolled in a particular course

4.with the application you can view all available courses

5. each student can choose courses up to 30 credits. 
If the student wants to select a course and will exceed the number of credits, he will receive an error message and the course will not be added to his course list.
a. Any change in the number of credits in a course will implicitly affect the total number of credits a student has when enrolled in that course.
b. The instructor may delete the course he/she is teaching and the students will be deleted from the list of that course.

The application takes into account the Model View Controller pattern. 
The required repositories are located in memory (lists loaded directly from the code before the program is executed) and implement the generic IRepository interface. 

Solve the following:
1.Model this application and implement logic up to Repository Layer
2.Implement Model, Implement InMemoryRepository, ICrudRepository for all necessary classes;
3.Test functionality through JUnits;
4.Generate Javadocs;

Challenges:
->Getters and Setters for all Model classes
->Collections Framework
->Implement MVC pattern
->JUnits
