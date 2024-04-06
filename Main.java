import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to calculate the arithmetic average of grades from various subjects.");

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        double[][] grades = new double[numberOfSubjects][];

        for(int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the number of grades for subject " + (i + 1) + ": ");
            int numberOfGrades = scanner.nextInt();
            grades[i] = new double[numberOfGrades];

            for(int j = 0; j < numberOfGrades; j++) {
                System.out.print("Enter grade number " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble();
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
    }
}