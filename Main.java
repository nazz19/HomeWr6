import group.GroupOfStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroupOfStudent groupOfStudent = new GroupOfStudent();
        System.out.println("Type how many students you`d like to add: ");
        Scanner addI = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Index №: ");
            int index = scanner.nextInt();
            System.out.println("Name : ");
            String name = scanner.next();
            System.out.println("Faculty : ");
            String faculty = scanner.next();
            System.out.println("Average grade : ");
            double grade = Double.parseDouble(scanner.next());
            groupOfStudent.addStudent(index, name, faculty, grade);
        }

        System.out.println("Type index of who do you want to remove");
        int indexRemove = scanner.nextInt();
        groupOfStudent.removeStudent(indexRemove);

        System.out.println("Index of a student you want to change: ");
        int indexS = scanner.nextInt();
        System.out.println("New name for a student:");
        String newName = scanner.next();
        groupOfStudent.changeName(indexS, newName);

        System.out.println("New faculty for a student:");
        String newFaculty = scanner.next();
        groupOfStudent.changeFaculty(indexS, newFaculty);

        System.out.println("New average grage for a student:");
        Double newGrade = Double.parseDouble(scanner.next());
        groupOfStudent.changeAverageGrade(indexS, newGrade);

        groupOfStudent.printAllStudents();
    }
}
