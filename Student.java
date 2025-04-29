import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> courses = new ArrayList<>();
    private String studentID;
    public Student(String name, String email, String phoneNumber, String studentID) {
        super(name, email, phoneNumber);
        this.studentID = studentID;
    }
    public void addCourse(String courseName) {
        courses.add(courseName);
    }
    
    //This is a self-made function
    public void removeCourse(String courseName) {
        courses.remove(courseName);
    }
    public String getID() {
        return studentID;
    }
    
    public String getCourseList() {
        return courses.isEmpty() ? "NONE": String.join(",",courses);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID " + studentID);
        System.out.println("Courses " + (courses.isEmpty() ? "no courses so far": String.join(studentID)));
    }
}














//////*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author alect
// */
//public class Student {
//    
//}
