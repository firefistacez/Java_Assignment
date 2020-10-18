Exception Handling

A company accepts user orders by part numbers interactively. Users might make the following errors
as they enter data:
 The part number is not numeric. u The quantity is not numeric.
 The part number is too low (less than 0).
 The part number is too high (more than 999).
 The quantity ordered is too low (less than 1).
 The quantity ordered is too high (more than 5,000).
Create a class that stores an array of usable error messages; save the file as DataMessages.java. Create a
DataException class; each object of this class will store one of the messages. Save the file as
DataException.java. Create an application that prompts the user for a part number and quantity. Allow
for the possibility of non numeric entries as well as out-of-range entries, and display the appropriate
message when an error occurs. If no error occurs, display the message “Valid entry”. Save the program
as PartAndQuantityEntry.java.