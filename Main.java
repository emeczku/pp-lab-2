import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Task 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to calculate the arithmetic average of grades from various subjects.");

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        double[][] grades = new double[numberOfSubjects][];

        for(int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the number of grades for subject " + (i + 1) + ": ");
            int numberOfGrades = scanner.nextInt();
            grades[i] = new double[numberOfGrades];

//            Task 2 && 4
            for (int j = 0; j < numberOfGrades; j++) {
                int grade = 0;
                while (grade <= 0 || grade > 6) {
                    System.out.print("Enter grade number " + (j + 1) + " (1-5): ");
                    grade = scanner.nextInt();
                    if (grade > 0 && grade <= 5) {
                        grades[i][j] = grade;
                    } else {
                        System.out.println("Invalid grade, please enter a grade between 1 and 6.");
                    }
                }
            }
        }


        double sum = 0;
        int totalNumberOfGrades = 0;
        for (double[] grade : grades) {
            for (double v : grade) {
                sum += v;
                totalNumberOfGrades++;
            }
        }
        double average = sum / totalNumberOfGrades;

        System.out.print("The average grade is " + average);

//        Task 3
        for (double[] grade : grades) {
            double sumOfGrades = 0;
            int numberOfGrades = 0;
            for (double v : grade) {
                sumOfGrades += v;
                numberOfGrades++;
                System.out.println("Grade: " + v);
            }
            System.out.println();
            System.out.println("Total sum of grades is " + sumOfGrades);
            System.out.println("Average sum of this grades is " + sumOfGrades / numberOfGrades);
        }

//        Task 5
        for (int i = 0; i < grades.length; i++) {
            double subjectMedian = calculateMedian(grades[i]);
            System.out.println("Subject " + (i + 1) + " - Median: " + subjectMedian);
        }

    }
    public static double calculateMedian(double[] grades) {
        int length = grades.length;
        Arrays.sort(grades);
        if (length % 2 == 0) {
            return (grades[length / 2 - 1] + grades[length / 2]) / 2.0;
        } else {
            return grades[length / 2];
        }
    }
}