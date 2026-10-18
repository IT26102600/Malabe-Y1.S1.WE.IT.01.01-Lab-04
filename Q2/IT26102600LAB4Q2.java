
import java.util.Scanner;

public class IT26102600LAB4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double examMarks, labMarks;
        double examPercentage, labPercentage;
        double finalMark;

        // Input and validate exam marks
        do {
            System.out.print("Enter exam marks (0-100): ");
            examMarks = input.nextDouble();

            if (examMarks < 0 || examMarks > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
            }
        } while (examMarks < 0 || examMarks > 100);

        // Input and validate lab marks
        do {
            System.out.print("Enter lab submission marks (0-100): ");
            labMarks = input.nextDouble();

            if (labMarks < 0 || labMarks > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
            }
        } while (labMarks < 0 || labMarks > 100);

        // Input and validate percentages
        do {
            System.out.print("Enter exam percentage: ");
            examPercentage = input.nextDouble();

            System.out.print("Enter lab percentage: ");
            labPercentage = input.nextDouble();

            if (examPercentage + labPercentage != 100) {
                System.out.println("Invalid percentages! They must add up to 100.");
            }
        } while (examPercentage + labPercentage != 100);

        // Calculate final module mark
        finalMark = (examMarks * examPercentage / 100)
                  + (labMarks * labPercentage / 100);

        // Display the final mark
        System.out.println("Final module mark: " + finalMark);

        input.close();
    }
}
