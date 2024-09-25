package sumedha_practice;
//Base class Person
class Person {
 private String firstName;
 private String lastName;

 // Constructor for Person
 public Person(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }

 // Method to get the first name
 public String getFirstName() {
     return firstName;
 }

 // Method to get the last name
 public String getLastName() {
     return lastName;
 }
}

//Subclass Employee that extends Person
class Employee extends Person {
 private String employeeId;
 private String jobTitle;

 // Constructor for Employee
 public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
     super(firstName, lastName);  // Calling the constructor of Person
     this.employeeId = employeeId;
     this.jobTitle = jobTitle;
 }

 // Method to get the employee ID
 public String getEmployeeId() {
     return employeeId;
 }

 // Overriding the getLastName() method
 @Override
 public String getLastName() {
     return super.getLastName() + " (Job Title: " + jobTitle + ")";
 }
}

//Main class to test the functionality
public class PersonDemo {
 public static void main(String[] args) {
     // Creating a Person object
     Person person = new Person("John", "Doe");
     
     // Creating an Employee object
     Employee employee = new Employee("Alice", "Smith", "E123", "Software Engineer");
     
     // Displaying information
     System.out.println("Person First Name: " + person.getFirstName());
     System.out.println("Person Last Name: " + person.getLastName());
     
     System.out.println("\nEmployee First Name: " + employee.getFirstName());
     System.out.println("Employee Last Name: " + employee.getLastName());
     System.out.println("Employee ID: " + employee.getEmployeeId());
 }
}
