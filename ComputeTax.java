import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filing status
        System.out.print("(0 - single filer, 1 - married jointly or " +
        "qualifying widow(er), 2 - married separately, 3 - head of " + 
        "household) Enter the filing status: ");

        int status = input.nextInt();

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Compute tax
        double tax = 0;

        // Declare income ceilings
        double incomeCeilingOne, incomeCeilingTwo,incomeCeilingThree, incomeCeilingFour, incomeCeilingFive;

        if (status == 0) {
            incomeCeilingOne = 8350;
            incomeCeilingTwo = 33950;
            incomeCeilingThree = 82250;
            incomeCeilingFour = 171550;
            incomeCeilingFive = 372950;

            if (income <= incomeCeilingOne) {
                tax = income * 0.10;
            }
            else if (income <= incomeCeilingTwo) {
                tax = incomeCeilingOne * 0.10 + (income - incomeCeilingOne) * 0.15;
            }
            else if (income <= incomeCeilingThree) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (income - incomeCeilingTwo) * 0.25;
            }
            else if (income <= incomeCeilingFour) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (income - incomeCeilingThree) * 0.28;
            }
            else if (income <= incomeCeilingFive) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (incomeCeilingFour - incomeCeilingThree) * 0.28 +
                (income - incomeCeilingFour) * 0.33;
            }
            else {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (incomeCeilingFour - incomeCeilingThree) * 0.28 +
                (incomeCeilingFive - incomeCeilingFour) * 0.33 + (income - incomeCeilingFive) * 0.35;
            }
        }
        else if (status == 1) {
            incomeCeilingOne = 16700;
            incomeCeilingTwo = 67900;
            incomeCeilingThree = 137050;
            incomeCeilingFour = 208850;
            incomeCeilingFive = 372950;

            if (income <= incomeCeilingOne) {
                tax = income * 0.10;
            }
            else if (income <= incomeCeilingTwo) {
                tax = incomeCeilingOne * 0.10 + (income - incomeCeilingOne) * 0.15;
            }
            else if (income <= incomeCeilingThree) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (income - incomeCeilingTwo) * 0.25;
            }
            else if (income <= incomeCeilingFour) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (income - incomeCeilingThree) * 0.28;
            }
            else if (income <= incomeCeilingFive) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (incomeCeilingFour - incomeCeilingThree) * 0.28 +
                (income - incomeCeilingFour) * 0.33;
            }
            else {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (incomeCeilingFour - incomeCeilingThree) * 0.28 +
                (incomeCeilingFive - incomeCeilingFour) * 0.33 + (income - incomeCeilingFive) * 0.35;
            }
        }
        else if (status == 2) {
            incomeCeilingOne = 8350;
            incomeCeilingTwo = 33950;
            incomeCeilingThree = 68525;
            incomeCeilingFour = 104425;
            incomeCeilingFive = 186475;

            if (income <= incomeCeilingOne) {
                tax = income * 0.10;
            }
            else if (income <= incomeCeilingTwo) {
                tax = incomeCeilingOne * 0.10 + (income - incomeCeilingOne) * 0.15;
            }
            else if (income <= incomeCeilingThree) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (income - incomeCeilingTwo) * 0.25;
            }
            else if (income <= incomeCeilingFour) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (income - incomeCeilingThree) * 0.28;
            }
            else if (income <= incomeCeilingFive) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (incomeCeilingFour - incomeCeilingThree) * 0.28 +
                (income - incomeCeilingFour) * 0.33;
            }
            else {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (incomeCeilingFour - incomeCeilingThree) * 0.28 +
                (incomeCeilingFive - incomeCeilingFour) * 0.33 + (income - incomeCeilingFive) * 0.35;
            }
        }
        else if (status == 3) {
            incomeCeilingOne = 11950;
            incomeCeilingTwo = 45500;
            incomeCeilingThree = 117450;
            incomeCeilingFour = 190200;
            incomeCeilingFive = 372950;

            if (income <= incomeCeilingOne) {
                tax = income * 0.10;
            }
            else if (income <= incomeCeilingTwo) {
                tax = incomeCeilingOne * 0.10 + (income - incomeCeilingOne) * 0.15;
            }
            else if (income <= incomeCeilingThree) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (income - incomeCeilingTwo) * 0.25;
            }
            else if (income <= incomeCeilingFour) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (income - incomeCeilingThree) * 0.28;
            }
            else if (income <= incomeCeilingFive) {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (incomeCeilingFour - incomeCeilingThree) * 0.28 +
                (income - incomeCeilingFour) * 0.33;
            }
            else {
                tax = incomeCeilingOne * 0.10 + (incomeCeilingTwo - incomeCeilingOne) * 0.15 +
                (incomeCeilingThree - incomeCeilingTwo) * 0.25 + (incomeCeilingFour - incomeCeilingThree) * 0.28 +
                (incomeCeilingFive - incomeCeilingFour) * 0.33 + (income - incomeCeilingFive) * 0.35;
            }
        }
        else {
            // Display wrong status
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        // Display the result
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }
}