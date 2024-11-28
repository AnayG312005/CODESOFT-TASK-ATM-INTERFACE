import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for marks and results
        double math, dsa, programming, aiML, statistics, dataAnalysis, bigData, cloudArchitecture, os, dbms;
        double total, averagePercentage, cgpa;
        char grade;

        System.out.println(" =====Student Grade Calculator===== ");
        System.out.println("\t Developed by Anay Gupta\n");

        // Get input from the user for marks obtained in each subject
        System.out.print("Enter marks for Mathematics for Data Science (out of 100): ");
        math = scanner.nextDouble();

        System.out.print("Enter marks for Data Structure and Algorithms (out of 100): ");
        dsa = scanner.nextDouble();

        System.out.print("Enter marks for Programming Fundamentals (out of 100): ");
        programming = scanner.nextDouble();

        System.out.print("Enter marks for Artificial Intelligence & Machine Learning (out of 100): ");
        aiML = scanner.nextDouble();

        System.out.print("Enter marks for Statistics (out of 100): ");
        statistics = scanner.nextDouble();

        System.out.print("Enter marks for Data Analysis (out of 100): ");
        dataAnalysis = scanner.nextDouble();

        System.out.print("Enter marks for Big Data Analytics (out of 100): ");
        bigData = scanner.nextDouble();

        System.out.print("Enter marks for Cloud Architecture (out of 100): ");
        cloudArchitecture = scanner.nextDouble();

        System.out.print("Enter marks for Operating System (out of 100): ");
        os = scanner.nextDouble();

        System.out.print("Enter marks for Database Management System (out of 100): ");
        dbms = scanner.nextDouble();

        // Calculate total marks
        total = math + dsa + programming + aiML + statistics + dataAnalysis + bigData + cloudArchitecture + os + dbms;

        // Calculate average percentage
        averagePercentage = (total / 1000) * 100;

        // Determine grade based on average percentage
        if (averagePercentage >= 90) {
            grade = 'A';  // Excellent
        } else if (averagePercentage >= 75) {
            grade = 'B';  // Good
        } else if (averagePercentage >= 60) {
            grade = 'C';  // Average
        } else if (averagePercentage >= 50) {
            grade = 'D';  // Pass
        } else {
            grade = 'F';  // Fail
        }

        // Calculate CGPA (convert each subject's marks into grade points, then average them)
        cgpa = calculateCGPA(math, dsa, programming, aiML, statistics, dataAnalysis, bigData, cloudArchitecture, os, dbms);

        // Output the results
        System.out.println("\nTotal Marks: " + total + " / 1000");
        System.out.println("Average Percentage: " + averagePercentage + " %");
        System.out.println("Grade: " + grade);
        System.out.println("CGPA: " + cgpa);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate CGPA based on marks
    public static double calculateCGPA(double... marks) {
        double totalGradePoints = 0.0;

        for (double mark : marks) {
            totalGradePoints += markToGradePoint(mark);
        }

        return totalGradePoints / marks.length;
    }

    // Method to convert marks to grade points
    public static double markToGradePoint(double mark) {
        if (mark >= 90) return 10.0; // A+
        else if (mark >= 80) return 9.0; // A
        else if (mark >= 70) return 8.0; // B
        else if (mark >= 60) return 7.0; // C
        else if (mark >= 50) return 6.0; // D
        else return 0.0; // F
    }
}
