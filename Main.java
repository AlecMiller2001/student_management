import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement newCollection = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Welcome back! Make a choice");
            System.out.println("1. Add student");
            System.out.println("2. Enrol new course.");
            System.out.println("3. Display all students.");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    newCollection.addNewStudent();
                    
                    break;
                 
                case 2:
                    newCollection.enrollStudent();
                    
                    break;
                    
                case 3:
                    newCollection.displayAllStudents();
                    break;
                    
                case 4:
                    System.out.println("Goodbye!");
                    return;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }
        
//        newCollection.addNewStudent();
//        newCollection.displayAllStudents();
//        newCollection.enrollStudent();
//        newCollection.displayAllStudents();
//        newCollection.enrollStudent();
    }
    
}
