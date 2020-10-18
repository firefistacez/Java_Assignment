Exception Handling

Write an application that displays a series of at least 10 students ID numbers (that you have
stored in an array) and asks the user to enter a test letter grade for the student. Create an
Exception class named GradeException that contains a static public array of valid grade letters
(‘A’, ‘B’, ‘C’, ‘D’, ‘F’, and ‘I’), which you can use to determine whether a grade entered from
the application is valid. In your application, throw a GradeException if the user does not enter a
valid letter grade. Catch the GradeException and then display an appropriate message. In
addition, store an ‘I’ (for Incomplete) for any student for whom an exception is caught. At the
end of the application, display all the student IDs and grades. Save the files as
GradeException.java and TestGrade.java.