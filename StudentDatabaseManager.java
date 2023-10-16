import java.util.ArrayList; 

import java.util.Scanner; 

 

class Student { 

    String name; 

    int age; 

    double grade; 

 

    public Student(String name, int age, double grade) { 

        this.name = name; 

        this.age = age; 

        this.grade = grade; 

    } 

 

    @Override 

    public String toString() { 

        return "Name: " + name + ", Age: " + age + ", Grade: " + grade; 

    } 

} 

 

public class StudentDatabaseManager { 

 

    private ArrayList<Student> studentDatabase = new ArrayList<>(); 

 

    public void addStudent() { 

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter student name: "); 

        String name = scanner.nextLine(); 

        System.out.print("Enter student age: "); 

        int age = Integer.parseInt(scanner.nextLine()); 

        System.out.print("Enter student grade: "); 

        double grade = Double.parseDouble(scanner.nextLine()); 

 

        Student student = new Student(name, age, grade); 

        studentDatabase.add(student); 

        System.out.println("Student added successfully!"); 

    } 

 

    public void displayAllStudents() { 

        if (studentDatabase.isEmpty()) { 

            System.out.println("No students found."); 

        } else { 

            for (Student student : studentDatabase) { 

                System.out.println(student); 

            } 

        } 

    } 

 

    public void searchStudentByName() { 

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the name of the student you want to search for: "); 

        String searchName = scanner.nextLine(); 

        boolean found = false; 

 

        for (Student student : studentDatabase) { 

            if (student.name.equalsIgnoreCase(searchName)) { 

                System.out.println("Student found - " + student); 

                found = true; 

                break; 

            } 

        } 

 

        if (!found) { 

            System.out.println("Student not found."); 

        } 

    } 

 

    public static void main(String[] args) { 

        StudentDatabaseManager manager = new StudentDatabaseManager(); 

        Scanner scanner = new Scanner(System.in); 

 

        while (true) { 

            System.out.println("===== Student Database Manager ====="); 

            System.out.println("1. Add a student"); 

            System.out.println("2. Display all students"); 

            System.out.println("3. Search for a student by name"); 

            System.out.println("4. Exit"); 

            System.out.print("Enter your choice (1-4): "); 

 

            int choice = Integer.parseInt(scanner.nextLine()); 

 

            switch (choice) { 

                case 1: 

                    manager.addStudent(); 

                    break; 

                case 2: 

                    manager.displayAllStudents(); 

                    break; 

                case 3: 

                    manager.searchStudentByName(); 

                    break; 

                case 4: 

                    System.out.println("Exiting the program. Goodbye!"); 

                    scanner.close(); 

                    System.exit(0); 

                    break; 

                default: 

                    System.out.println("Invalid choice. Please try again."); 

            } 

        } 

    } 

} 
