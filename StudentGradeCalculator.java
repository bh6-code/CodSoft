import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of subjects
        System.out.print("How many subjects? ");
        int numberOfSubjects = scanner.nextInt();

        // Array to store marks of each subject
        int[] marks = new int[numberOfSubjects];

        // Input marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        scanner.close();

        // Calculate total marks and average percentage
        float totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        float percentage = (totalMarks / numberOfSubjects);

        // Determine grade based on percentage
        String grade;
        if (percentage > 90) {
            grade = "A1 grade";
        } else if (percentage > 80) {
            grade = "A2 grade";
        } else if (percentage > 70) {
            grade = "B1 grade";
        } else if (percentage > 60) {
            grade = "B2 grade";
        } else if (percentage > 50) {
            grade = "C1 grade";
        } else if (percentage > 40) {
            grade = "C2 grade";
        } else if (percentage >= 35) {
            grade = "D grade";
        } else if (percentage > 20) {
            grade = "E grade and you are fail";
        } else {
            grade = "E2 grade and you are fail";
        }

        // Output results
        System.out.println("\n----- Results -----");
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

