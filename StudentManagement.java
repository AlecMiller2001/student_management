import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addNewStudent() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter student ID: ");
        String studentID = scanner.nextLine();
        Student student = searchStudentByID(studentID);
        if(student==null) {
            
            students.add(new Student(name, email, phoneNumber, studentID));
            System.out.println();
        } else {
            System.out.println("This ID is already assigned to another student.");
        }
        //students.add(new Student(name, email, phoneNumber, studentID));
        
        System.out.println("A new student has been added successfully");
    }
    
    public void displayAllStudents() {
        //System.out.println(students);//Does not print objects,
        if(students.isEmpty()) {
            System.out.println("The database does not have any student records!");
        } else {
            for(Student i : students) {
                i.displayInfo();
            }
        }
    }
    
    //Enroll by ID;
    public void enrollStudent() {
        System.out.println("Enter studentID");
        String ID = scanner.nextLine();
        Student enrollStudent = searchStudentByID(ID); //This line is tricky
        if(enrollStudent!=null) {
            System.out.println("Enter course name: ");            
            String courseName = scanner.nextLine();
            if(enrollStudent.getCourseList().toLowerCase().contains(courseName.toLowerCase())) {
                System.out.print("Student already enrolled for this course!");
            } else {
                
                enrollStudent.addCourse(courseName);
            }
            enrollStudent.addCourse(courseName);
        } else {
            
            System.out.println("Student not found!");
        }
    }
    
    //This getter will return an object such as Student class
    public Student searchStudentByID(String ID) {
        for(Student i:students) {
            if(i.getID().equals(ID)) {
                return i;
            }
        }
        return null;
    }
    
    public void unEnrollStudent() {
        System.out.println("Enter studentID");
        String ID = scanner.nextLine();
        Student unEnrollStudent = searchStudentByID(ID); //This line is tricky
        if(unEnrollStudent!=null) {
            System.out.println("Enter course name: ");            
            String courseName = scanner.nextLine();
            if(unEnrollStudent.getCourseList().toLowerCase().contains(courseName.toLowerCase())) {
                unEnrollStudent.removeCourse(courseName);
                
            } else {
                System.out.print("Student is not enrolled for this course!");
                
            }
            unEnrollStudent.removeCourse(courseName);
        } else {
            
            System.out.println("Student not found!");
        }
    }
    
    
    //unenroll student from specific courseName
    //ask user to ener student ID, if found then ask courseName
    //Ensure entered courseName is found, if so -
    //- then remove that course from this specific student.
    
    
    
    
    
    //addNewStudent
    //searchStudentByID
    //findStudentByName
    //enrollStudent
    //displayAllStudents
    //showStudentsByCourseName
    //unenrollStudent
}
















///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author alect
// */
//public class StudentManagement {
//    
//}
